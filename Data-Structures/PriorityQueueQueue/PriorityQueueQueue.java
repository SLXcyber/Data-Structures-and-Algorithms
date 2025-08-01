/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PriorityQueueQueue;

/**
 *
 * @author slgcc
 */
public class PriorityQueueQueue {
    private Node[] elements;
    private int count;

    public PriorityQueueQueue(int capacity) {
        elements = new Node[capacity];
        count = 0;
    }

    public void enqueue(int value, int priority) {
        if (count == elements.length) {
            System.out.println("Queue is full");
            return;
        }

        Node newNode = new Node(value, priority);
        int i = count - 1;

        // Shift nodes with higher priority (larger number = lower priority)
        while (i >= 0 && elements[i].priority > priority) {
            elements[i + 1] = elements[i];
            i--;
        }

        elements[i + 1] = newNode;
        count++;
    }

    public void dequeue() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return;
        }

        Node removed = elements[0];

        // Shift remaining elements
        for (int i = 1; i < count; i++) {
            elements[i - 1] = elements[i];
        }

        count--;
        System.out.println("Removed: " + removed.value + " (Priority: " + removed.priority + ")");
    }

    public boolean contains(int value) {
        for (int i = 0; i < count; i++) {
            if (elements[i].value == value) {
                System.out.println(value + " is in the queue.");
                return true;
            }
        }
        System.out.println(value + " is not in the queue.");
        return false;
    }

    public void display() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Queue contents:");
        for (int i = 0; i < count; i++) {
            System.out.println(elements[i].value + " (Priority: " + elements[i].priority + ")");
        }
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }
}
