/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author cody
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a0", "a1", "a2", "b1", "c2", "c1", "a3", "a4", "a5", "a6", "a7", "a8", "a9");
        
        myList.stream().filter(str -> str.startsWith("a")).map(str -> str.toUpperCase()).forEach(item -> System.out.println("Sync: " + item));
        
        myList.parallelStream().filter(str -> str.startsWith("a")).map(str -> str.toUpperCase()).forEach(item -> System.out.println("Async: " + item));
        
    }
    
}
