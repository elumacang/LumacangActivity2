/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activitytwo;

/**
 *
 * @author PC
 */
public class ActivityTwoClassOne {
    
    int maxsize;
    double[] Stack;
    int top;
    
    public ActivityTwoClassOne(int Size){
        maxsize = Size;
        Stack = new double[maxsize];
        top = -1;
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
    
    public boolean isFull(){
        return (top == maxsize -1);
    }
    
    public void push(double value){
        if(!isFull()){
            Stack[++top] = value;
            System.out.println("\nPushed value: " + value);
        }else{
            System.out.println("\nThe basket is full! Stop pushing na ba!");
        }
    }
    
    public double pop(){
        if(!isEmpty()){
            return Stack[top--];
        }else{
            System.out.println("\nThe basket is empty! No more!");
            return -1;
        }
    }
    
    public void verification(){
        if(!isEmpty()){
            System.out.println("\nAll Values: ");
            for(int i = top; i >= 0; i--){
                System.out.println(Stack[i]);
            }
        }
    }
    
        
    

    
    
}
