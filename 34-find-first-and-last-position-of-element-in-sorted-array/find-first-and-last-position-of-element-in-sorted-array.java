class Solution {
    public int binarySearch(int[] nums, int target, boolean findFirst) {
        int s = 0;
        int e = nums.length - 1;
        int index = -1;
        while (s <= e) {
            int mid =  (e + s) / 2;
            if (nums[mid] == target) {
                index = mid;
                if (findFirst)
                    e = mid - 1; // Find first occurrence
                else
                    s = mid + 1; // Find last occurrence
            } else if (nums[mid] < target)
                s = mid + 1;
            else
                e = mid - 1;
        }
        return index;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] range = new int[2];
        int first = binarySearch(nums, target, true);
        int last = binarySearch(nums, target, false);
        range[0] = first;
        range[1] = last;
        return range;
    }
}
//optimized binarty search is copied but well learned 
// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int s=0;
//         int l= nums.length-1;
//         int res[]={-1,-1};
//         boolean start=false,last=false;
//         if(l<0)
//         return res;
//         while(l>=s)
//         {
//            if(nums[s]==target||start)
//                 start=true;
//            else
//                 s++;
//            if(nums[l]==target||last)
//                 last=true;
//            else
//                 l--;
//             if(start&&last)
//                 return new int[]{s,l};
//         }
//         return res;
//     }
// }
//well understood and this wad first intuition