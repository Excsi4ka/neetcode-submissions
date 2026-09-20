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
        HashMap<Integer, ListNode> map = new HashMap<>();
        int index = 0;
        while (head != null) {
            map.put(index++, head);
            head = head.next;
        }
        ListNode first = map.get(0);
        for(int i = 1; i <= index / 2; i++) {
            first.next = map.get(index - i);
            first = first.next;
            first.next = map.get(i);
            first = first.next;
        }
        first.next = null;
    }
}
