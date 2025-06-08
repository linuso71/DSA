public class max_consecutive_ones_485{
    public static void main(String[] args){
        int[] arr = {1,1,0,1,1,1};
        System.out.println(max_consecutive(arr));
    }

    static int max_consecutive(int[] arr){
        int count = 0;
        int maxi = 0;
        for (int i =0;i<arr.length;i++){
            System.out.println(count);
            System.out.println(maxi);
            if (arr[i] == 0){
                count =0;
                continue;
            }
            count++;
            if (count>maxi){
                maxi = count;
                }
        }
        return maxi;
    }
    
}