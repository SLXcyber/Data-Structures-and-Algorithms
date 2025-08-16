/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ListQueue;

/**
 *
 * @author slgcc
 */
public class ListQueueMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ListQueue queue = new ListQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display(); 

        System.out.println("Peek: " + queue.peek()); // 10

        queue.dequeue(); // removes 10
        queue.display(); // 20 30

        System.out.println("Size: " + queue.size());
        System.out.println("Is empty? " + queue.isEmpty());

        queue.dequeue();
        queue.dequeue();
        queue.display(); // empty
    }
    
}
