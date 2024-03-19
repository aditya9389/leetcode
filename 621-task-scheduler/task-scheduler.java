class Solution {
    public int leastInterval(char[] tasks, int n) {
        int total= tasks.length;
        int max=0;
        int[] count= new int[26];
        for(char ch:tasks)
        count[ch-'A']+=1;
        for(int c:count)    
        max=max>c? max:c;
        int countmax=0;
        for(int m:count)
        if(m==max)
        countmax++;
        return Math.max((n+1)*(max-1)+countmax,total);
    }
}
//learned the logic implemented myself 