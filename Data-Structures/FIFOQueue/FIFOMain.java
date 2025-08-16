/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FIFOQueue;

/**
 *
 * @author slgcc
 */
public class FIFOMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          FIFOQueue<Integer> fifo = new FIFOQueue<>();
        fifo.enqueue(10);
        fifo.enqueue(20);
        fifo.enqueue(30);

        System.out.println(fifo.dequeue()); // 10
        System.out.println(fifo.dequeue()); // 20
        System.out.println(fifo.dequeue()); // 30
    }
    
}
