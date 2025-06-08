import java.util.Arrays;

public class sum_of_beauty {
    public static void main(String[] args) {
        String s = "aabcbaa";
        int count = 0;
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<s.length();j++){
                String str = s.substring(i, j+1);
                int[] arr = new int[26];
                for (int k=0;k<str.length();k++){
                    arr[str.charAt(k)-'a']++;
                }
                System.out.println(str);
                // System.out.println(Arrays.toString(arr));
                
                int maxi = 0    ;
                int mini = Integer.MAX_VALUE;
                for(int l =0;l<arr.length;l++){
                    if (arr[l]>0){
                        maxi = Math.max(arr[l], maxi);
                        mini = Math.min(mini, arr[l]);
                    }
                    
                }
                // System.out.println(maxi-mini);
                
                count += (maxi-mini);
                
                
                
            }
        }
        System.out.println(count);
    }
}
