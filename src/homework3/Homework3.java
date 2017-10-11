/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cody
 */
public class Homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        run(2, 3, 7);
    }
    
    public static void run (int X, int Y, int N) {
        List<Object> results = new ArrayList<>();
        
        if(X < 1 || X > Y){
            throw new IllegalArgumentException("X must be greater than or equal to 1 but less than Y, your X value: " + X + ", your Y value: " + Y);  
        }
        if(Y > N){
            throw new IllegalArgumentException("Y must be less than or equal to N, your Y value: " + Y + ", your N value: " + N);  
        }
        if(N < Y || N > 100){
            throw new IllegalArgumentException("N must be greater than Y but less than 100, your N value: " + N);  
        }
        
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
        
        /*
        for(int i = 0; i < results.size(); i++){
            System.out.println(results.get(i));
        }
        */
    }
    
}
