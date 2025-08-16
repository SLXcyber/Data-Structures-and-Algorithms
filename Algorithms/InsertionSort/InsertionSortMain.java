/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InsertionSort;

/**
 *
 * @author slgcc
 */
public class InsertionSortMain {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();

        int[] arr = {12, 11, 13, 5, 6};

        System.out.println("Original Array:");
        insertionSort.display(arr);

        insertionSort.sort(arr);

        System.out.println("Sorted Array:");
        insertionSort.display(arr);
    }

}
