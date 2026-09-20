/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node start = head;
        HashMap<Node,Node> nodeMap = new HashMap<>();
        while (start != null) {
            Node newNode = new Node(start.val);
            nodeMap.put(start, newNode);
            start = start.next;
        }
        start = head;
        while (start != null) {
            Node copy = nodeMap.get(start);
            copy.next = nodeMap.get(start.next);
            copy.random = nodeMap.get(start.random);
            start = start.next;
        }
        return nodeMap.get(head);
    }
}
