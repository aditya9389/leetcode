class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();
        for(char ch : s.toCharArray()){
            if(stk.empty())
                stk.push(ch);
            else if(stk.peek() == '(' && ch == ')')
                stk.pop();
            else if(stk.peek() == '{' && ch == '}')
                stk.pop();
            else if(stk.peek() == '[' && ch == ']')
                stk.pop();
            else   
                stk.push(ch);
        }
        if(stk.empty())
            return true;
        return false;
    }
}
//copied but understandable also learn stack in java to use this 

