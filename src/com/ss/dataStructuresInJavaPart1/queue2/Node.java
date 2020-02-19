package com.ss.dataStructuresInJavaPart1.queue2;

// A linked list (LL) node to store a queue entry
class Node {
    int key;
    Node next;
    // constructor to create a new linked list node
    public Node(int key) {
        this.key = key;
        this.next = null;
    }
}