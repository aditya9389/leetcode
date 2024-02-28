import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String sarr[]= s.split(" ");
        int pl=pattern.length();
        int sl=sarr.length;
        if(sl!=pl)
        return false;
        Map<Character,String> charToWord= new HashMap<>();
        Map<String,Character> wordToChar= new HashMap<>();
        for (int i = 0; i < pl; i++) {
            char ch = pattern.charAt(i);
            String word = sarr[i];

            if (charToWord.containsKey(ch)) {
                if (!charToWord.get(ch).equals(word))
                    return false;
            } else {
                charToWord.put(ch, word);
            }

            if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != ch)
                    return false;
            } else {
                wordToChar.put(word, ch);
            }
        }
        int i=0;
        for(char ch:pattern.toCharArray())
        {
            String ss=charToWord.get(ch);
            if(!ss.equals(sarr[i]))
            {
                return false;
            }
            i++;
        }
        return true;
    }
}