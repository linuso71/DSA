import java.util.Stack;

public class remove_outermost_paranthesis_1021 {
    public static void main(String[] args) {
       String s = "(()())(())";
       Stack st = new Stack<>();
       String ans = "";
       System.out.println(remove_outer(s));
    //    for (int i = 0;i<s.length();i++){
    //         if (s.charAt(i) == '('){
                
    //             if (!st.isEmpty()){
    //                 System.out.println(st.isEmpty());
    //                 ans = ans + s.charAt(i);
    //             }
    //             st.push(s.charAt(i));
    //         }
    //         else{
    //             st.pop();
    //             if (!st.isEmpty()){
    //                 ans = ans + s.charAt(i);
    //             }
    //         }
    //         System.out.println("stack-> "+st);
    //         System.out.println("ans-> "+ ans);
    //    }
    //    System.out.println("output: "+ans);
       
    }

    static StringBuilder remove_outer(String s){
        StringBuilder ans = new StringBuilder();
        int  n= 0;
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i) == '('){
                
                if ( n != 0){
                    ans = ans.append(s.charAt(i));
                }
                n += 1;
            }
            else{
                n -= 1;
                if (n != 0){
                    ans = ans.append(s.charAt(i));
                }
            }
            System.out.println("stack-> "+n);
            System.out.println("ans-> "+ ans);
       }
       return ans;
    } 
}
