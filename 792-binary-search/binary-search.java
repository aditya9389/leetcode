class Solution {
    public int search(int[] nums, int target) {
        int s =0;
        int l=nums.length-1;
        while(s<=l)
        {
            int m=(s+l)/2;
            if(nums[m]==target)
                return m;
            else if(target>nums[m])
                s=m+1;
            else
                l=m-1;
        }
        return -1;
    }
}
//done myself easy peasy