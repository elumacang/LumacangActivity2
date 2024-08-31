/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activitytwo;

import java.util.Stack;

/**
 *
 * @author PC
 */
public class ActivityTwoClassFive extends ActivityTwoClassFour {
    
    public ActivityTwoClassFive(int Size) {
        super(Size);
    }
    
    Stack<Double> anotherStack = new Stack<>();
    
    public void collectionStack(){
        for (int i = 0; i <= top; i++){
                System.out.println("\nAdded stack to another stack: " 
                        + Stack[i]);
                anotherStack.push(Stack[i]);
            }
        }
    
    public void anotherStackLoop(){
        if(isEmpty()){
            System.out.println("Empty na fuu!");
        }else {
            System.out.println("\nNew Stack Values: ");
            for(int i = 0; i < anotherStack.size(); i++){
                System.out.println(anotherStack.get(i));
            }
        }
    }

}    

