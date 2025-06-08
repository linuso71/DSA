public class rotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotate(s, goal));
    }
    public static Boolean rotate(String s,String goal){
        String new_s = s + s;
        // System.out.println(new_s);
        if (new_s.contains(goal)){
            return true;
        }
        return false;
    }
}
