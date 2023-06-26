package ru.javatutor;

public class EvenOddNodes {

   public Node divide (int N, Node head) {
        Node fNodeOdd = new Node(0);
        Node fNodeEven = new Node(0);
        Node odd = fNodeOdd;
        Node even = fNodeEven;

        while (head != null) {
            if (head.data % 2 != 0) {
                odd.next = head;
                odd = odd.next;
            } else {
                even.next = head;
                even = even.next;
            }
            head = head.next;
        }
        odd.next = null;
        even.next = fNodeOdd.next;
       return fNodeEven;
    }

    static class Node {
        int data;
        Node next;

        Node (int x) {
            data = x;
            next = null;
        }
    }
}

