class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int ans = nums[0];
        for(int i=1;i<nums.length;i++) {
            if(nums[i] != ans) {
                count--;
            } else {
                count++;
            }
            if(count == 0) {
                ans = nums[i];
                count = 1;
            }
        }
        return ans;
    }
}
//this one id jood Boyer-Moore Majority Vote Algorithm refer notes

// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         return nums[nums.length / 2];
//     }
// }
//as frequency is n/2 given always so it will always be in middle if sorted