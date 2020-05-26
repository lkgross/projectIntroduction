package com.company;

/**
 * Class Main
 * This class is a container for a Hello-World program.
 */
/* This "class" is a "container" for our program.
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
        // Statements in Java end in a semi-colon.
        System.out.print("Hello, World!\n");
        System.out.println("What is the name of your planet?");
        System.out.println("Is this Tatooine?");
    }
}
