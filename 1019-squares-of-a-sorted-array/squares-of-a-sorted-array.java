class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] ans= new int[n];
        int i=0,j=n-1;
        int count=n-1;
        while(i<=j)
        {
            int ip=(int)Math.pow(nums[i],2);
            int jp=(int)Math.pow(nums[j],2);
            if(ip<jp)
            {
                ans[count]=jp;
                j--;
                count--;
            }
            else
            {
                ans[count]=ip;
                i++;
                count--;
            }
        }
        return ans;
    }
}
//done by myself in 1st try 