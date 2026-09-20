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
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        if(head.next == null) return false;
        ListNode slow = head;
        head = head.next.next;

        while (head != null && head.next != null) {
            head = head.next.next;
            slow = slow.next;
            if(slow == head)
            return true;

        }
        return false;
        
    }
}
