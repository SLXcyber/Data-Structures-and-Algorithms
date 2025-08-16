/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListStack;

/**
 *
 * @author slgcc
 */
public class ListStackMain {
    public static void main(String[] args) {
        ListStack stack = new ListStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // top -> 30 20 10

        System.out.println("Peek: " + stack.peek()); // 30

        stack.pop(); // removes 30
        stack.display(); // 20 10

        System.out.println("Size: " + stack.size());
        System.out.println("Is empty? " + stack.isEmpty());

        stack.pop();
        stack.pop();
        stack.display(); // empty
    }
}
