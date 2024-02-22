class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustcount = new int[n + 1];

        for (int[] relation : trust) {
            trustcount[relation[0]]--;      //required
            trustcount[relation[1]]++;
        }

        for (int i = 1; i <= n; ++i) {
            if (trustcount[i] == n - 1) {        //array id defiend for the values itself so
                return i;                        //i is returning the answer itself 
            }
        }

        return -1; // no judge found
    }
}
//this  is copied one but i understood it good solution 

// class Solution {
//     public int findJudge(int n, int[][] trust) {
//         int num=trust.length;
//         int t=0;
//         for(int[] temp: trust )
//         {
//             if(temp[1]==n)
//             t++;
//         }
//         if(num==t)
//         return n;
//         return -1;
//     }
// }   
//   ---->thought something like this because i thought we need to check for n. but n is
//        the num ber of people