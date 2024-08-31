/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activitytwo;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ActivityTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Array Size: ");
        int size = scn.nextInt();
        
        ActivityTwoClassFive classfive = new ActivityTwoClassFive(size);
        
        while(true){
            System.out.println("\nPindutin ang 1 kung iyong nais na mag PUSH!");
            System.out.println("Pindutin ang 2 kung iyong nais na mag POP!");
            System.out.println("Pindutin and 3 kung iyong nais na mag PEEK!");
            System.out.println("Pindutin ang 4 kung nais mo ng mag loop!");
            System.out.println("Pindutin ang 5 kung nais mo ng umalis!");
            System.out.println("Pindutin ang 6 kung nais mo malaman kung ilan "
                    + "ang laman ng iyong stack!");
            System.out.println("Pindutin ang 7 kung nais mo malaman kung meron "
                    + "bang kaparehas ang mga elemento!");
            System.out.println("Pindutin ang 8 kung nais mo malaman ang TOP!");
            System.out.println("Pindutin and 9 kung nais mo malaman ang BOTTOM!");
            System.out.println("Pindutin and 10 kung nais mo malaman ang"
                    + " orihinal na stack!");
            System.out.println("Pindutin ang 11 kung nais mo malaman ang bagong"
                    + " dinagdag na stack!\n");
            
            int functions = scn.nextInt();
            
            
            if(functions == 1){
                System.out.println("\nBigyan mo ako ng value:  " );
                double push = scn.nextDouble();
                classfive.push(push);        
            }
            
            else if(functions == 2){
                System.out.println("\nPopped Value: " + classfive.pop());
                        
            }
            
            else if(functions == 3){
                System.out.println("\nPeeked Value: " + classfive.peekTop());
            }
            
            else if(functions == 4){
                classfive.verification();
            }
            
            else if(functions == 5){
                break;
            }
            
            else if(functions == 6){
                classfive.StackElements();
            }
            
            else if(functions == 7){
                classfive.FindDuplicate();
            }
            
            else if(functions == 8){
                classfive.peekTop();
            }
            
            else if(functions == 9){
                classfive.peekBottom();
            }
            
            else if(functions == 10){
                classfive.collectionStack();
            }
            
            else if(functions == 11){
                classfive.anotherStackLoop();
            }
            
            else{
                System.out.println("MALI KA ET! BASAHIN NG MAAYOS FU!");
            }
          
            
        }
        
        
    }
    
}
