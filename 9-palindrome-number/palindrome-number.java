class Solution {
    public boolean isPalindrome(int x) {
        int temp=0;
        int temp1=x;
        if(x<0){
            return false;

        }
        while(temp1 !=0)
        {
            temp=(temp*10)+ temp1%10;
            temp1 = temp1/10;

        }
        if(temp == x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
// class Solution {
//     public boolean isPalindrome(int x) {
//         String s = String.valueOf(x); // Convert to String
//         int n = s.length(); // Store the String length to int n

//         for (int i=0; i<n/2; i++) {
//             // We check whether the elements at the same distance from
//             // beginning and from ending are same, if not we return false
//             if (s.charAt(i) != s.charAt(n-i-1)) return false;
//         }

//         // if no flaws are found we return true
//         return true;
//     }
// }
//another way but copied but well understood