class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int count=0;
        int i=0,j=0;
        long ans=0;
        for(int val:nums)
        {
            max=max<val? val:max;
        }
        while(j<nums.length)
        {
            if(nums[j]==max)
            {
                count++;
            }
            while(count>=k)
            {
                ans+=nums.length-j;
                if(nums[i]==max)
                count--;
                i++;
            }
            j++;
        }
        return ans;
    }
}
//slef done just took a little help for this ans=n-j shit