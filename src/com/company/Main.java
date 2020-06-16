package com.company;

import java.util.Random;
import java.util.Scanner;

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
    // **A Java program must have at least one class definition!**
    // A .java file can have many classes but only one public class.

    // These are class variables.  (See static method getPay.)
    public static double taxRateBracket01 = 0.1;
    public static double taxRateBracket02 = 0.12;

    // These are class constants:
    public static final double TAX_RATE_BRACKET01 = 0.1;
    public static final double TAX_RATE_BRACKET02 = 0.12;

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

        // Math library
        System.out.println(Math.sqrt(16));
        System.out.println(Math.E);

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
        // We can increment a by 1 using a++.
        a++;
        System.out.println(a);
        a += 1;
        System.out.println(a);

        // We can also do "inline initialization":'
        int c = 1234;
        int d = 99;
        int sum = c + d;

        // We can decrement c by 1 using c--.
        c--;
        System.out.println(c);

        // We can declare multiple variables on one line.
        int i, j;
        i = 1234;
        j = 99;

        int b = 10;
        System.out.println(b++);
        System.out.println(b);
        System.out.println(++b);

        // We can do multiple inline initializations on one line.
        int k = 1234, L = 99;
        System.out.println(k + L);

        // Here are inline initializations for non-integers:
        boolean classOver = false;
        double hourlyPayRate = 15.5;
        char firstInitial = 'T';

        System.out.println(firstInitial);

        // Generate one of 10 random integers 0-9 inclusive.
        Random rand = new Random();
        int num = rand.nextInt(10);
        System.out.println(num);

        // String declaration
        String name;
        // String initialization
        name = "Laura";
        System.out.println(name);

        // String inline initialization
        String name2 = "Katie";
        System.out.println(name2);

        // Inline string declaration "long form"
        String name3 = new String("Thomas");
        System.out.println(name3);

        String name4 = new String("Katie");

        // Calling a string method on a String object
        System.out.println(name3.toLowerCase());

        System.out.println(name2);
        System.out.println(name4);

        // Use the String method equals
        System.out.println(name4.equals(name2));
        // Do not use == for Strings (or any other objects)
        System.out.println(name4 == name2);

        // User input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userText = keyboard.nextLine();
        System.out.println(userText);

        // We can call a static method that we write ourselves.
        getPay(10, 10);
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
    public static void getPay(double hours, double payRate) {

        if (hours < 0){
            throw new IllegalArgumentException("Hours must be non-negative.");
        }
        if (payRate <= 12){
            throw new IllegalArgumentException("Pay rate must be at least $12/hour.");
        }
        /* Variables are local to the method in which they are defined
         * as in Python.
         * If we need a variable accessible to all the methods in a class,
         * for example, both main and getPay, then we can define a
         * *class* variable at the top of the class body.
         * In general, you should avoid using such global variables.
         * Instead, pass values as parameters to other methods as in Python.
         * An exception to this rule is class CONSTANTS.
         */
        double annualIncome = 9600;
        double taxRate;

        if (annualIncome <= 9700) {
            taxRate = TAX_RATE_BRACKET01;
        }
        else {
            taxRate = TAX_RATE_BRACKET02;
        }

        // There is a shorthand for if-else in this situation.
        double taxRate2;
        taxRate2 = annualIncome <= 9700 ? TAX_RATE_BRACKET01 : TAX_RATE_BRACKET02;

        System.out.println("Your pay is "+ hours * payRate);
        System.out.println("Your taxes are "+ hours * payRate * taxRate2);
    }
}
