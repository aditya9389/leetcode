class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)
        return 0;
        int j=0;
        int i=0;
        int count=0;
        int pro=1;
        int n=nums.length;
        while(j<n)
        {
            pro*=nums[j];
            while(pro>=k)
            pro /=nums[i++];
            count += 1 +(j-i);
            j++;
        }
        return count;
    }
}
//well copied but well undertood when i heard sliding window i was trying 
//to do similar in start but 1+(j-i) formula was not knowm to me