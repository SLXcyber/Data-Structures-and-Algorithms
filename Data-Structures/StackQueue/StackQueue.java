/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackQueue;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author slgcc
 */
public class StackQueue {
     private Queue<Integer> q1;
    private Queue<Integer> q2;

    public StackQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Push element onto stack
    public void push(int x) {
        // Push into q2
        q2.add(x);

        // Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Pop element from stack
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.poll();
    }

    // Peek top element
    public int peek() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.peek();
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    // Display stack elements
    public void display() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements: " + q1);
    }
}
