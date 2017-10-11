/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import homework3.Homework3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author croof
 */
public class Homework3Test {
    
    public Homework3Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Homework2.
     */
    @Test
    public void testMain() {
        System.out.println("Skipping Main test");

    }

    /**
     * Test of run method, of class Homework2.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        List<Object> results = new ArrayList<>();
        List<Object> expected = Arrays.asList(1, "Fizz", "Buzz", "Fizz", 5, "FizzBuzz", 7);
        
        int X = 2;
        int Y = 3;
        int N = 7;
        Homework3.run(X, Y, N);
        
        for(int i=1; i <= N; i++){
            if(i % Y == 0 && i % X ==0){
                results.add("FizzBuzz");
            } else if(i % X == 0) {
                results.add("Fizz");
            } else if(i % Y == 0) {
                results.add("Buzz");
            } else {
                results.add(i);
            }
        }
        
        for(int i = 0; i < results.size(); i++){
            assertEquals(results.get(i), expected.get(i));
        }
    }
 @Test
    public void testRun2() {
        System.out.println("run");
        List<Object> results = new ArrayList<>();
        List<Object> expected = Arrays.asList(1, "Fizz", 3, "FizzBuzz", 5, "Fizz", 7);
        
        int X = 2;
        int Y = 4;
        int N = 7;
        Homework3.run(X, Y, N);
        
        for(int i=1; i <= N; i++){
            if(i % Y == 0 && i % X ==0){
                results.add("FizzBuzz");
            } else if(i % X == 0) {
                results.add("Fizz");
            } else if(i % Y == 0) {
                results.add("Buzz");
            } else {
                results.add(i);
            }
        }
        
        for(int i = 0; i < results.size(); i++){
            assertEquals(results.get(i), expected.get(i));
        }
    }
 @Test
    public void testRun3() {
        System.out.println("run");
        List<Object> results = new ArrayList<>();
        List<Object> expected = Arrays.asList(1, 2, "Fizz", 4, "Buzz", "Fizz", 7);
        
        int X = 3;
        int Y = 5;
        int N = 7;
        Homework3.run(X, Y, N);
        
        for(int i=1; i <= N; i++){
            if(i % Y == 0 && i % X ==0){
                results.add("FizzBuzz");
            } else if(i % X == 0) {
                results.add("Fizz");
            } else if(i % Y == 0) {
                results.add("Buzz");
            } else {
                results.add(i);
            }
        }
        
        for(int i = 0; i < results.size(); i++){
            assertEquals(results.get(i), expected.get(i));
        }
    }
    
}
