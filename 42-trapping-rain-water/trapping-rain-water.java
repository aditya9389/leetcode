public class Solution {
    public int trap(int[] h) {
        int l = 0, r = h.length - 1, lmax = Integer.MIN_VALUE, rmax = Integer.MIN_VALUE, ans = 0;
        while (l < r) {
        lmax = Math.max(lmax, h[l]);
        rmax = Math.max(rmax, h[r]);
        ans += (lmax < rmax) ? lmax - h[l++] : rmax - h[r--];
        }
        return ans;
    }
}
// class Solution {
//     public int trap(int[] h) {
//         int n=h.length;
//         int sum=0;
//         int l[]=new int[n];
//         int r[]=new int[n];
//         l[0]=h[0];
//         for(int i=1;i<n;i++)
//             {
//                 l[i]=h[i]>l[i-1] ? h[i]:l[i-1];
//             }
//         r[n-1]=h[n-1];
//         for(int i=n-2;i>=0;i--)
//             {
//                 r[i]=h[i]>r[i+1] ? h[i]:r[i+1];
//             }
//         for(int i=0;i<n;i++)
//             {
//                 sum+=l[i]<r[i] ? (l[i]-h[i]):(r[i]-h[i]);
//             }
//         return sum;
//     }
// }