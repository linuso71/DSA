import java.util.HashMap;

public class biweekly_158{
    public static void main(String[] args) {
        int[] x = {19,15,7,13};
        int[] y = {13,11,13,11};
        // System.out.println(maxSumDistinctTriplet(x,y));
        int[] prices = {439905949,666304906,328728050,996405752,379313886,528209791,88582883,939135548,751069794,109146128,883868801,685035870,872864534,515610456,671402135,299270187,782796059,14959721,863144680,901085624,622229387,536656476,257303050,868839354,117275933,918430202,935695732,478547107,484151756,631419928,39696098,650941214,51074234,941181946,265314584,557086091,786537782,50596574,28828693,157162091,9857934,451956750,695591748,879988702,249629554,539569656,282083076,39183395,66614080,479066152,652564309,907349719,210005879,768785742,537258749,237393978,346271286,392541722,312074103,126562356,400828204,614474102,364762040,8363356,539354781,90084496,319405489,644955686,889207045,798527610,141688158,529097227,598399178,87898767,830035760,49071715,600386530,40425784,322514114,778707680,79388396};
        int k = 2;
        System.out.println("Max Profit: " + maximumProfit(prices, k));


    }

    public static int maxSumDistinctTriplet(int[] x,int[] y){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0 ;i<x.length;i++){
            if (map.containsKey(x[i])){
                map.put(x[i], Math.max(map.get(x[i]) , y[i]));
            }
            else{
                map.put(x[i],y[i]);
            }    
        }


        int first = 0,second = 0,third = 0;
        for(int values:map.values()){
            if (values > first){
                third = second;
                second = first;
                first = values;
                
            }
            else if(values > second){
                third = second;
                second  = values;
            }
            else if (values > third){
                third = values;
            }

        }
        return first+second+third;
    }
    
    
    
    public static long maximumProfit(int[] prices, int k) {
        return dfs(prices, 0, k);
    }

    private static int dfs(int[] prices, int start, int transactionsLeft) {
        if (transactionsLeft == 0 || start >= prices.length) {
            return 0;
        }

        int maxProfit = 0;

        for (int i = start; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                
                if (prices[j] > prices[i]) {
                    int profit1 = prices[j] - prices[i] + dfs(prices, j + 1, transactionsLeft - 1);
                    maxProfit = Math.max(maxProfit, profit1);
                }

                
                if (prices[j] < prices[i]) {
                    int profit2 = prices[i] - prices[j] + dfs(prices, j + 1, transactionsLeft - 1);
                    maxProfit = Math.max(maxProfit, profit2);
                }
            }
        }

        return maxProfit;
    }

}
