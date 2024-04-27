// class Solution {
//     public boolean increasingTriplet(int[] nums) {
//         int n=nums.length;
//         if(n<3)
//         return false;
//         int i=0;
//         int j=1;
//         int k=2;
//         while(k<n)
//         {
//             if(nums[i]<nums[j]&&nums[j]<nums[k])
//             return true;
//             i++;
//             j++;
//             k++;
//         }
//         return false;
//     }
// }

//below one is copied but good one
// class Solution {
//     public boolean increasingTriplet(int[] nums) {
//         if (nums == null || nums.length < 3) {
//             return false;
//         }
//         int a = Integer.MAX_VALUE;
//         int b = Integer.MAX_VALUE;
        
//         for (int num : nums) {
//             if (num <= a) {
//                 a = num;
//             } else if (num <= b) {
//                 b = num;
//             } else {
//                 return true;
//             }
//         }
        
//         return false;
//     }
// }
class Solution{
   public boolean increasingTriplet(int[] nums) {
        // start with two largest values, as soon as we find a number bigger than both, while both have been updated, return true.
        int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= small) { small = n; } // update small if n is smaller than both
            else if (n <= big) { big = n; } // update big only if greater than small but smaller than big
            else return true; // return if you find a number bigger than both
        }
        return false;
    }
}
//diff syntax for above code but very simple to understand