/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activitytwo;

/**
 *
 * @author PC
 */
public class ActivityTwoClassTwo extends ActivityTwoClassOne {
    
    public ActivityTwoClassTwo(int Size) {
        super(Size);
    }
    
    public void StackElements(){
        if(!isEmpty()){
           int elements = top + 1;
            System.out.println("Size of Elements: " + elements);
            
        }else{
            System.out.println("FULL ANG STACK MADAM!");
        }
    }
    
}
