class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer>  count= new HashMap<>();
        for(int i: nums)
        {
            count.put(i,count.getOrDefault(i,0)+1);
        }
        int ans=0;
        int max=0;
        for(int i : count.values())
        {
            max=max<i ? i:max;
        }
        for(int i:count.values())
        {
            if(i==max)
            ans+=max;
        }
        return ans;
    }
}
//self created solution and logic didnt even looked for it. although lots of ans are on
//same logic also this can be done with array which is kind of good 

// class Solution {
//     public int maxFrequencyElements(int[] nums) {
//         int max=0;
//         for(int i=0;i<nums.length;i++){
//             max=Math.max(nums[i],max);
//         }
//         int B[]= new int[max+1];
//         int temp=0;
//         for(int i=0;i<nums.length;i++){
//             B[nums[i]]++; 
//             temp=Math.max(temp,B[nums[i]]);
//         }
//         int count=0;
//         for(int i=0;i<max+1;i++){
//             if(B[i]==temp){
//                 count+=B[i];
//             }
//         }
//         return count;
//     }
// }
//this one is copy