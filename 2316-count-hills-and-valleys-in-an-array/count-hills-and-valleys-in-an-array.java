class Solution {
    public int countHillValley(int[] nums) {
        int ans=0;
        for(int i=1;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1]&&nums[i]!=nums[i-1])
            {
                if((nums[i]>nums[i-1]&&nums[i]>nums[i+1])||
                (nums[i]<nums[i-1]&&nums[i]<nums[i+1]))
                {
                    ans++;
                }
            }
            if(nums[i]==nums[i+1])
            {
                int temp=i;
                while(((i+1)<nums.length)&&nums[i]==nums[i+1])
                i++;
                if(((i+1)<nums.length)&&((nums[i]>nums[temp-1]&&nums[i]>nums[i+1])||
                (nums[i]<nums[temp-1]&&nums[i]<nums[i+1])))
                {
                    ans++;
                }
            }
        }
        return ans;
    }
}