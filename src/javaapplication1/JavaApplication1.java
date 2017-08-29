/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author cody
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int radius = 5;
        
        System.out.println("The circumference of this circle is " + circleCircum(radius));
    }
    
    public static double circleCircum(int radius){
        double answer = 2 * Math.PI * radius;
        return Math.round(answer * 100.0) / 100.0;
        
    }
    
}
