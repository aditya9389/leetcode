class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i=0,j=0,ans=0;
        Map<Integer,Integer> count= new HashMap<>();
        while(j<nums.length)
        {
            count.put(nums[j],count.getOrDefault(nums[j],0)+1);
            while(count.get(nums[j])>k){
                count.put(nums[i],count.get(nums[i])-1);
                i++;
            }
            ans= Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}