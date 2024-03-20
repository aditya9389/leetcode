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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        ListNode temp1=list1;
        for(int i=1;i<a;i++)    //taking temp to before a
        temp=temp.next;
        for(int i=0;i<b;i++)    //taking temp1 to b
        temp1=temp1.next;
        temp.next=list2;        //setting list 2 on a
        temp=list2;             //reseting temp on list2
        while(temp.next!=null)  //going on list2 last
        temp=temp.next;
        temp.next=temp1.next;   //setting next of list2 last on temp1 next
        return list1;
    }
}
