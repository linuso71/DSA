public class longest_common_14 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    static String longestCommonPrefix(String[] strs){
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i<strs.length;i++){ // looping over all the strings
            System.out.println(strs[i].indexOf(prefix));
            while (strs[i].indexOf(prefix) != 0){ // checking if the prefix is present in the string else reducing prefix
                prefix = prefix.substring(0,prefix.length()-1);
                if (prefix.isEmpty()) return "";
            }
        }
        
        return prefix;
        }
}
