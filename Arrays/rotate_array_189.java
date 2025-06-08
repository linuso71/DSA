
import java.util.Arrays;

public class rotate_array_189 {
    public static void main(String[] args) {
        int[] nums = {-1};
        int k = 3;
        rotate_brute_force(nums, k);  
        System.out.println(Arrays.toString(nums));
    }

    
    public static void rotate_brute_force(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int[] temp = new int[nums.length];
        // putting element in the temp array
        for (int i = n - k; i< n ;i++){
            temp[i - n + k] = nums[i];
        }
        // shifting element to right side
        for (int i = n-k-1;i>=0;i--){
            nums[i+k] = nums[i];
        }
        // putting temp element in array in the starting position
        for (int i = 0;i<k;i++){
            nums[i] = temp[i];
        }
    }

}
