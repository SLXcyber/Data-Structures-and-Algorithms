/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BubbleSort;

/**
 *
 * @author slgcc
 */
public class BubbleSortExample {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        bubbleSort.display(arr);

        bubbleSort.sort(arr);

        System.out.println("Sorted Array:");
        bubbleSort.display(arr);
    }
}
