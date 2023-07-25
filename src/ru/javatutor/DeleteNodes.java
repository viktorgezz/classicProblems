package ru.javatutor;

public class DeleteNodes {
    public Node deleteGreater(Node head, int x) {
        Node node = new Node(0);
        Node nodeTemp = node;

        while (head != null) {
            if (head.data <= x) {
                nodeTemp.next = new Node(head.data);
                nodeTemp = nodeTemp.next;
            }
            head = head.next;
        }
        return node.next;
    }


    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }
}
