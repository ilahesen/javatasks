public class HomeWork12 {

    public static void main(String[] args) {
        analyzeBooleanValues();
        mergeStringWithNumber();
        convertStringCase();
        generateRandomNumber();
        demonstrateCharacterOperations();
        calculateTriangleArea();
        useEscapeSequences();
        applyExplicitTypeCasting();
        exploreStringMethods();
        illustrateLogicalOperators();
        performComplexArithmetic();
        displayDataTypes();
    }

    // Task 1: Analyze Boolean Values - Determine the outcome of various logical conditions
    public static void analyzeBooleanValues() {
        // Instructions: Define boolean variables and evaluate different logical expressions. Print the results.
        // Expected output:
        // Is Java versatile? true
        // Is Python slow? false
        // Is Java versatile and Python slow? false
        // Is Java versatile or Python slow? true

        // Declare variables:
            boolean b1 = true;
            boolean b2 = false;
            boolean b3 = false;
            boolean b4 = true;
        // Print results:
           System.out.println("Is Java versatile? " + b1);
           System.out.println("Is Python slow? " + b2);
           System.out.println("Is Java versatile and Python slow? " + b3);
           System.out.println("Is Java versatile or Python slow? " + b4);

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 2: Merge String with Number - Concatenate a string and a number in a formatted message
    public static void mergeStringWithNumber() {
        // Instructions: Combine a string with a number and print the result.
        // Expected output:
        // The total is 50

        // Declare variables:
            int num = 50;
            String  s = "The total is";
        // Concatenate and print:
            System.out.println(s + " "+ num);

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 3: Convert String Case - Change the case of characters in a string
    public static void convertStringCase() {
        // Instructions: Convert a string to uppercase and lowercase, then print the results.
        // Expected output:
        // Uppercase: JAVA PROGRAMMING
        // Lowercase: java programming

        // Declare variable:
           String txt = "Java programming";
        // Convert and print:
            System.out.println(txt.toUpperCase());
            System.out.println(txt.toLowerCase());
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 4: Generate Random Number - Produce a random number within a specified range
    public static void generateRandomNumber() {
        // Instructions: Generate a random number between 96 and 330 and print the result.
        // Expected output:
        // Random number between 96 and 330: <random number>

        // Declare variables:

        double randomNumber = Math.random() * (96 - 330);
        // Print result:
        System.out.println("Random number between 96 and 330: " + randomNumber);
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 5: Demonstrate Character Operations - Show the result of character arithmetic and ASCII value
    public static void demonstrateCharacterOperations() {
        // Instructions: Define a char variable and perform operations such as finding its ASCII value and the next character in the sequence. Print the results.
        // Expected output:
        // Character: C
        // ASCII value: 67
        // Next character: D
           char c = 'C';
           char next = 'D';
        // Declare variable:

        // Print results:
          System.out.println("Character: " + c);
          System.out.println("ASCII value: " + (int) c);
          System.out.println("Next character: " + next);
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 6: Calculate Triangle Area - Find the area of a right triangle
    public static void calculateTriangleArea() {
        // Instructions: Define base and height of a right triangle and calculate the area. Print the result.
        // Formula: Area = 0.5 * base * height

        // Declare variables:
            float f = 0.5f;
            float base = 5.2f;
            float heigth = 3.4f;
            float area = (f * base * heigth );

        // Calculate and print area:

        System.out.println("Formula: " +  area );

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 7: Use Escape Sequences - Show the use of escape sequences in a formatted string
    public static void useEscapeSequences() {
        // Instructions: Define a string with escape sequences and print it.
        // Expected output:
        // Formatted string with escape sequences: Here is a new line:\nHere is a tab:\tAnd a backslash:\\

        // Declare variable:
          String a = "Here is a new line:";
          String b = "Here is a tab:";
          String c = "And a backslash:";
        // Print result:
        System.out.println("Formatted string with escape sequences: " + a +"\\"+ "n"+  b + "\\" +"t" + c+ "\\\\");
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 8: Apply Explicit Type Casting - Cast between floating-point and integer types
    public static void applyExplicitTypeCasting() {
        // Instructions: Perform explicit type casting between float and int, and int and double. Print the results.
        // Expected output:
        // Float value: 12.34
        // Casted to int: 12
        // Int value: 45
        // Casted to double: 45.0

        // Declare variables:
           float f = 12.34f;
           int  a = (int)f;
           int value = 45;
           double b = (double)value;
        // Print results:
          System.out.println("Float value: " + f);
          System.out.println("Casted to int: " + a);
          System.out.println("Int value: " + value);
          System.out.println("Casted to double: " + b);

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 9: Explore String Methods - Use length() and indexOf()
    public static void exploreStringMethods() {
        // Instructions: Define a String variable and use length() and indexOf() methods. Print the results.
        // Expected output:
        // Length of string: 11
        // Index of 'e': 1

        // Declare variables:
          String a = "11";
          String b = "1";
        // Print results:
         System.out.println("Length of string: " + a);
         System.out.println("Index of 'e': " + b);
        System.out.println("-----------");  // Do not touch this line
    }

    // Task 10: Illustrate Logical Operators - Evaluate expressions using different logical operators
    public static void illustrateLogicalOperators() {
        // Instructions: Use various logical operators to evaluate expressions. Print the results.
        // Expected output:
        // a & b = false
        // a | b = true
        // !(a && b) = true
           int a  = 3;
           int b = 2;

        // Declare variables:

        // Print results:
           System.out.println("a & b = " + ( a > b && a < b));
           System.out.println("a | b = " + (a > b || a < b));
            System.out.println("a | b = " + !(a > b && a < b));

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 11: Perform Complex Arithmetic - Compute the result of multiple arithmetic expressions
    public static void performComplexArithmetic() {
        // Instructions: Define variables and compute the result of several arithmetic expressions. Print the results.
        // Expected output:
        // Sum: 45
        // Difference: 15
        // Product: 150
        // Quotient: 5

        // Declare variables:
           int a = 30;
           int b = 15;
           int c = 5;
           int d = 6;

        // Print results:
          System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * c));
        System.out.println("Quotient:" + (a / d));


        System.out.println("-----------");  // Do not touch this line
    }

    // Task 12: Display Data Types - Print the default values of different data types
    public static void displayDataTypes() {
        // Instructions: Define variables of different primitive data types (byte, short, long, double, boolean). Print each variable.
        // Expected output:
        // Byte: 0
        // Short: 0
        // Long: 0
        // Double: 0.0
        // Boolean: false

        // Declare variables:
          byte b = 0;
          short s = 0;
          long l = 0;
          double d = 0.0d;
          boolean b1 = false;
        // Double:

        // Print variables:
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Long: " + l);
        System.out.println("Double: " + d);
        System.out.println("Boolean: " + b1);


        System.out.println("-----------");  // Do not touch this line
    }
}
