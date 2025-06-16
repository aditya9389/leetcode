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
        int ans=-1;
        int n = nums.length;
        int min = nums[0];
        for(int i=1;i<n;i++){
            int val = nums[i];
            if(min<val){
                ans = Math.max(ans,val-min);
            }
            min = Math.min(min,val);             
        } 
        return ans;            
    }       
}
//optimized O(n)