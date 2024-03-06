class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] check = new boolean[nums.length];
        for(int i:nums){
            if(check[i]){
                return i;
            }
            check[i] = true;
        }
        return nums[0];
    }
}
//this one is copied but working better and understandable
// class Solution {
//     public int findDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length-1;i++)
//         {
//             if(nums[i]==nums[i+1])
//             return nums[i];
//         }
//         return -1;
//     }
// }
//this one was my solution