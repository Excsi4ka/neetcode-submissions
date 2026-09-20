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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        ListNode start = new ListNode();
        start.next = head;
        ListNode left = start;

        for(int i = 0; i < n; i++) {
            head = head.next;
        }
        while (head != null) {
            left = left.next;
            head = head.next;
        }
        left.next = left.next.next;
        return start.next;
    }

}
