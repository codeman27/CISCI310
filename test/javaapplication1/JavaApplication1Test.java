/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cody
 */
public class JavaApplication1Test {
    

    /**
     * Test of circleCircum method, of class JavaApplication1.
     */
    @Test
    public void testCircleCircum() {
        System.out.println("circleCircum");
        int radius = 5;
        double expResult = 31.42;
        double result = JavaApplication1.circleCircum(radius);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCircleCircum2() {
        System.out.println("circleCircum");
        int radius = 2;
        double expResult = 12.57;
        double result = JavaApplication1.circleCircum(radius);
        assertEquals(expResult, result, 0.0);
    }
    
}
