//power function with 0(1) cpomplexity but noob
// public class Solution {
//     public boolean isPowerOfTwo(int n) {
//         for (int i = 0; i < 31; i++) {
//             int ans = (int) Math.pow(2, i);
//             if (ans == n) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }

public class Solution {
    public boolean isPowerOfTwo(int n) {
        int x = 1;
        while (x <= n) {
            if (x == n) return true;
            if (x > Integer.MAX_VALUE / 2) break;
            x = x << 1;
        }
        return false;
    }
}
//shift operator gg

// public class Solution {
//     public boolean isPowerOfTwo(int n) {
//         if (n == 0) return false;
//         return Math.floor(Math.log(n) / Math.log(2))
//          == Math.ceil(Math.log(n) / Math.log(2));
//     }
// }
//log method  n=2^n -> log(n)=n(log2) incase of 2 multiple ceil and floor willl always be equal