/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activitytwo;

/**
 *
 * @author PC
 */
public class ActivityTwoClassFour extends ActivityTwoClassThree {
    
    public ActivityTwoClassFour(int Size) {
        super(Size);
    }
    
    public double peekTop(){
        if(!isEmpty()){
            System.out.println("Top Element: " + Stack[top]);
            return Stack[top];
        }else{
            System.out.println("The basket is empty fuuu!");
            return -1;
        }
    }
    
    public double peekBottom(){
        if(!isEmpty()){
            System.out.println("Bottom Element: " + Stack[0]);
            return Stack[0];
        }else{
            System.out.println("The basket is empty fuuu!");
            return -1;
        }
    }
}
