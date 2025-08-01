/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedListCollection;

/**
 *
 * @author slgcc
 */
public class LinkedListCollection <T>{ //generics to use in all types
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    // Add to front
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    // Add to end
    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (tail != null) {
            tail.next = newNode;
        }

        tail = newNode;

        if (head == null) {
            head = tail;
        }

        size++;
    }

    // Remove from front
    public T removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }

        T data = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        return data;
    }

    // Remove from end
    public T removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }

        if (head == tail) {
            T data = head.data;
            head = tail = null;
            size--;
            return data;
        }

        Node<T> current = head;
        while (current.next != tail) {
            current = current.next;
        }

        T data = tail.data;
        current.next = null;
        tail = current;
        size--;
        return data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
