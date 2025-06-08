import java.util.HashMap;

public class common_char_1002 {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        findCommonChar(words);

    }

    static String[] findCommonChar(String[] words){
        HashMap<Character,Integer> word1 = createHashmap(words[0]);
        for (int i =1;i<words.length;i++){
            HashMap<Character,Integer> map = createHashmap(words[i]);
            for (HashMap.Entry<Character, Integer> entry : word1.entrySet()) {
                Character key = entry.getKey();
                Integer value = entry.getValue();
                // get value from the new map
                int mapValue = map.containsKey(key) ? map.get(key) : 0; 

                
                if (mapValue != value){
                        map.put(key,Math.min(mapValue, value));
                    }

                if (mapValue == 0){
                    
                }

                }
                
                System.out.println(word1);
        }
        // return word1;
        return new String[] {"null","null"};
    }

    static HashMap<Character,Integer> createHashmap(String word){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i =0;i<word.length();i++){

            map.merge(word.charAt(i),1, Integer::sum);
        }
        return map;
    }
}
