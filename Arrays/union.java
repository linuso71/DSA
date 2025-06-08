import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;

public class union {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {2,3,5,6};
        ArrayList<Integer>  result = efficient_apprach(arr1, arr2);
        System.out.println(result);
    }

    static int[] find_union_bruteforce(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int i =0;
        while(i< arr1.length && i < arr2.length){
            if (!map.containsKey(arr1[i])){
                map.put(arr1[i],1);
            }
            else{
                map.put(arr1[i],map.get(arr1[i])+1);
            }
            i++;
            
        }
        System.out.println(map);
        int[] union = new int[map.size()];
        System.out.println(map.size());
        for (int j = 0;j<map.size();j++){
            union[j] = (Integer) map.keySet().toArray()[j];
        }

        return union;
            
    }
    // set approach
    static HashSet<Integer> better_apprach(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for (int i =0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for (int i =0;i<arr2.length;i++){
            set.add(arr2[i]);
        }

        return set;
        

        
    }
    // two pointers approach
    static ArrayList<Integer> efficient_apprach(int[] arr1, int[] arr2){
        int i = 0;
        int j = 0;
        ArrayList<Integer> union = new ArrayList<>();
        while (i<arr1.length && j<arr2.length){
            if (arr1[i]<= arr2[j]){
        
                if (union.isEmpty() || union.getLast() != arr1[i]){
                    union.add(arr1[i]);
                    
                }
                i++;
             
            }
            else{
                if (union.isEmpty() || union.getLast() != arr2[j]){
                    union.add(arr2[j]);
                    
                }   
                j++; 
            }  
    }
    while(i<arr1.length){
        if (union.getLast() != arr1[i]){
            union.add(arr1[i]);
            
        } 
        i++;
    }
    while(j<arr2.length){
        if (union.getLast() != arr2[j]){
            union.add(arr2[j]);
           
        }
        j++;  
    }
    
    return union;
}
}
