package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Valores pares:");
        for (int n = 0; n < 101; n++) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
    }
}
