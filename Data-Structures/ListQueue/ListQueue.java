/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListQueue;

/**
 *
 * @author slgcc
 */
public class ListQueue {
    private Node front, rear;
    private int size;

    public ListQueue() {
        front = rear = null;
        size = 0;
    }

    // Enqueue (add to rear)
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Enqueued: " + value);
    }

    // Dequeue (remove from front)
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        int removed = front.data;
        front = front.next;
        if (front == null) { // queue became empty
            rear = null;
        }
        size--;
        System.out.println("Dequeued: " + removed);
        return removed;
    }

    // Peek at front
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        return front.data;
    }

    // Check if empty
    public boolean isEmpty() {
        return front == null;
    }

    // Get size
    public int size() {
        return size;
    }

    // Display queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue (front -> rear): ");
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
