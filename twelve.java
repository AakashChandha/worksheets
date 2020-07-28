/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleprograms;

import java.util.Scanner;

/**
 *
 * @author ashok kavitha
 */
public class twelve {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a number to proceed");
        int a = obj.nextInt();
        System.out.println("enter next number");
        int b = obj.nextInt();
        System.out.println("select an operation \n 1.Additon \n 2.subtraction \n 3.Division \n 4.Multiplication");
        int c = obj.nextInt();
        System.out.println("\n The answer is \n");
        switch(c){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a/b);
                break;
            case 4:
                System.out.println(a*b);
                break;
            default:
                System.out.println("Invalid Input");
                
        }    
                
                
        
        
    }
                
                
        
        
        
        
    }
    

