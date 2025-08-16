/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LIFOQueue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author slgcc
 * @param <T>
 */
public class LIFOQueue<T> {
     private final Deque<T> stack;

    public LIFOQueue() {
        stack = new ArrayDeque<>();
    }

    public void push(T item) {
        stack.addFirst(item);
    }

    public T pop() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return stack.removeFirst(); 
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return stack.peekFirst();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}
