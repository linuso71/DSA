import java.lang.reflect.Array;
import java.util.Arrays;

public class move_zero_283 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        move_zero(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void move_zero(int[] nums){
        int j = -1;
        for (int i=0;i<nums.length;i++){
            if (nums[i] == 0){
                j = i;
                break;
            }
        }
        System.out.println(j);

        if (j == -1) return;
        for (int i =j+1;i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

    }
}
