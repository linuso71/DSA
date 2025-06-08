public class BinarySearch_2d_74{    
    public static void main(String[] args) {
        int[][] matrix = {{1}};
        int target = 2;
        int low  = 0;
        int high = matrix.length * matrix[0].length -1;
        while(low<=high){
            int mid  = low + (high-low)/2;
            int row = mid/matrix[0].length;
            int col = mid%matrix[0].length;
            System.out.println(row+""+col);
            if (matrix[row][col] == target){
                System.out.println("true");
                break;
            }
            else if (matrix[row][col] < target){
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        
        }
    }
}