/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activitytwo;

import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author Elsa 
 */
public class ActivityTwoClassThree extends ActivityTwoClassTwo {
    
    public ActivityTwoClassThree(int Size) {
        super(Size);
    }
    
    public void FindDuplicate(){
        
        Set<Double> uniq = new HashSet<>();
        int anotherTop = -1;
        boolean duplicated = false;
        
        for (int i = 0; i <= top; i++) {
            if (uniq.contains(Stack[i])){
                System.out.println("\nDetected Duplicate! " + Stack[i]);
                Stack[++anotherTop] = Stack[i];
                top = anotherTop;
                duplicated = true;
            }
            
            uniq.add(Stack[i]);
            
        }
        
        if(duplicated == false){
            System.out.println("\nDuplicate is not detected! ");
        }
    }
}
