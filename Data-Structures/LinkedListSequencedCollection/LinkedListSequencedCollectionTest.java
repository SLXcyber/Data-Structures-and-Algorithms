/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LinkedListSequencedCollection;

/**
 *
 * @author slgcc
 */
public class LinkedListSequencedCollectionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedListSequencedCollection<String> list = new LinkedListSequencedCollection<>();

        list.add(0, "A");  // A
        list.add(1, "C");  // A -> C
        list.add(1, "B");  // A -> B -> C
        list.printList();

        System.out.println("Item at index 1: " + list.get(1)); // B

        list.remove(1); // remove B
        list.printList(); // A -> C -> null

        System.out.println("Size: " + list.size()); // 2
    }
    
}
