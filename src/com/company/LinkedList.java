package com.company;

import com.sun.istack.internal.NotNull;

public class LinkedList {

    private Node head;

    public LinkedList() {

        head = null;
    }

    public class SinglyListNode {
        int val;
        SinglyListNode next;
        SinglyListNode(int x) { val = x; }
    }

    public void insertFirst(int data) {
        Node node0 = new Node(data);
        node0.setNext(head);
        head =node0;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node p = head;
            while (p.getNext() !=null) {
                p = p.getNext();
                p.setNext(newNode);
            }
        }
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.getNext()==null) {
            head = null;
            return;
        }
        Node p = head;
        while (p.getNext().getNext() != null) {
            p = p.getNext();
            p.setNext(null);
        }
    }

    public void countNodes() {

    }

    public void linearSearch(int data) {

    }

    public void deleteTarget(int data) {

    }

    public void deleteAll() {
        head = null;
    }

    public void deleteFirst() {
        if (head!=null) {
            head = head.getNext();
        }
    }

    public void traverse () {
        Node pointer = head;
        while (pointer != null) {
            System.out.print(pointer + "\n");
            pointer = pointer.getNext();
        }
    }

    ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextElement = current.getNext();
            current.setNext(previous);
            previous = current;
            current = nextElement;
        }
        return previous;
    }
}
