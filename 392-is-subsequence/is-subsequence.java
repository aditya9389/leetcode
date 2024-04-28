class Solution {
    public boolean isSubsequence(String s, String t) {
        int a=0;
        int b=0;
        int sn=s.length();
        int tn=t.length();
        while(a<sn&&b<tn)
        {
            if(s.charAt(a)==t.charAt(b))
            {
                a++;
                b++;
            }
            else{
                b++;
            }
        }
        if(a==sn)
        return true;
        return false;
    }
}
//self done 