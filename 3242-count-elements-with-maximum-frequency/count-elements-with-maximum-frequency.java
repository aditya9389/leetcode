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