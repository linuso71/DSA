import java.util.HashMap;

public class single_number_136{
    public static void main(String[] args){
        int[] arr = {2,2,1,1,-1};
        xor_sol(arr);
        brute_force(arr);
    }

    static int xor_sol(int[] arr){
        int xor = 0;
        for(int i=0;i<arr.length;i++){
            xor = xor ^ arr[i];
        }
        return xor;
        
    
    }

    static void brute_force(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for (int key : map.keySet()){
            if (map.get(key) ==1){
                System.out.println(key);            
            }
        }
    }
}