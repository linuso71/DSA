public class minimum_jumps {
    public static void main(String[] args) {
        int[] arr = {1,2,5,8,9,2,6,7,8,9};
        System.out.println(min_jumps(arr));
        
    }
    public static int min_jumps(int[] arr){
        int i =0;
        int count = 0;
        while(i<=arr.length){
            if (arr[i] == 0){
                return -1;
            }
            if(arr[i]<=arr.length-1){
                i += arr[i];
                count ++;
                
            }
            
        }   
        
        
        return count;
    }

}

