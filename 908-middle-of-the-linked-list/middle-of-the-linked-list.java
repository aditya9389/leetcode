/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static int len(ListNode head)
    {
        int l=1;
        while(head.next!=null){
        l++;
        head=head.next;}
        return l;
    }
    public ListNode middleNode(ListNode head) {
        if(head.next==null)
        return head;
        int len=len(head);
        System.out.println(len);
        for(int i=0;i<len/2;i++)
        head= head.next;
        return head;
    }
}
//self done very easy