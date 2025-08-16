/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SelectionSort;

/**
 *
 * @author slgcc
 */
public class SelectionSortTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    SelectionSort selectionSort = new SelectionSort();
        
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        selectionSort.display(arr);

        selectionSort.sort(arr);

        System.out.println("Sorted Array:");
        selectionSort.display(arr);
    }
    
}
