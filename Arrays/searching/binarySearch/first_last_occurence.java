public class first_last_occurence {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4};
        int target = 2;
        int lower = first_occ(arr, target);
        int upper = last_occ(arr, target);
        if ((lower == arr.length) || (arr[lower] != target)){
            System.out.println("not found in the array");
        } 
        upper = upper -1;
        System.out.println("lower:" + lower + " upper:"+  upper);

    }
    // loower bound
    static int first_occ(int[] arr,int target){
        int low = 0;
        int high = arr.length -1;
        int ans = arr.length;
        while(low<=high){
            int mid = (low + high )/2;
            if (arr[mid] >= target){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;

    }

    // upper bound
    static int last_occ(int[] arr,int target){
        int low = 0;
        int high = arr.length -1;
        int ans = arr.length;
        while(low<=high){
            int mid = (low + high )/2;
            if (arr[mid] > target){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;

    }

}
