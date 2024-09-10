class Solution {
    public int rob(int[] nums) {
        int first=0;
        int second=0;
        for(int i=0;i<nums.length;i++)
        {
            int  newfirst= second+nums[i];
            int newsecond= Math.max(second,first);
            first=newfirst;
            second=newsecond;
        }
        return Math.max(first,second);
    }
}