class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] count = new int[nums.length];
        for(int i:nums)
        count[i-1]++;
        List<Integer> ans= new ArrayList<>();
        for(int i=0;i<count.length;i++)
        {
            if(count[i]>1)
            ans.add(i+1);
        }
        return ans;
    }
}