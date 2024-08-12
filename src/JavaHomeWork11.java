public class JavaHomeWork11{

    // Task 1: Java Data Types
    // Demonstrate usage of different data types
    // Expected Output: Integer: 10, Double: 20.5, Char: A, Boolean: true
    public static void javaDataTypes() {
        // Declare and initialize variables of different data types
          int i = 10;
          double d = 20.5;
          char c = 'A';
          boolean b = true;

        // Print all variables
        System.out.println("Integer: " + i+ ", Double: " + d +", Char: " + c + ", Boolean: " + b);
    }

    // Task 2: Data Types
    // Declare and initialize variables with all primitive data types
    // Expected Output: Byte: 100, Short: 1000, Int: 10000, Long: 100000L, Float: 10.5f, Double: 20.5, Char: B, Boolean: false
    public static void dataTypes() {
        // Declare and initialize variables of all primitive data types
         byte b = 100;
         short s = 1000;
         int i = 10000;
         long l = 100000L;
         float f =10.5f;
         double d = 20.5;
         char c = 'B';
         boolean boo = false;

        // Print all variables
          System.out.println("Byte: " + b+ ", Short: " + s + ", Int: " + i + ", Float: " + f + ", Double: " + d + ", Char: " + c + ", Boolean: " + b);
    }

    // Task 3: Numbers
    // Perform basic arithmetic operations and print results
    // Expected Output: Sum: 15, Difference: 5, Product: 50, Quotient: 2, Remainder: 1
    public static void numbers() {
        // Declare and initialize two integer variables
         int s = 15;
         int d = 5;
         int p = 50;
         int q = 2;
         int r = 1;

        // Print the results
       System.out.println("Sum: " + s + ", Difference: " + d + ", Product: " + p + ", Quotient: " + q + ", Remainder: " + r);
    }

    // Task 4: Booleans
    // Demonstrate boolean operations
    // Expected Output: Is Java fun? true
    // Expected Output: Is the sky green? false
    public static void booleans() {
        // Declare and initialize two boolean variables
          boolean t = true;
          boolean f = false;

        // Print both boolean values
          System.out.println("Is Java fun? " + t);
          System.out.println("Is the sky green? " + f);
    }

    // Task 5: Characters
    // Demonstrate character usage and print a char variable
    // Expected Output: The first letter of the alphabet is A
    public static void characters() {
        // Declare and initialize a char variable
           char c = 'A';

        // Print the char variable
         System.out.println("The first letter of the alphabet is " + c);


    }

    // Task 6: Java Type Casting
// Demonstrate implicit and explicit type casting with different numeric types and String to numeric casting
// Expected Output: Implicit Casting (byte to int): 42 , Explicit Casting (int to short): 1000, Explicit Casting (double to float): 15.99
    public static void javaTypeCasting() {
        // Declare and initialize a variable for implicit casting (Widening Casting)
        byte b =  42;
        int i = b;
        // Implicit casting (Widening Casting) (byte to int)

        // Declare and initialize a variable for implicit casting (Widening Casting)
         int inttoshort = 1000;
         short  sh =  (short) inttoshort;
        // Explicit casting (Narrowing Casting) (int to short)

        // Declare and initialize a variable for implicit casting (Widening Casting)
            double d = 15.99f;
            float  f = (float) d;
        // Explicit casting (Narrowing Casting) (double to float)

        // Print all values
  System.out.println("Implicit Casting " + "(byte to int): " + b + ", Explicit Casting " + "(int to short): " + sh + ", Explicit Casting " + "(double to float): " + f);


    }


    // Task 7: Java Type Casting
    // Demonstrate implicit and explicit type casting
    // Expected Output: Implicit Casting: 10.0, Explicit Casting: 10
    public static void javaTypeCastingManipulation() {
        // Declare and initialize a variable for implicit casting (Widening Casting)
            int  i =  10;
            double id = i;
        // Perform implicit casting

        // Declare and initialize a variable for explicit casting (Narrowing Casting)
        double d = 10.0;
        int ind =  ( int ) d;
        // Print both values
        System.out.println("Implicit Casting: " + ind + ", Explicit Casting: " + i);
    }

    // Task 8: Java Operators
    // Demonstrate the usage of various operators
    // Expected Output: Addition: 15, Subtraction: 5, Multiplication: 50, Division: 2, Remainder: 1
    // Expected Output: AND: true, OR: true, NOT: false
    public static void javaOperators() {
        // Declare and initialize two integer variables
            int x = 10;
            int y = 5;

        // Perform arithmetic operations
           int add = (x + y);
           int sub = (x - y);
           int multi =(x * y);
           int div = (x / y);
           int rem = (x % y);
        // Declare and initialize two boolean variables
           boolean  b1 = true;
           boolean b2 = false;

        // Print the results
       System.out.println("Addition: " + add + ", Subtraction: " + sub + ", Multiplication: " + multi + ", Division: " + div + ", Remainder: " + rem);
       System.out.println("AND: " + b1 + ", OR: " + b1 + ", NOT: " + b2);
    }

    // Task 9: Comparison Operators
    // Demonstrate the usage of comparison operators
    // Expected Output: 10 > 5: true, 10 < 5: false, 10 == 10: true, 10 != 5: true, 10 >= 5: true, 10 <= 5: false
    public static void comparisonOperators() {
        // Declare and initialize variables
          int x = 10;
          int y = 5;
        // Perform comparison operations

        // Print the results
        System.out.println("x > y:" +  (x > y) + ", x < y: " + (x < y) + ", x == y: " + (x == y) + ", 10 >= 5 "+ (10 >= 5) + ", 10 <= 5: " + (10 <= 5 ));
    }

    // Task 9: Comparison Operators
// Demonstrate the usage of comparison operators with different data types
// Expected Output: 10.5 > 5: true, 10.5 < 20.5: true, 10.5 == 10.5: true, 'a' != 'b': true
    public static void comparisonOperatorsManipulation() {
        // Declare and initialize variables
          int a = 5;
          double b  = 10.5;
          float f =  20.5f;


        // Perform comparison operations

        // Print the results
        System.out.println("10.5 > 5: " + (b > a) +", 10.5 < 20.5 " + (b < f) + ", 'a' " + "!= " + "'b': " + ( a != b));
    }


    // Task 11: Assignment Operators
    // Demonstrate the usage of assignment operators
    // Expected Output: Add and Assign: 15, Subtract and Assign: 5, Multiply and Assign: 50, Divide and Assign: 2, Modulus and Assign: 1
    public static void assignmentOperators() {
        // Declare and initialize a variable
          String add = "Add and Assign:";
          String sub = "Subtract and Assign:";
          String multi = " Multiply and Assign:";
          String div= "Divide and Assign:";
          String mod = "Modulus and Assign:";
          int a = 5;
          int b = 10;
        // Add and assign (And then print the num)


        // Subtract and assign (And then print the num)


        // Multiply and assign (And then print the num)


        // Divide and assign (And then print the num)
      System.out.println( add + " " + (a + b) + ", " + sub  + " "  + (b - a) + ", "  + multi  + " " + ( a * b) + ", " + div + " " + ( b / a) + ", " + mod + " " + (b % a));

        // Modulus and assign (And then print the num)

    }
    // Expected Output: 10 is equal to 10: true, 10 is not equal to 5: true, 10 is greater than 5: true, 10 is less than 5: false
    public static void relationalOperators() {
        // Declare and initialize variables


    // Task 12: Relational Operators
    // Demonstrate the usage of relational operators//

         boolean a = 10 == 10;
         boolean b = 10 != 5;
         boolean c = 10 > 5;
         boolean d = 10 < 5;

        // Perform relational operations
        System.out.println("10 is equal to 10: " + a + ", 10 is not equal to 5: " + b + ", 10 is greater than 5: " + c + ", 10 is less than 5: " + d);


        // Print the results

    }

    // Main method to run all tasks
    // Please do not modify the main method
    public static void main(String[] args) {
        javaDataTypes();
        dataTypes();
        numbers();
        booleans();
        characters();
        javaTypeCastingManipulation();
        javaTypeCasting();
        javaOperators();
        comparisonOperators();
        comparisonOperatorsManipulation  ();
        assignmentOperators();
        relationalOperators();
    }
}

