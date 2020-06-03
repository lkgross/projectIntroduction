package com.company;

/**
 * Class Main
 * This class is a container for a Hello-World program.
 * This comment is a documentation comment.  Note its syntax.
 * It can be used to describe a class or method.
 */
/* This "class" is a "container" for our program.
   This comment is a standard "multi-line comment".
   The following line is called a "class header":
 */
public class Main { // The name of the class is Main.
    // The keyword "public" is called an "access modifier."
    // In Java, we use a capitalized name for a class (e.g., Main).

    // In Python you wrote functions.  In Java we talk about "static methods".
    // The following line is called a "method header":
    public static void main(String[] args) { // The name of the method is main.
        // The body of the static method main is enclosed in braces ({}).
        // In Python you used indentation.  In Java, you use braces.
        // Statements in Java end in a semi-colon (;).


        System.out.print("Hello, World!\n");
        System.out.println("What is the name of your planet?");
        System.out.println("Is this Tatooine?");

        System.out.println();

        /* Play around with computation on compute with integers,
           floating-point numbers, Booleans, strings, and characters,
           known to Java as int, double, boolean, String, and char,
           respectively. Consult the Java Reference Card (JRC).
           */

        // Addition of integers
        System.out.println(5 + 7);

        // The modulus operator for finding the remainder
        System.out.println(12 % 3);

        System.out.println(true && false); // and
        System.out.println(true || false); // or
        System.out.println(!true); // not

        System.out.println("Laura" + "Gross"); // concatentation


        System.out.println('L' + 'G');
        // Here we added the unicode integers for the characters!

        // Mixed-type arithmetic
        System.out.println(5. + 7);
        System.out.println(7/5.);
        System.out.println(7./5);

        // Decimal divide
        System.out.println(7./5.);

        // Integer divide
        System.out.println(7 / 5); // Watch out!!
        // Information is typically lost in an integer divide!!

        // Java is a strongly typed language.
        // Variables must be "declared" (by type).

        int a; // Variable declaration
        a = 1234; // Variable initialization

        // We can also do "inline initialization":'
        int c = 1234;
        int d = 99;
        int sum = c + d;

        // We can declare multiple variables on one line.
        int i, j;
        i = 1234;
        j = 99;

        // We can do multiple inline initializations on one line.
        int k = 1234, L = 99;
        System.out.println(k + L);

        // Here are inline initializations for non-integers:
        boolean classOver = false;
        double hourlyPayRate = 15.5;
        String name = "Katie";
        char firstInitial = 'T';

        System.out.println(firstInitial);

        // We can call a static method that we write ourselves.
        System.out.println(getPay(40, 15));
    }

    /**
     * static method getPay returns total pay
     *
     * @param hours
     * @param payRate
     */
    // Note the syntax of the method header.
    // Include the type of the returned value in the header.
    // If no value is returned, use "void" instead. (See main method header.)
    public static double getPay(double hours, double payRate) {
        return hours * payRate;
    }
}
