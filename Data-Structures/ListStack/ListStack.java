/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListStack;

/**
 *
 * @author slgcc
 */
public class ListStack {
      private Node top;
    private int size;

    public ListStack() {
        top = null;
        size = 0;
    }

    // Push element on top
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println("Pushed: " + value);
    }

    // Pop element from top
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        int popped = top.data;
        top = top.next;
        size--;
        System.out.println("Popped: " + popped);
        return popped;
    }

    // Peek at top element
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return top.data;
    }

    // Check if empty
    public boolean isEmpty() {
        return top == null;
    }

    // Get stack size
    public int size() {
        return size;
    }

    // Display stack contents
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack (top -> bottom): ");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
