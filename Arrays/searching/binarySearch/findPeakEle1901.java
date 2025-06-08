public class findPeakEle1901 {
    public static void main(String[] args) {
        int[][] mat = {{10,20,15},{21,30,14},{7,16,12}};
        
        int low = 0;
        int high = mat.length-1;
        while(low<=high){
            int n = mat[0].length;
            int mid = low + (high - low)/2;
            System.out.println("mid"+mid);
            int row = maxElement(mat,mid);
            System.out.println("row"+row);
            System.out.println(mat[row][mid]);

            int left = mid -1 >=0 ? mat[row][mid -1 ] : -1;
            int right = mid + 1 < n? mat[row][mid +1] : -1;
            if((mat[row][mid] > left) && (mat[row][mid] > right)){
                System.out.println(row);
                System.out.println(mid);
                break;
            }
            else if(mat[row][mid] > left){
                low = mid +1;
            }
            else{
                high = mid-1;
            }

        }

    }

    static int maxElement(int[][] matrix,int mid){
        int max = -1;
        int index = -1;
        int m = matrix.length;
        for (int i =0;i<m;i++){
            if (matrix[i][mid]>max){
                max = matrix[i][mid];
                index = i;
            }
        }
    
        return index;
    }


}
