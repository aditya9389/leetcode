class Solution {
    public int maxArea(int[] height) {
        int h=0;
        int max=0;
        int i=0,j=height.length-1;
        while(i<j)
        {
                h=height[i]>height[j] ? height[j]:height[i];
                h = (j-i)*h;
                max=max<h ? h:max;
                if(height[i]>height[j])
                j--;
                else
                i++;
            
        }
        return max;
    }
}