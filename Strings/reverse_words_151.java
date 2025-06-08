import java.util.Arrays;
import java.util.Stack;

public class reverse_words_151 {
    public static void main(String[] args){
        // System.out.println("working...");
        String s = "the sky is blue";
        String b = "a good   example";
        String c = "";
        String d = "  hello world  ";
        System.out.println(reverse_string(d));
        // reverse_stack();
        // String[] words = b.split("\\s+");
        // for (int i = words.length-1; i >= 0; i--) {
        //     c += words[i] + " ";
        // }
        // System.out.println(c);
        // System.out.println(words[0]);
    }

    public static String reverse(String s){
        String[] new_s = s.split(" ");
        System.out.println(Arrays.toString(new_s));
        for(int i = 0; i < new_s.length / 2; i++){
            if (new_s[i] != null){
                if (new_s[i] != " ")
                System.out.println(new_s[i]+"---");
                String temp = new_s[i];
                new_s[i] = new_s[new_s.length - 1 - i];
                new_s[new_s.length - 1 - i] = temp;
            }
        }
        System.out.println(Arrays.toString(new_s));
        String output = String.join(" ",new_s).trim();
        return output;
    }

    static void reverse_stack(){
        String s = "a good   example";
        s += " ";
        Stack<String> st = new Stack<String>();
        int i;
        String str = "";
        for (i = 0;i < s.length();i++)
        {
            if (s.charAt(i) == ' ')
            {
                if (!str.isEmpty()){ // dont add if the string is empty
                st.push(str);
                str = "";
                }
            }
            else
            {
                str += s.charAt(i);
            }
        }
        String ans = "";
        while (st.size() != 1)
        {
            ans += st.peek() + " ";
            st.pop();
        }
        ans += st.peek(); // The last word should'nt have a space after it
        System.out.println("After reversing words: ");
        System.out.print(ans);
        
    }

    static String reverse_string(String s){
        int left = 0;
        int right = s.length()-1;
        String ans = "";
        String temp = "";
        while(left<=right){
            if (s.charAt(left) == ' ' && !temp.trim().isEmpty()){
                
                    System.out.println("tmep"+temp);
                    if (!ans.equals("")){
                        ans = temp + " " + ans;
                    }
                    else{
                        ans = temp;
                    }
                    temp = "";
            }
            else{
                temp += s.charAt(left);
            }
            left++;
            
        }

        if (!temp.equals("") && !temp.trim().isEmpty()){
            if (!ans.equals("")){
                ans = temp + " " + ans;
            }
            else{
                ans = temp;
            }
        }
        return ans;
    }
}
