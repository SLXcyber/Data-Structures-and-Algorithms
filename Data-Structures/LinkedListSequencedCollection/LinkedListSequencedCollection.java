/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedListSequencedCollection;
//import LinkedListCollection.Node;
/**
 *
 * @author slgcc
 */
//index-based operations
public class LinkedListSequencedCollection<T> {
     private Node<T> head;
    private int size = 0;

    // Add at a specific index
    public void add(int index, T data) {
        checkPositionIndex(index);

        if (index == 0) {
            addFirst(data);
        } else {
            Node<T> prev = getNode(index - 1);
            Node<T> newNode = new Node<>(data);
            newNode.next = prev.next;
            prev.next = newNode;
            size++;
        }
    }

    // Add to front
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Get item at index
    public T get(int index) {
        checkElementIndex(index);
        return getNode(index).data;
    }

    // Remove item at index
    public T remove(int index) {
        checkElementIndex(index);

        if (index == 0) {
            T data = head.data;
            head = head.next;
            size--;
            return data;
        } else {
            Node<T> prev = getNode(index - 1);
            T data = prev.next.data;
            prev.next = prev.next.next;
            size--;
            return data;
        }
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

    // Helper to get node at index 
    
    private Node<T> getNode(int index) {
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    // Index validation helpers
    private void checkElementIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    private void checkPositionIndex(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
}
