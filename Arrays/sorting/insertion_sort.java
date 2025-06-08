import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4};
        selectionionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int findLargestElementIndex(int[] arr,int end_index){
        int largest = 0;
        int index = 0;
        for (int i =0 ;i<=end_index;i++){
            if (arr[i] > largest){
                largest = arr[i];
                index = i;
            }
        }
        return index;
        // return -1;
    }


    static void insertionSort(int[] arr){
        int i =arr.length-1;
        while(i>0){
            int index = findLargestElementIndex(arr, i);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            i--;
        }
        System.out.println(Arrays.toString(arr));
    }


    static void bubbleSort(int[] arr){
        int i = arr.length-1;
        while(i>=0){
            for (int j =1;j<=i;j++){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            i--;
        }
    }

    static void selectionionSort(int[] arr){
        for (int i =1;i<arr.length;i++){
            int j = i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
            j --;
        }
    
    }
}
