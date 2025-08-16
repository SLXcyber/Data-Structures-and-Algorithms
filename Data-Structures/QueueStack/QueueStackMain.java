/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QueueStack;

/**
 *
 * @author slgcc
 */
public class QueueStackMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         QueueStack stack = new QueueStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();  // Should show [30, 20, 10]

        System.out.println("Peek: " + stack.peek()); // 30

        stack.pop(); // removes 30
        stack.display(); // [20, 10]

        stack.pop(); // removes 20
        stack.pop(); // removes 10
        stack.pop(); // stack empty

        System.out.println("Is empty? " + stack.isEmpty());
    }
    }
    

