/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashSetSet;

/**
 *
 * @author slgcc
 */
public class HashSetSet {
    // Array to store values
    private int[] elements;
    // Track which slots are used
    private boolean[] isUsed;

    public HashSetSet(int capacity) {
        elements = new int[capacity];
        isUsed = new boolean[capacity];
    }

    public void insert(int value) {
        int index = hash(value);
        while (isUsed[index]) {
            index = (index + 1) % elements.length;
        }
        elements[index] = value;
        isUsed[index] = true;
    }

    public boolean exists(int value) {
        int index = hash(value);
        while (isUsed[index]) {
            if (elements[index] == value) {
                return true;
            }
            index = (index + 1) % elements.length;
        }
        return false;
    }

    public void delete(int value) {
        int index = hash(value);
        while (isUsed[index]) {
            if (elements[index] == value) {
                isUsed[index] = false;
                System.out.println(value + " removed from index " + index);
                return;
            }
            index = (index + 1) % elements.length;
        }
        System.out.println(value + " is not in the set.");
    }

    public void showAll() {
        System.out.println("Set contents:");
        for (int i = 0; i < elements.length; i++) {
            if (isUsed[i]) {
                System.out.println("Index " + i + ": " + elements[i]);
            }
        }
    }

    private int hash(int value) {
        return Math.abs(value) % elements.length;
    }
}

