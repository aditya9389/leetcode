class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map= new HashMap<>();
        int i=0;
        for(char c:s.toCharArray())
        {
            if(!map.containsKey(c))
            if(!map.containsValue(t.charAt(i)))
            map.put(c,t.charAt(i));
            else
            return false;
            else
            if(map.get(c)!=t.charAt(i))
            return false;
            i++;
        }
        return true;
    }
}