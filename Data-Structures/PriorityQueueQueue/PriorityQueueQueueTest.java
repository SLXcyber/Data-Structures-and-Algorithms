/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PriorityQueueQueue;

/**
 *
 * @author slgcc
 */
public class PriorityQueueQueueTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          PriorityQueueQueue queue = new PriorityQueueQueue(5);

        queue.enqueue(100, 2);
        queue.enqueue(50, 1);
        queue.enqueue(200, 3);
        queue.enqueue(75, 2);

        queue.display();

        queue.contains(50);
        queue.contains(999);

        queue.dequeue();
        queue.display();

        queue.enqueue(10, 0);
        queue.enqueue(300, 5); // This should fill the queue
        queue.enqueue(400, 1); // Should say "Queue is full"

        queue.display();
    }
    
}
