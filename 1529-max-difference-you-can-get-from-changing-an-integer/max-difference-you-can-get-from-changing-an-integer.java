class Solution {
    public int maxDiff(int num) {
        String temp=String.valueOf(num);
        int formax=0;
        int formin=Integer.parseInt(temp.replace(temp.charAt(0)+"","1"));
        for(int i=0;i<temp.length();i++)
        {
            char c= temp.charAt(i);
            if(c<'9'){
            formax=Integer.parseInt(temp.replace(c+"","9"));
            break;
            }
            formax=Integer.parseInt(temp.replace(c+"","9"));
        }
        System.out.println(formax);
        temp=String.valueOf(num);
        for(int i=0;i<temp.length();i++)
        {
            char c= temp.charAt(i);
            if(c>'1')
            {
                if(i==0)
                formin=Integer.parseInt(temp.replace(c+"","1"));
                else
                formin=Integer.parseInt(temp.replace(c+"","0"));
                break;
            }
        }
        System.out.println(formin);
        return formax-formin;
    }

}

//self done fucker