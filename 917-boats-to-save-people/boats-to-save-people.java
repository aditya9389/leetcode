class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count=0;
        int i=0,j=people.length-1;
        if(j==0)
        return 0;
        Arrays.sort(people);
        while(i<=j)
        {
            if(people[i]+people[j] <=limit)
            {
                i++;
                j--;
                count++;
            }
            else if(people[j]<=limit){
                count++;
                j--;
            }
        }
        return count;
    }
}
//self done did took a little help