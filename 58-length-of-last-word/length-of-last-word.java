class Solution {
    public int lengthOfLastWord(String s) {
        int i=0;
        if(s.length()==0)
        return 0;
        String[] ans= s.split(" ");
        int len=0;
        for(String c:ans)
        {
            len=c.length();
        }
        return len;
    }
}