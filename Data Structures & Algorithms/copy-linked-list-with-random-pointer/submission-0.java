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
        if(head == null) return null;
        Node start = head;
        HashMap<Node,Node> nodeMap = new HashMap<>();
        while (head != null) {
            Node newNode = new Node(head.val);
            nodeMap.put(head, newNode);
            head = head.next;
        }
        for (Node n : nodeMap.keySet()) {
            Node copy = nodeMap.get(n);
            copy.next = nodeMap.get(n.next);
            copy.random = nodeMap.get(n.random);
        }
        return nodeMap.get(start);
    }
}
