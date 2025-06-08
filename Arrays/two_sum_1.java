import java.util.Arrays;
import java.util.HashMap;

public class two_sum_1 {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(two_sum_optimal_sol(nums, target)));

    }


    static int[] two_sum_optimal_sol(int[] nums,int target){
        // two pointer method

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            if (nums[i] + nums[j] == target){
                return new int[]{i,j};
            }
            else if (nums[i] + nums[j] < target) {
                i++;
            }
            else{
                j--;
            }
        }


        
        return new int[]{-1,-1};
    }

    static int[] two_sum_better_sol(int[] nums, int target){
        // hashmap method
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if (!map.containsKey(target - nums[i])){
                map.put(nums[i], i);
            }
            else{
                int result = map.get(target - nums[i]);
                return new int[]{result,i};
            }
        }

        System.out.println(map);
        
        return new int[]{-1,-1};
    }
    
}
