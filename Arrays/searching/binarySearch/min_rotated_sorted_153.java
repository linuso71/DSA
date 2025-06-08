public class min_rotated_sorted_153{
    public static void main(String[] args) {
        int[] nums = {2,1};
        int low = 0;
        int high = nums.length -1;
        int ans = Integer.MAX_VALUE;
        while (low<=high){
            int mid = low + (high -low)/2;
            System.out.println(mid);

            if (nums[low] <= nums[high]) {
                ans = Math.min(ans, nums[low]);
                break;
            }

            if (nums[low] <= nums[mid]){
                ans = Math.min(ans,nums[low]);
                low = mid +1;
                
            }
            else{
                ans = Math.min(ans,nums[mid]);
                high = mid -1;
            }
            System.out.println(ans);
        }
        System.out.println(ans);
    }
}