class Solution {
    public int maxDepth(String s) {
        int count=0;
        int ans=0,max=0;
        boolean close=false;
        for(char c: s.toCharArray())
        {
            if(c=='('){
            count++;
            ans=count>ans? count:ans;
            }
            else if(c==')'&&count>0){
                count--;
            }   
            
        }
        return ans;
    }
}