class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map= new HashMap<>();
        int i=0;        //use i for iterating over t
        for(char c:s.toCharArray())     //run for each loop on s
        {
            if(!map.containsKey(c))           //check if it contains the new key or not
            {                                       
                if(!map.containsValue(t.charAt(i))) //then check if that value is there or not
                    map.put(c,t.charAt(i));    //if both are not present then put them
                else
                    return false;           //if value is already there then directly return false
            }                               
            else if(map.get(c)!=t.charAt(i)) //if key is there already then check if its value 
                return false;               //is similar to new value -- if not return false
            
            i++;                            //no mater what increase i
        }
        return true;        //after loop direct exit
    }
}
