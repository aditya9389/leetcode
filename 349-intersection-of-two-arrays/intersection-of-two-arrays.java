class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }

        for(int i =0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                list.add(nums2[i]);
            }
            set.remove(nums2[i]);
        }

        int[] arr = new int[list.size()];

        for(int i=0;i<arr.length;i++){
            arr[i] = list.get(i);
        }

        return arr;
    }
}
//copied but understood done without sorting simple 

// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         List<Integer> ans= new ArrayList<>();
//         int i=0,j=0;
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//         while(i<nums1.length&&j<nums2.length)
//         {
//             if(nums1[i]==nums2[j]){
//                 if(!ans.contains(nums1[i]))
//                 ans.add(nums1[i]);
//                 i++;
//                 j++;
//                 }
//             else if(nums1[i]>nums2[j])
//             j++;
//             else
//             i++;    
//         }
//         int[] ansarr= new int[ans.size()];
//         for(int k=0;k<ans.size();k++)
//             ansarr[k]=ans.get(k);
//         return ansarr;
//     }
// }
//self done with sorting