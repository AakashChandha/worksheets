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
public class thirdprg {
    // fibonacci series
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a number to generate fibo series");
        int n = obj.nextInt();
        int a = -1;
        int b = 1;
        int c = 0;
        for (int i = 0; i<n; i++){
          
            c = a+b;
            a= b;
            b=c;
            System.out.println(c);
        }
        
            
          
                    

       
        
                
                
    }
    
}
