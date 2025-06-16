class Solution {
    public int maximumDifference(int[] nums) {
        int max=-1;
        int len=nums.length;
        for(int i=len-1;i>=0;i--)
        {
            for(int j=i-1;j>=0;j--)
            {
                int diff=nums[i]>nums[j]? nums[i]-nums[j]:-1;
                max= diff>max ? diff:max;
            }
        }
        return max;
    }
}