class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ans= new ArrayList<>();
        int i=0,j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<nums1.length&&j<nums2.length)
        {
            if(nums1[i]==nums2[j]){
                if(!ans.contains(nums1[i]))
                ans.add(nums1[i]);
                i++;
                j++;
                }
            else if(nums1[i]>nums2[j])
            j++;
            else
            i++;    
        }
        int[] ansarr= new int[ans.size()];
        for(int k=0;k<ans.size();k++)
            ansarr[k]=ans.get(k);
        return ansarr;
    }
}
//self done