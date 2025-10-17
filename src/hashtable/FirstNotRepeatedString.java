package hashtable;

import java.util.HashMap;
import java.util.Map;

public class FirstNotRepeatedString {


    public static char checkRepeatedValues(String str){
        Map<Character,Integer> map = new HashMap<>();
        var chars = str.toCharArray();
        for(char ch :chars){
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch,count+1);
        }

        for(char ch :chars){
            if(map.get(ch) == 1){
                return ch;
            }
        }
        return Character.MIN_VALUE;

    }

    public static void main(String[] args) {
        String str = "a green apple";
        var ch = checkRepeatedValues(str);
        System.out.println(ch);

    }
}
