import java.util.Arrays;
import java.util.HashSet;

public class sum_largest_prime {
    public static void main(String[] args) {
        String s = "12234";
        System.out.println(checkPrime(17));
        int largest = 0;
        int secondLargest = 0;
        int thirdLargest = 0;

        // if (s.length() == 1){
        //     // int sum = Long.parseLong(s.charAt(0));
        // }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            for(int j =i+1;j<=s.length();j++){
                int sub = Integer.parseInt(s.substring(i, j));
                
                if (checkPrime(sub)){
                    System.out.println("working");
                    set.add(sub);
                }
            }
        }
        Object[] arr = set.toArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        
    
    }

    static Boolean checkPrime(int num){
        if (num == 0 || num == 1) {
        return false;
        }
        for (int i=2;i<=num/2;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
