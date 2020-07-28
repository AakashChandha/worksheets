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
public class eleven {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a number");
        int a = obj.nextInt();
        System.out.println("enter the next muber to add");
        int b = obj.nextInt();
        int c = a+b;
        System.out.println("The answer is" + c );
        
        
    }
}
