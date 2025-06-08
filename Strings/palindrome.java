public class palindrome {
    public static void main(String[] args) {
        String s = "abccba";
        int start = 0;
        int end = s.length()-1;
        while(start <= end){
            if (s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }
            else{
                System.out.println(s + " is not a palindrome");
                return;
            }
        }
        System.out.println(s + " is a palindrome");

    }

}
