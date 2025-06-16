// class Solution {
//     public int maximumDifference(int[] nums) {
//         int max=-1;
//         int len=nums.length;
//         for(int i=len-1;i>=0;i--)
//         {
//             for(int j=i-1;j>=0;j--)
//             {
//                 int diff=nums[i]>nums[j]? nums[i]-nums[j]:-1;
//                 max= diff>max ? diff:max;
//             }
//         }
//         return max;
//     }
// }//mine O(n^2)

class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int maxDiff = -1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) {
                maxDiff = Math.max(maxDiff, nums[i] - min);
            } else {
                min = nums[i];
            }
        }
        return maxDiff;
    }
}
//optimized O(n)