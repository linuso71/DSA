public class row_with_max_one_2643 {
    public static void main(String[] args) {
        int[][] mat = {{0,0,0},{0,0,1}};
        int m = mat.length -1;
        int n = mat[0].length -1;
        int ans = 0;
        int index = 0;
        for (int i=0;i<mat.length;i++){
            int count = 0;
            int upperIndex =  findUpperBound(mat,0,n,i);
            if(upperIndex != -1){
                count = n - findUpperBound(mat,0,n,i) + 1;
            }
            if (count>ans){
                ans = count;
                index = i;
            }
        }
        System.out.println(index+" "+ans);
    }
    public static int findUpperBound(int[][] arr,int low,int high,int row){
        int ans = -1;
        while(low<=high){
            int mid  = low + (high -low)/2;
            int col = mid%arr[0].length;
            
            if (arr[row][col] > 0){
                ans = col;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }


}
