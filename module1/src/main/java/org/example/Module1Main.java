package org.example;

/**
 * Hello world!
 *
 */
public class Module1Main
{
    public static void main( String[] args )
    {
        System.out.println("Input " + args[0]);
				System.out.println("Output " + new StringBuilder(args[0]).reverse());
    }
}
