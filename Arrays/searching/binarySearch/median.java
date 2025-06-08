public class median {
    public static void main(String[] args) {
        int[][] mat = {{1 ,2 ,3 ,4, 5},
            {8 ,9, 11 ,12, 13},
            {21,23,25,27,29}};
        int low = mat[0][0];
        int high = mat[mat.length-1][mat[0].length-1];
        int required = (mat.length * mat[0].length)/2; 
        while(low<=high){
            int mid = low + (high-low)/2;
            int lesser = findLesserThanandEqual(mat, mid);
            if(lesser > required){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        // return low;

        System.out.println(low);
    }


    public static int findLesserThanandEqual(int[][] mat,int mid){
        int sum = 0;
        for (int i =0; i<mat.length;i++){
            sum = sum + ub(mat[i],mid);
        }
        return sum;
    }


    public static int ub(int[] mat,int target){
        int low = 0;
        int high = mat.length-1;
        int ans = mat.length;
        while(low<=high){
            int mid = low + (high-low)/2;
        
            if (mat[mid] > target){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
}
