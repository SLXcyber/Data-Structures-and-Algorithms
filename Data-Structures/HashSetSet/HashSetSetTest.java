/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HashSetSet;

/**
 *
 * @author slgcc
 */
public class HashSetSetTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    HashSetSet set = new HashSetSet(10);

        // Insert values
        set.insert(15);
        set.insert(25);
        set.insert(5);
        set.insert(35); // Will cause a collision

        // Display all
        set.showAll();

        // Test existence
        System.out.println("Contains 25? " + set.exists(25)); // true
        System.out.println("Contains 99? " + set.exists(99)); // false

        // Remove values
        set.delete(25); 
        set.delete(99); // not in set

        // Show after deletion
        set.showAll();

        // Try re-inserting a removed value
        set.insert(25);
        set.showAll();
    }
    
}
