/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Active;

/**
 *
 * @author slgcc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayStack stack = new ArrayStack(5);
        
        stack.push(1);
       stack.push(2);
       
       stack.pop();
       stack.push(3);
       
        System.out.println(stack.pop());
        
        
        
        
    
       
    }
    
}
