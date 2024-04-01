// class Solution {
//     public int lengthOfLastWord(String s) {
//         int i=0;
//         if(s.length()==0)
//         return 0;
//         String[] ans= s.split(" ");
//         int len=0;
//         for(String c:ans)
//         {
//             len=c.length();
//         }
//         return len;
//     }
// }
class Solution{
    public int lengthOfLastWord(String s){
        int len=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            while(s.charAt(i)==' ' && len==0)
            {
                i--;
            }
            if(s.charAt(i)!=' ')
            len++;
            else
            break;
        }
        return len;
    }
}