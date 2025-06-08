public class odd_number_1903 {
    public static void main(String[] args) {
        String num = "7542351161";
        System.out.println(odd_number(num));
    }

    static int odd_number(String num){
        int maxi = 0;
        int end = num.length();
        for (int i = 0; i < num.length(); i++){
            String sub_str = num.substring(i, end);
            // System.out.println(sub_str.charAt(sub_str.length() - 1));
            char lastChar = sub_str.charAt(sub_str.length() - 1);
            if (lastChar != '0'){
                int temp = lastChar - '0'; // Convert character to integer
                if (temp % 2 != 0){
                    if (temp > maxi){
                        maxi = temp;
                    }
                }
            }
        }
        return maxi;
    }
}