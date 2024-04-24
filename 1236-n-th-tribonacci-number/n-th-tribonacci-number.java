class Solution {
    public int tribonacci(int n) {
        if(n==0)
        return 0;
        if(n<3)
        return 1;
        int one=0;
        int two=1;
        int three=1;
        for(int i=2;i<n;i++)
        {
            int temp=three;
            three+=(one+two);
            one= two;
            two=temp;
        }
        return three;
    }
}
//self done didnt even 

//down words are copiied but good first one is with recursion
// class Solution {
//     public int tribonacci(int n) {
//         if (n == 0) {
//             return 0;
//         } else if (n == 1 || n == 2) {
//             return 1;
//         } else {
//             return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
//         }
//     }
// }