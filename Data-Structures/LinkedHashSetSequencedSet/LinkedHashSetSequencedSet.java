package LinkedHashedSetSequencedSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author slgcc
 */
public class LinkedHashSetSequencedSet {
   private int[] table;
    private boolean[] used;
    private Node head, tail;
    private int capacity;

    public LinkedHashSetSequencedSet(int capacity) {
        this.capacity = capacity;
        table = new int[capacity];
        used = new boolean[capacity];
        head = null;
        tail = null;
    }

    public void add(int value) {
        int index = hash(value);
        while (used[index]) {
            if (table[index] == value) return; // already exists
            index = (index + 1) % capacity;
        }
        table[index] = value;
        used[index] = true;
        linkLast(new Node(value));
    }

    public boolean contains(int value) {
        int index = hash(value);
        while (used[index]) {
            if (table[index] == value) {
                return true;
            }
            index = (index + 1) % capacity;
        }
        return false;
    }

    public void remove(int value) {
        int index = hash(value);
        while (used[index]) {
            if (table[index] == value) {
                used[index] = false;
                unlink(value);
                System.out.println(value + " removed");
                return;
            }
            index = (index + 1) % capacity;
        }
        System.out.println(value + " not found");
    }

    public void display() {
        System.out.print("Set in insertion order: ");
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    private int hash(int val) {
        return Math.abs(val) % capacity;
    }

    // Doubly-linked list handling
    private void linkLast(Node node) {
        if (tail == null) {
            head = tail = node;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
    }

    private void unlink(int value) {
        Node curr = head;
        while (curr != null) {
            if (curr.value == value) {
                if (curr.prev != null) curr.prev.next = curr.next;
                else head = curr.next;
                if (curr.next != null) curr.next.prev = curr.prev;
                else tail = curr.prev;
                return;
            }
            curr = curr.next;
        }
    }
}
