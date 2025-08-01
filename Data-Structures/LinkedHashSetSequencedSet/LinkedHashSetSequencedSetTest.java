/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LinkedHashedSetSequencedSet;

/**
 *
 * @author slgcc
 */
public class LinkedHashSetSequencedSetTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          LinkedHashSetSequencedSet set = new LinkedHashSetSequencedSet(10);

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // duplicate

        set.display(); // Should show: 10 20 30

        System.out.println("Contains 20? " + set.contains(20));
        System.out.println("Contains 99? " + set.contains(99));

        set.remove(20);
        set.remove(99); // not in set

        set.display(); // Should show: 10 30

        set.add(40);
        set.display(); // Should show: 10 30 40
    }
    
}
