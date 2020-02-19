package com.ss.dataStructuresInJavaPart1.stacklinkedlist2;
//LIFO
public class StackUsingLinkedlist {
    Node top;
    public StackUsingLinkedlist() {
        this.top = null;
    }
    // insert at the beginning
    public void push(int x) {
        Node temp = new Node();
        temp.data = x;
        // put top reference into temp link
        temp.link = top;
        top = temp;
    }
    public boolean isEmpty() {
        return top == null;
    }
    // return top element in a stack
    public int peek() {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
    // remove at the beginning
    public void pop() {
        // update the top pointer to point to the next node
        top = (top).link;
    }
    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.printf("%d->", temp.data);
            temp = temp.link;
        }
    }
}
