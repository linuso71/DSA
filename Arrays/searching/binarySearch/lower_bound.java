public class lower_bound{
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        int target = 2;
        int result = lowerBound(arr, target);
        System.out.println(result);     
    }

    public static int lowerBound(int[] nums, int x){
        int low = 0;
        int high = nums.length -1;
        int ans = -1;

        while (low<=high){
            int mid = low + (high - low)/2;
            if (nums[mid] > x){
                ans =  mid;                                                 
                high = mid -1;
            }
            else {
                low = mid+1;
            }
        }
        return ans;

    }
}