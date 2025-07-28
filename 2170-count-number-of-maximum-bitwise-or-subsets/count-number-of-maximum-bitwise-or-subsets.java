class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxOR=0;
        for(int i:nums)
        maxOR |= i;
        return backtrack(nums,maxOR,0,0);
    }
    public int backtrack(int[] nums,int maxOR,int index,int currentOR)
    {
        if(index==nums.length)
        {
            return currentOR == maxOR ? 1:0;
        }
        if(currentOR==maxOR)
        {
            return 1<<(nums.length-index);
        }
        return backtrack(nums,maxOR,index+1,currentOR|nums[index])+
                backtrack(nums,maxOR,index+1,currentOR);
    }


}