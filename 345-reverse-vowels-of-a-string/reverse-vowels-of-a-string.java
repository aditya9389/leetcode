class Solution {
    public String reverseVowels(String s) {
        if(s.length()<=1)
        return s;
        char temp;
        boolean start=false;
        boolean last=false;
        char[] res= s.toCharArray();
        int i=0,j=s.length()-1;
        String vow= "aeiouAEIOU";
        while(i<j)
        {
            if(vow.indexOf(res[j])!=-1)
            last=true;
            if(vow.indexOf(res[i])!=-1)
            start= true;
            if(start&&last)
            {
                temp=res[i];
                res[i]=res[j];
                res[j]=temp;
                i++;
                j--;
                start=false;
                last=false;
            }
            else if(start&&(!last))
            j--;
            else if(!start&&last)
            i++;
            else
            {
                i++;
                j--;
            }
        }
        return new String(res);

    }
}