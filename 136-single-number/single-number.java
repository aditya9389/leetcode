class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            return nums[i];
            i++;
        }
        return nums[nums.length-1];
        //return xorFunction(0,nums);
    }
    public int xorFunction(int startIndex, int[] nums){
        if(startIndex >= nums.length)
            return 0;
        return nums[startIndex]^xorFunction(startIndex + 1,nums);
    } //not used in this code but this one is best 
}
//self done and this is i guess a jugad main method we can use
//is hashmap but this not good for follow up which as for
//constant space so best is xor func which  is copied but good