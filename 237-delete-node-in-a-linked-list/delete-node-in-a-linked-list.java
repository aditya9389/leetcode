/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// class Solution {
//     public void deleteNode(ListNode node) {
//         ListNode temp=node;
//         while(node.next!=null)
//         {
//             temp=node;
//             node=node.next;
//             temp.val=node.val;      
//         }
//         temp.next=null;
//     }
// }
//self done 
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
         System.gc();
    }
}
//this 2 liner is copied but better