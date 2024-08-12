     //Create the file named Homework10.java under src


         public class Homework10 {


        // Task 1: Introduction to Java
        // Print a welcome message to the console in uppercase
        // Expected Output: WELCOME TO JAVA PROGRAMMING!
        public static void javaIntro() {
            // Declare and initialize a String variable with the message
              String message = "WELCOME TO JAVA PROGRAMMING!";
            // Print the message
               System.out.println(message);

            }

        // Task 2: Java Get Started
        // Print the classic "Hello, World!" message with each word on a new line
        // Expected Output:
        // Hello,
        // World!
          public static void javaGetStarted() {
            // Declare and initialize a String variable with the message
            String s = "Hello, \nWorld!";
            // Print the message using newline characters
            System.out.println(s);

        }

        // Task 3: Java Syntax
        // Create a simple Java method that prints a message with a line break in the middle of the sentence
        // Expected Output: This is a simple
        // method in Java.
        public static void javaSyntax() {
            // Declare and initialize a String variable with the message
              String a = "This is a simple \nmethod in Java.";

            // Print the message with a line break in the middle
              System.out.println(a);

        }

        // Task 4: Java Output
        // Print a message and a number on the same line
        // Expected Output: The answer is: 42
        public static void javaOutput() {
            // Declare an integer variable with the value 42
                String s ="The answer is:";
                int i = (42);
            // Print a message concatenated with the integer variable
              System.out.println(s +" "+ i);

        }

        // Task 5: Print Text
        // Print a custom text message with its length
        // Expected Output: Learning Java is fun! (Length: 22)
        public static void printText() {
            // Declare and initialize a String variable with the message
              String s = "Learning Java is fun!";
            // Print the length of the message
               System.out.println(s + " (Length: "  +  s.length() +")");
        }

        // Task 6: Print Numbers
        // Print an integer and a double value
        // Expected Output: Integer: 123, Double: 45.67
        public static void printNumbers() {
            // Declare and initialize an integer and a double variable
            int  i = 123;
            double d = 45.67;
            String  is = "Integer:";
            String ds = " Double:";

            // Print both values
           System.out.println((is + i) + " " + ds + d);

        }


        // Task 7: Java Comments
        // Demonstrate single-line and multi-line comments
        // Expected Output: Single-line comment above
        // Expected Output: Multi-line comment above
        public static void javaComments() {
            // Single-line comment
               String s = "// - isaresi ile  ifade olunur";
               System.out.println(s);
            // Multi-line comment
            String g = "/* - isaresi ile  aciliir, */ - isaresi ile baglanir";
            System.out.println(g);
            // Print messages to demonstrate the comments


        }

        // Task 8: Java Variables
        // Declare and initialize different types of variables
        // Expected Output: Integer: 5, String: Hello, Boolean: true
        public static void javaVariables() {
            // Declare and initialize an integer, a String, and a boolean variable
               int  i = 5;
               String g = "Hello,";
               Boolean b = true;

            // Print all variables
            System.out.println("Integer: " + i  + ", String: " + g  + " Boolean: " + b);

        }

        // Task 9: Java Data Types
        // Demonstrate usage of different data types
        // Expected Output: Integer: 10, Double: 20.5, Char: A, Boolean: true
         public static void javaDataTypes() {
            // Declare and initialize variables of different data types
            int i = 10;
            double d = 20.5d;
            char  c = 'A';
            boolean b = true;
            // Print all variables
            System.out.print("Integer: " + i + ", ");
            System.out.print("Double: " + d + ", " );
            System.out.print("Char: " + c + ", ");
            System.out.println("Boolean: " + b);

        }

        // Task 10: Numbers
        // Perform basic arithmetic operations and print results
        // Expected Output: Sum: 30, Product: 200
        public static void numbers() {
            // Declare and initialize two integer variables
               int i = 30;
               int t = 200;
            // Print the results
             System.out.println("Sum: " + i + ", Product: " + t );


        }

        // Task 11: Booleans
        // Demonstrate boolean operations
        // Expected Output: Is Java fun? true
        // Expected Output: Is fish tasty? false
        public static void booleans() {
            // Declare and initialize two boolean variables
            boolean  IsJavafun = true;
            boolean  Isfishtasty = false;
            // Print both boolean values
          System.out.println("Is Java fun? " +  IsJavafun);
          System.out.println("Is fish tasty? " + Isfishtasty);
        }

        // Task 12: Calculate Area of a Rectangle
        // Calculate and print the area of a rectangle given the length and width
        // Formula: Area = length * width
        // Expected Output: Area of the rectangle with length 8 and width 5 is 40
        public static void calculateRectangleArea() {
            // Declare and initialize variables for length and width
            int length = 8;
            int width  = 5;
            int area = (length * width);
            // Print the area
             System.out.println("Area of the rectangle with length " + length + " and width " + width + " is " + (area));

        }

        // Task 13: Calculate Area of a Square
        // Calculate and print the area of a square given the side length
        // Formula: Area = side * side
        // Expected Output: Area of the square with side length 5 is 25
        public static void calculateSquareArea() {
            // Declare and initialize a variable for the side length
              int area = 25;
              int length = 5;
            // Print the area
             System.out.println("Area of the square with side length " + length + " is " + area );

        }

        // Task 14: Calculate Area of a Circle
        // Calculate and print the area of a circle given the radius
        // Formula: Area = π * radius^2
        // Expected Output: Area of the circle with radius 7 is 153.93804002589985
        public static void calculateCircleArea() {
            // Declare and initialize a variable for the radius
               int radius = 7;
               double d = 153.93804002589985;
            // Print the area
             System.out.println("Area of the circle with radius " + radius + " is " + d);



        }

        // Main method to run all tasks
        // Please do not modify the main method
        public static void main(String[] args) {
            javaIntro();
            javaGetStarted();
            javaSyntax();
            javaOutput();
            printText();
            printNumbers();
            javaComments();
            javaVariables();
            javaDataTypes();
            numbers();
            booleans();
            calculateRectangleArea();
            calculateSquareArea();
            calculateCircleArea();
        }
    }




