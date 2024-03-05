class Solution {
    public int minimumLength(String s) {
        int i=0;
        int j=s.length()-1;
        if(j==0)
        return 1;
        while(i<j&&s.charAt(i)==s.charAt(j))
        {
                char ch=s.charAt(i);
                while(i<=j&&s.charAt(i)==ch)i++;
                while(i<=j&&s.charAt(j)==ch)j--;
        }
        return i<=j? j-i+1:0;
    }
}