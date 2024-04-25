class Solution {
    public int longestIdealString(String s, int k) {
        
        //To store the characters encountered and the longest
        //ideal subsequence that is possible till that character. 
        Map<Character, Integer> Mp = new HashMap<>();

        //To store the final answer
        int longest = 1;

        //Iterating over each character
        for(int i=0; i<s.length(); i++)
        {
            char curr = s.charAt(i);
            int c = (int)curr;

            //To store the length of the longest ideal subsequence till the
            //current character
            int L = 1;

            //To check from the range of characters of current-k till current+k
            //If they have been encountered before in the string
            for(int req=c-k; req<=c+k; req++)
            {
                //If the characters have been encountered then we can use the
                //current character in the subsequence that they have formed
                if(Mp.containsKey((char)req))
                {
                    //Updating the length of the longest ideal subsequence till the
                    //current character
                    L = Math.max(L, Mp.get((char)req) + 1);
                }
            }

            //Updating the answer
            longest = Math.max(L, longest);

            //Storing the current character with the longest ideal subsequence
            //found till the current character
            Mp.put(curr,L);
        }


        return longest;
    }
}
//did read but failed to do it this one is copied but didnt read