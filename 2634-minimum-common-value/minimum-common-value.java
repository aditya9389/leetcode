class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        while(i<nums1.length&&j<nums2.length)
        {
            if(nums1[i]>nums2[j])
            j++;
            else if(nums2[j]>nums1[i])
            i++;
            else
            return nums2[j];
        }
        return -1;
    }
}