public class single_element_sorted_540 {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        // int ans = 0;
        // for (int i =0;i<arr.length;i++){
        //     ans = ans ^ arr[i];
        // }
        // System.out.println(ans);
        System.out.println(binary_search_method(arr));
    }

    static int binary_search_method(int[] nums){
        int n = nums.length;
        if (n ==1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n-1] != nums[n-2]) return nums[n-1];
        int low = 1, high = n-2;
        while(low<=high){

            int mid = low + (high - low)/2;
            if (nums[mid] != nums[mid -1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }
            else if((mid %2 == 1 && nums[mid] == nums[mid-1]) || (mid % 2==0 && nums[mid] == nums[mid+1])){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return -1;
        
    }
}
