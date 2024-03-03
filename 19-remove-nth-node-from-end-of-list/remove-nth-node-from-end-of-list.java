public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        int length = 0;

        // Count the length of the linked list
        while (current != null) {
            current = current.next;
            length++;
        }

        // If the length is equal to n, remove the head node
        if (length == n) {
            ListNode temp = head.next;
            head = null;
            return temp;
        }

        current = head;  // Reset to the head
        ListNode dummy = new ListNode(0);  // Create a dummy node
        ListNode temp = dummy;

        // Traverse to the node before the one to be deleted
        int steps = length - n;
        for (int i = 0; i < steps; i++) {
            temp.next = current;
            temp = temp.next;
            current = current.next;
        }

        ListNode nextNode = current.next;  // Save the next node
        current = null;  // Delete the node to be removed
        temp.next = nextNode;  // Link the previous node to the next node

        return dummy.next;
    }
}
//copied but i was also doing the same just took the syntex and understable and learned



// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         int length = findLength(head);
//         int i = 0, traverseTill = length - n - 1;
//         if(traverseTill == -1) return head.next;
//         ListNode curr = head;
//         while(i < traverseTill){
//             curr = curr.next;
//             i++;
//         }
//         curr.next = curr.next.next;
//         return head;
//     }
//     public int findLength(ListNode head){
//         int count = 0;
//         if(head == null) return count;
//         ListNode curr = head;
//         while(curr != null){
//             count++;
//             curr = curr.next;
//         }
//         return count;
//     }
// }
//this one is more better done