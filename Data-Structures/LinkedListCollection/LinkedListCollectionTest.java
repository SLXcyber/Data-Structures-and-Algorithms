/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LinkedListCollection;

/**
 *
 * @author slgcc
 */
public class LinkedListCollectionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         LinkedListCollection<String> list = new LinkedListCollection<>();

        list.addFirst("C");
        list.addFirst("B");
        list.addLast("D");
        list.addFirst("A");

        list.printList(); // A -> B -> C -> D -> null
        
        // Removes A
        list.removeFirst(); 
         // Removes D
        list.removeLast(); 

        list.printList(); // B -> C -> null
        System.out.println("Size: " + list.size()); // 2
    }
    
}
