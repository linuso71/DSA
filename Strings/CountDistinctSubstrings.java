import java.util.HashSet;
// import java.util.Set;
import java.util.Arrays;

public class CountDistinctSubstrings {
    public static void main(String[] args) {
        String s = "ababa";
        // HashSet<String> st = new java.util.HashSet<>();
        
        // for (int i=0;i<s.length();i++){
        //     for(int j=i;j<s.length();j++){
        //         st.add(s.substring(i, j+1));
        //     }
        // }
        // System.out.println(st);
        System.out.println(countDistictSubstring(s));
    }

    public static int countDistictSubstring(String s){
        int n = s.length();
		String[] arr = new String[n];
        for (int i=0;i<n;i++){
            arr[i] = s.substring(i);
        }

		int totalSubstring = (n*(n+1))/2;
		Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
		int lcpSum = 0;
		for (int i=0;i<arr.length-1;i++){
			lcpSum += lcp(arr[i],arr[i+1]);
		}

		return totalSubstring - lcpSum +1;


		

	}


	static int lcp(String a,String b){
		int len = Math.min(a.length(), b.length());
        int i = 0;
        while (i < len && a.charAt(i) == b.charAt(i)) {
            i++;
        }
        System.out.println(i);
        return i;
	}
}
