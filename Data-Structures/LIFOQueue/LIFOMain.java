/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LIFOQueue;

/**
 *
 * @author slgcc
 */
public class LIFOMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LIFOQueue<Integer> lifo = new LIFOQueue<>();
        lifo.push(10);
        lifo.push(20);
        lifo.push(30);

        System.out.println(lifo.pop()); // 30
        System.out.println(lifo.pop()); // 20
        System.out.println(lifo.pop()); // 10
    }
    
}
