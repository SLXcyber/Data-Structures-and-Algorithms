/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ArrayList;

/**
 *
 * @author slgcc
 */
public class ArrayListMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     ArrayList list = new ArrayList(3);

        list.add(10);
        list.add(20);
        list.add(30);
        list.display(); 

        list.add(40);
        list.display(); 

        System.out.println("Element at index 2: " + list.get(2)); // 30
        System.out.println("Contains 20? " + list.contains(20)); // true
        System.out.println("Contains 99? " + list.contains(99)); // false

        list.remove(1); // removes 20
        list.display(); // 10 30 40

        System.out.println("Size: " + list.size());
        System.out.println("Is empty? " + list.isEmpty());
    }
    
}
