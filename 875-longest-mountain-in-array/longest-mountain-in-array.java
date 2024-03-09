class Solution {
    public int longestMountain(int[] arr) {
        int up = 0, down = 0, result = 0;

        for(int i = 1; i < arr.length; ++i) {
            if((down > 0 && arr[i - 1] < arr[i]) || arr[i - 1] == arr[i])   //this will make up 
                up = down = 0;          //and down 0 when it detects that down if getting up and next element is now bigger
            if(arr[i - 1] < arr[i])
                up++;
            if(arr[i - 1] > arr[i])
                down++;
            if(down > 0 && up > 0 && up + down + 1 > result)
                result = up + down + 1;
        }

        return result;
    }
}
//copied but understood



//failed try
// class Solution {
//     public int longestMountain(int[] arr) {
//         int i=0;
//         int j=1;
//         boolean up=true;
//         int ans=0;
//         while(j<arr.length)
//         {
//             if(arr[j-1]<=arr[j]&&up)
//             {
//                 j++;
//             }
//             else if(arr[j]<=arr[j-1]&&!up)
//             {
//                 j++;
//             }
//             else{
//                 if(!up){
//                 ans=j-i+1>ans ? j-i+1:ans;
//                 i=j;
//                 j++;}
//                 up=!up;
//             }
//         }
//         return ans;
//     }
// }