class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count=0;
        int pro=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            count++;
            else{
                pro*=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(count>1)
            nums[i]=0;
            else if(count==1){
                if(nums[i]==0)
                nums[i]=pro;
                else
                nums[i]=0;
            }
            else{
                nums[i]=pro/nums[i];
            }
        }
        return nums;    
    }
}
//self done tought in college