public class findNumberOfOccurence{
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,0,13,13};
        int x = 13;
        int n = arr.length;
        int[] result = getFirstLast(arr,n,x);

        System.out.println(result[1] - result[0] );
    }

    static int[] getFirstLast(int arr[], int n,int x){
        int first = firstOccurrence(arr,n,x);
        int last = lastOccurrence(arr,n,x);

        System.out.println(first);
        System.out.println(last);

        if (first == n || arr[first] != x ){
            return new int[] {0,0};
        }
        else{
            return new int[]{first, last};
        }
    }

    public static int firstOccurrence(int arr[],int n,int x){
        int low = 0;
        int high = n -1;
        int ans = n;
        while(low<=high){
            int mid = low + (high - low)/2;
            if (arr[mid] >= x){
                high = mid - 1;
                ans = mid;
            }
            else{
                low  = mid +1;
            }
        }
        return ans;
    }

    public static int lastOccurrence(int arr[],int n,int x){
        int low = 0;
        int high = n -1;
        int ans = n;
        while(low<=high){
            int mid = low + (high - low)/2;
            if (arr[mid] > x){
                high = mid - 1;
                ans = mid;
            }
            else{
                low  = mid +1;
            }
        }
        return ans;
    }

}