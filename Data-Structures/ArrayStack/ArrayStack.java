/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Active;

/**
 *
 * @author slgcc
 */
public class ArrayStack {
    private int arr[];
    private int maxSize;
    private int top;
    
    public ArrayStack(int size){
        maxSize = size;
        arr= new int[maxSize];
        top = -1;
    }
    
    public void push(int number){
        if (isFull()){
            System.out.println("Sorry Your ArrayStack is already full.");
            
        }else{
            arr[++top] = number;
        }
    }
    
    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("Sorry the arraystack is empty");
        }else{
            return (arr[top--]);
        }
    }
    
   public int peek(){
        if (isEmpty()){
            throw new RuntimeException("Sorry the arraystack is empty");
        }else{
            return (arr[top]);
        }
    }
   
   public boolean isFull(){
       return top == maxSize-1;
   }
    
   public boolean isEmpty(){
       return top == -1;
   }
}
