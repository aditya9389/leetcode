import java.util.*;
class Solution {
    public int compress(char[] chars) {
        boolean reset=false;
        int len=1;
        List<Character> words= new ArrayList<>();
        for(int i=0;i<chars.length-1;i++)
        {
            if(chars[i]==chars[i+1])
            len++;
            else
            {
                words.add(chars[i]);
                if(len>1)
                for(char ch : Integer.toString(len).toCharArray())
                words.add(ch);
                len=1;
            }
            
        }
        words.add(chars[chars.length-1]);       //this condition for last if last elements
        if(len>1)                                  //are same then they will miss last else
        for(char ch : Integer.toString(len).toCharArray())   //so that element will not get added
            words.add(ch);
        for(int i=0;i<words.size();i++)
            chars[i]=words.get(i);
        return words.size();
    }
}

//understandble and well done


// class Solution {
//     public int compress(char[] chars) {
//         int count = 1;
//         StringBuilder sb = new StringBuilder();
//         sb.append(chars[0]);
//         for(int i = 1; i < chars.length; i++){
//             if(chars[i] == chars[i-1]){
//                 count++;
//             }
//             else{
//                 if(count > 1){
//                     sb.append(count);
//                 }
//                     sb.append(chars[i]);
//                     count = 1;
//             }   
//      }
//      if(count > 1){
//          sb.append(count);
//      }

//      for(int j = 0; j < sb.length(); j++){
//          chars[j] = sb.charAt(j);
//      }
//      return sb.length();
//    }
// }
//this one is copied but better solution..append works better in this condition