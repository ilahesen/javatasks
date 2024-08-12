import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.ref.SoftReference;


public class Lab11_Tasks {

    public static void main(String[] args) {
        printDataTypes();
        performArithmeticOperations();
        evaluateBooleanExpressions();
        useCharDataType();
        calculateRectangleArea();
        useStringDataType();
        performTypeCasting();
        demonstrateOperators();
        concatenateStrings();
        combineNumbersAndStrings();
        useSpecialCharacters();
        useMathClassMethods();
    }

    // Task 1: Java Data Types - Define and print different data types
    public static void printDataTypes() {
        // Instructions: Define variables of different primitive data types (int, float, double, char, boolean). Print each variable.
        // Expected output:
        // Integer: 10
        // Float: 20.5
        // Double: 30.123
        // Char: A
        // Boolean: true

        // Declare variables:
            int a = 10;
            float f = 20.5f;
             double d = 5;
             char  c = 'A';
             boolean b = true;

        // Print variables:
        System.out.println("Integer: " + a);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + b);


        System.out.println("----------");  // Do not touch this line
    }

    // Task 2: Numbers - Perform arithmetic operations
    public static void performArithmeticOperations() {
        // Instructions: Define two integer variables and perform addition, subtraction, multiplication, and division. Print the results.
        // Expected output:
        // Addition: 20
        // Subtraction: 10
        // Multiplication: 75
        // Division: 3

        // Declare variables:
           int a = 15;
           int b = 5;

        // Print results:

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));




        System.out.println("-----------");  // Do not touch this line
    }

    // Task 3: Booleans - Use boolean variables in expressions
    public static void evaluateBooleanExpressions() {
        // Instructions: Define boolean variables and use them in logical expressions. Print the results.
        // Expected output:
        // Is Java fun? true
        // Is fish tasty? false
        // Is Java fun and fish tasty? false
        // Is Java fun or fish tasty? true

        // Declare variables:
           boolean IsJavaFun = true;
           boolean Isfishtasty = false;
           System.out.println("Is Java fun? " + IsJavaFun );
           System.out.println("Is fish tasty? " + Isfishtasty);
           System.out.println("Is Java fun and fish tasty? " + ( IsJavaFun && Isfishtasty));
          System.out.println("Is Java fun or fish tasty? "  +(IsJavaFun || Isfishtasty));
        // Print results:

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 4: Characters - Use char data type
    public static void useCharDataType() {
        // Instructions: Define a char variable and print it. Print the ASCII value of the character.
        // Expected output:
        // Grade: B
        // ASCII value of grade: 66

        // Declare variable:
        char grade = 'B';
        // Print results:

        System.out.println("Grade: " + grade);
        System.out.println( "ASCII value of grade: " + (int) grade);
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 5: Real-Life Example - Calculate area of a rectangle
    public static void calculateRectangleArea() {
        // Instructions: Define length and width of a rectangle as double variables. Calculate and print the area.
        // Formula: Area = length * width

        // Declare variables:
           double  length = 5.6;
           double  width = 6.5;

        // Calculate and print area:
        System.out.println("Area: " + (length * width));
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 6: Non-primitive Types - Use String data type
    public static void useStringDataType() {
        // Instructions: Define a String variable and print it. Print the length of the string.
        // Expected output:
        // Greeting: Hello, World!
        // Length of greeting: 13

        // Declare variable:
           String greeting = "Hello, World!";
           System.out.println("Greeting: " + greeting);
           System.out.println("Length of greeting: " + greeting.length());

        // Print results:

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 7: Java Type Casting - Perform type casting
    public static void performTypeCasting() {
        // Instructions: Cast a double to an int and print the result. Cast an int to a double and print the result.
        // Expected output:
        // Double value: 9.78
        // Casted to int: 9
        // Int value: 100
        // Casted to double: 100.0

        // Declare variables:
           double a = 9.78;
           int value = (int) a;
          int bvalue = 100;
           double cvalue = bvalue;
        // Print results:
           System.out.println("Double value: " + a);
           System.out.println("Casted to int: " + (int)value);
           System.out.println("Int value: " + bvalue);
           System.out.println("Casted to double: " + cvalue);

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 8: Java Operators - Use different operators
    public static void demonstrateOperators() {
        // Instructions: Use arithmetic, relational, and logical operators. Print the results.
        // Expected output:
        // a + b = 30
        // a > b = false
        // a < b && b > 15 = true

        // Declare variables:
            int a = 10;
            int b = 20;
            System.out.println("a + b =  " + (a + b));
        System.out.println("a > b = " + (a > b ));
        System.out.println("a < b && b > 15 = " + (a < b  && b > 15));


        // Print results:

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 9: Java Strings - String concatenation
    public static void concatenateStrings() {
        // Instructions: Concatenate two strings and print the result.
        // Expected output:
        // Concatenated string: Hello World
        String a = "Hello";
        String b = "World";
        System.out.println( a + " " + b );

        // Declare variables:

        // Concatenate and print:

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 10: Numbers and Strings - Combine numbers and strings
    public static void combineNumbersAndStrings() {
        // Instructions: Combine a string with a number and print the result.
        // Expected output:
        // The number is 100

        // Declare variables:
    String a = "The number is";
     int b = 100;
     System.out.println( a + " " + b);

    // Print result:

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 11: Special Characters - Use special characters in strings
    public static void useSpecialCharacters() {
        // Instructions: Define a string with special characters like new line (\n) and tab (\t). Print the string.
        // Expected output:
        // String with special characters:
        // Line1
        // Line2	Tabbed
             String text ="String with special characters:";
             String  a = "Line1";
             String  b = "Line2";
             String c = "Tabbed";
             System.out.println(text + "\n" + a + "\n" + b +"\t"+ c);


        // Declare variable:

        // Print result:

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 12: Java Math - Use Math class methods
    public static void useMathClassMethods() {
        // Instructions: Use methods from the Math class to perform different calculations. Print the results.
        // Expected output:
        // Square root of 16: 4.0
        // Random value between 57 and 260: <random value between 57 and 260>

        // Declare variables:
           double squareRoot = Math.sqrt(16);
           double randomNumber = 57 + Math.random() * (260-57);
        System.out.println("Square root of 16: " + squareRoot);
        System.out.println("Random value between 57 and 260:" + randomNumber);
        // Print results:

        System.out.println("-----------");  // Do not touch this line
    }
}
