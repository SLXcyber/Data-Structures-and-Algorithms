/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

/**
 *
 * @author slgcc
 */
public class ArrayList {
     private int[] elements;
    private int size;

    public ArrayList(int capacity) {
        elements = new int[capacity];
        size = 0;
    }
    
    public void add(int value) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = value;
    }
  
    public int get(int index) {
        checkIndex(index);
        return elements[index];
    }

    // Remove element by index
    public void remove(int index) {
        checkIndex(index);
        int removed = elements[index];

        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        size--;
        System.out.println("Removed: " + removed);
    }

    // Check if value exists
    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == value) {
                return true;
            }
        }
        return false;
    }
  
    public void display() {
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("List contents: ");
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Automatically double array size
    private void resize() {
        int[] newArr = new int[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        elements = newArr;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds. Size: " + size);
        }
    }
    
}
