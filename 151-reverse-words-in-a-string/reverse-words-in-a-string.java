import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String words[]= s.split("\\s+");  //\\s+ used for multiple spaces or single spaces
        String ans="";
       // Collections.reverse(Arrays.asList(words));
        for(String word: words)
        {
            if(ans=="") ans=word;           //to avoid last space as first space will eventually
            else                            //become last
            ans=word +" " +ans;
        }
        return ans.toString();
    }
}