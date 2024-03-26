class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int check=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<1)
            continue;
            if(check==nums[i])
            {
                while(i+1<nums.length && nums[i]==nums[i+1])
                i++;
                check++;
            }
            else
            return check;
        }
        return check;   
    }
}