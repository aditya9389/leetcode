class Solution {
    public void nextPermutation(int[] nums) {
        boolean done=true;
        for(int i=nums.length-1;i>0;i--)
        {
        if(nums[i]>nums[i-1])
         {
            int s=check(i-1,nums);
            int temp = nums[s];
            nums[s]=nums[i-1];
            nums[i-1]=temp;
            reverse(nums,i);
            done = false;
            break;
         }
        }
        if(done)
        {
            reverse(nums,0);
        }
    }
    public void reverse(int[] nums,int b)
    {
         
        int i=b;
        int j=nums.length-1;
        while(i<j){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }}
    public int check(int i ,int[] nums){
            for(int j=nums.length-1;j>i;j--)
            {
                if(nums[j]>nums[i])
                {
                    return j;
                }
            }
            return i+1;
            
            
            
        }
    
}
//dont know i think i copoied it