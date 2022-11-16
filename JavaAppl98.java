
package javaappl98;

import java.util.Random;

public class JavaAppl98 {

    
    public static void main(String[] args) {
        int n = 5;
        System.out.println("znachenie max elements: " + maxElement(n));
    }

    private static int maxElement(int n) {
        Random rnd = new Random();
        int x, max = rnd.nextInt(10) - 9;
        System.out.println(max);
        for (int i = 1; i < n; i++) {
            x = rnd.nextInt(10) - 9;
            System.out.println(x);
            if(x > max) max = x;
        }
        return max;
            
    }
    
}
