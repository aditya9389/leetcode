class Solution {
    public String maximumOddBinaryNumber(String s)
    {
        Map<Character,Integer> count= new HashMap<>();
        for(char i:s.toCharArray())
            count.put(i,count.getOrDefault(i,0)+1);
        StringBuilder ans=new StringBuilder("");
        count.put('1',count.get('1')-1);
        while(count.getOrDefault('0',0)>0||count.getOrDefault('1',0)>0)
        {
            if(count.getOrDefault('1',0)>0)
            {
                ans.append("1");
                count.put('1',count.get('1')-1);
            }
            else if(count.getOrDefault('0',0)>0)
            {
                ans.append("0");
                count.put('0',count.get('0')-1);
            }
        }
        ans.append('1');
        return ans.toString();
    }
    
}