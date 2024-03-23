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
    public void reorderList(ListNode head) {
        ListNode slow= head;
        ListNode fast= head;
        while(fast!=null &&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr= slow;
        ListNode prev= null;
        ListNode next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next= prev;
            prev= curr;
            curr = next;
        }
        ListNode half=prev;
        ListNode start=head;
        while(start.next!=null&&half.next!=null)
        {
            ListNode temp=start.next;
            ListNode temp2=half.next;
            start.next=half;
            half.next=temp;
            start=temp;
            half=temp2;
        }
    }
}