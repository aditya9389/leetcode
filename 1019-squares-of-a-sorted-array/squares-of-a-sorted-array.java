// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int n=nums.length;
//         int[] ans= new int[n];
//         int i=0,j=n-1;
//         int count=n-1;
//         while(i<=j)
//         {
//             int ip=(int)Math.pow(nums[i],2);
//             int jp=(int)Math.pow(nums[j],2);
//             if(ip<jp)
//             {
//                 ans[count]=jp;
//                 j--;
//                 count--;
//             }
//             else
//             {
//                 ans[count]=ip;
//                 i++;
//                 count--;
//             }
//         }
//         return ans;
//     }
// }
//done by myself in 1st try 


class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
//this is copied but better and nlogn time and 1 space


