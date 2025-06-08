

public class sorted_rotated_1752 {
    public static void main(String[] args) {
        int[] arr = {6};
        System.out.println(check2(arr));
    }

    public static boolean check(int[] nums) {
        int count  = 1;
        int n = nums.length;
        if (n == 1){
            return true;
        }
        for (int i =1;i<2*n;i++){
            if (nums[(i-1)%n] <= nums[i%n]){
                count ++;
            }

            else {
                count =1;
            }
            System.out.println(count);
            if (count == n) return true;
        }
        return false;
    }

    public static boolean check2(int[] nums) {
        int count  = 1;
        int n = nums.length;
        for (int i =1;i<n*2;i++){
            if (nums[(i-1)%n] <= nums[i%n]){
                count ++;
            }
            else {
                count =1;
            }
            System.out.println(count);
            if (count == n) return true;
        }
        return false;
    }
}
