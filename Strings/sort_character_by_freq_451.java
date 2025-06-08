import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class sort_character_by_freq_451 {
    public static void main(String[] args) {
        String s = "treeetr";
        hashmapSolution(s);
    }


    static String hashmapSolution(String s){
        int maxi = 0;
        String t = "";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
                maxi = Math.max(maxi,map.get(s.charAt(i)));
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        System.out.println(maxi);
        System.out.println(map);

        List<Map.Entry<Character,Integer>> freqList = new ArrayList<>(map.entrySet());
        
        System.out.println(freqList);
        freqList.sort((a,b)->b.getValue()-a.getValue());
        System.out.println(freqList);

        for (int i=0;i<maxi;i++ ){

        }
        for(int val : map.values()){
            if (val == maxi){
                
            }
        }
        
    
        return "";
    }
}
