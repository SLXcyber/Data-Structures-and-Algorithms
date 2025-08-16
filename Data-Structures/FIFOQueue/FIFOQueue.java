/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FIFOQueue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author slgcc
 * @param <T>
 */
public class FIFOQueue<T> {
     private final Deque<T> queue;

    public FIFOQueue() {
        queue = new ArrayDeque<>();
    }

    // Enqueue - add to rear (tail)
    public void enqueue(T item) {
        queue.addLast(item);
    }

    // Dequeue - remove from front (head)
    public T dequeue() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        return queue.removeFirst();
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        return queue.peekFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}
