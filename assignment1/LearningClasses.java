/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.classes;

/**
 *
 * @author aakashchandha
 */
public class LearningClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        volumeinput obj=new volumeinput();
        obj.depth=10;
        obj.height=12;
        obj.width=13;
        double vol=obj.depth*obj.height*obj.width;
        System.out.println("Volume:"+vol);
    }
}
class volumeinput
{
    double depth;
    double height;
    double width;
}
        // TODO code application logic here
    
    

