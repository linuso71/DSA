import java.util.Arrays;
import java.util.HashMap;

public class valid_anagram_242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(arraySolution(s, t));
        
    }


    static Boolean stackSolution(String s,String t){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i =0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }


        for (int i =0;i<t.length();i++){
            if (map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
            }
            else{
                return false;
            }
        }


        for (int val : map.values()){
            if (val > 0){
                return false;
            }
        }
        
        return true;
    }


    public static Boolean arraySolution(String s,String t){
        int[] arr = new int[26];
        
        for (int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }

        for (int i=0;i<t.length();i++){
            arr[t.charAt(i)-'a'] -= 1;
        }

        for (int i =0;i<arr.length;i++){
            if (arr[i] > 0){
                return false;
            }
        }
        
        return true;
    }
}
