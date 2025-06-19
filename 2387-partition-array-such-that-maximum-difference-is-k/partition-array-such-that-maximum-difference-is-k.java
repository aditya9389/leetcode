class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=0;
        int i=0;
        while(i<nums.length)
        {
            int min=nums[i];
            while(i<nums.length && nums[i]<=min+k)
            {
                i++;
            }
            ans++;
        }
        return ans;
    }
}