class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        Map<Character,Integer> words =new HashMap<>();
        for(char w : s.toCharArray())
            words.put(w,words.getOrDefault(w,0)+1);
        for(char w: t.toCharArray())
            words.put(w,words.getOrDefault(w,0)-1);
        for(Map.Entry<Character,Integer> entries : words.entrySet())
        if(entries.getValue()!=0)
        return false;

        return true;
    }
}