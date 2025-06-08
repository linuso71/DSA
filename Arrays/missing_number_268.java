
import java.util.Arrays;
import java.util.HashMap;

public class missing_number_268 {
    public static void main(String[] args) {
        int[] arr = {3,0,1,2,5,4,7,6,9};
        System.out.println(optimal_sol2(arr));
        System.out.println(better_sol(arr));
        
}
    public static void sorting(int[] arr){
        for (int i =1;i<arr.length;i++){
            if (arr[i] < arr[i-1]){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
        }
    }

    public static int brute_force_1(int[] arr){
        sorting(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] != arr[i] -1){
                return arr[i-1]+1;                
            }
        }
        return -1;
    }

    public static int brute_force_2(int[] arr){
        for (int i=0;i<arr.length;i++){
            boolean flag = false;
            for (int j=0;j<arr.length;j++){
                if (arr[j] == i){
                    flag = true;
                    break;
                }               
            }
            if (!flag){
                return i;
            }
        }
        return -1;
    }

    public static int better_sol(int[] arr){
       int[] map = new int[arr.length+1];
       for(int i =0;i<arr.length;i++){
        map[arr[i]]++;
        }
        for (int i=0;i<map.length;i++){
            if (map[i] == 0){
                return i;
            }
        }
        return -1;                
    }

    public static int optimal_sol(int[] arr){
        int n = arr.length;
        int sum = (n*(n+1))/2;
        int sum_ele = 0;
        for (int i=0;i<arr.length;i++){
            sum_ele = sum_ele + arr[i];
        }

        return sum - sum_ele;

    }

    public static int optimal_sol2(int[] arr){
        int xor1 =0, xor2 = 0;
        for(int i=0;i<arr.length;i++){
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ i;
        }
        
        xor1 = xor1 ^ arr.length;
        System.out.println(xor1);
        System.out.println(xor2);
        
        return xor1 ^ xor2;
    }
}
