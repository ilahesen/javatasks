import java.util.Scanner;

public class Homework15 {

    // Create a Scanner object for user input

    // Task 1: while Loop - Print First N Natural Numbers
    // Instructions: Use a while loop to print the first N natural numbers (1 to N), where N is provided by the user.
    // Expected Result: For N = 10, the output should be: 1 2 3 4 5 6 7 8 9 10
    private static void printFirstNNaturalNumbers() {
        // Implementation goes here
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter a number ");
        int s = sc.nextInt();
        int N = 10;
        int a = 1;
        while (a<=N) {
        System.out.print(a + " ");
        a++;
        }
        System.out.println(" ");
    }

    // Task 2: do-while Loop - User Input Validation
    // Instructions: Use a do-while loop to keep asking the user to enter a positive number until they do so.
    // Expected Result: Program should continue prompting until a positive number is entered.
    private static void userInputValidation() {
        // Implementation goes here
        Scanner sc = new Scanner(System.in);
        int num;
        do {
        System.out.println( "Enter a  positive number: ");
        num = sc.nextInt();
        } while (num <= 0);
        System.out.println("You entered a positive number: " +" "+ num);

        }

    // Task 3: for Loop - Sum of Array Elements
    // Instructions: Calculate the sum of all elements in a statically declared integer array using a for loop.
    // Expected Result: For an array {1, 2, 3, 4, 5}, the output should be: Sum = 15
    private static void sumOfArrayElements() {
        // Implementation goes here
        System.out.println("Task: 3 ");
        int [] arrayInt = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i: arrayInt)
        {
        sum += i;
        i++;
        }
        System.out.println("Sum " + sum);
        }

    // Task 4: for Loop - Multiplication Table
    // Instructions: Print the multiplication table of a number provided by the user using a for loop.
    // Expected Result: For a multiplier of 5, the output should be: 5 * 1 = 5, 5 * 2 = 10, ..., 5 * 10 = 50
    private static void multiplicationTable() {
        // Implementation goes here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a =sc.nextInt();

        for(int i =1; i <= 10; i++){

            System.out.println(a + " * " + i + " = "+ a*i);
        }

        }

    // Task 5: for-each Loop - Print Array Elements
    // Instructions: Use a for-each loop to print all elements of a statically declared integer array.
    // Expected Result: For an array {10, 20, 30, 40}, the output should be: 10 20 30 40
    private static void printArrayElementsWithForEach() {
        // Implementation goes here
        System.out.println("Task: 5 ");
        int[] c = {10, 20, 30, 40};
        for (int num: c)
        System.out.print( num + " ");
        System.out.println(" ");
        }

    // Task 6: Nested for Loop - Print a Square of Stars
    // Instructions: Prompt the user to enter the side length of a square and use a nested for loop to print the square of stars.
    // Expected Result: For a side length of 5, the output should be: ***** (5 lines of 5 stars each)
    private static void printSquareOfStars() {
        // Implementation goes here
        Scanner sc = new Scanner(System.in);
        System.out.println("Task: 6 ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
        System.out.print(" * ");
        }
        System.out.println(" ");
        }
        }
    // Task 7: Nested for Loop - Multiplication Table (1 to N)
    // Instructions: Use nested for loops to print the multiplication tables for numbers 1 to N, where N is provided by the user.
    // Expected Result: For N = 5, tables from 1 * 1 to 5 * 10.
    private static void multiplicationTable1ToN() {
        // Implementation goes here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        for ( int i=1; i<=a; i++)
        {
        for (int j = 1; j <= 10; j++){

        System.out.println(i  + " * " + j );
        }
        }
        }

    // Task 8: while Loop - Find First N Even Numbers
    // Instructions: Use a while loop to find and print the first N even numbers, where N is provided by the user.
    // Expected Result: For N = 5, the output should be: 2 4 6 8 10
    private static void findFirstNEvenNumbers() {
        // Implementation goes here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int i2 =2;
        while (n>=1){
        System.out.print(i2 +" ");
        n--;
        i2 +=2;
        }
        System.out.println(" ");
        }

    // Task 9: Array and for-each Loop - Count Even Numbers
    // Instructions: Count the number of even numbers in a statically declared integer array using a for-each loop.
    // Expected Result: For an array {3, 7, 2, 9, 5, 8, 10}, the output should be: Number of even elements = 3
    private static void countEvenNumbers() {
        // Implementation goes here
        System.out.println("Task: 9 " );
        int [] n2 = {3,7,2,9,5,8,10};
        int n3 =0;
        for(int n: n2)
        {
        if (n% 2 ==0){
        n3++;
        }
        }
        System.out.println("number of even elements = " + n3);
        }

    // Task 10: for-each Loop - Print String Array Elements
    // Instructions: Use a for-each loop to print all elements of a statically declared string array.
    // Expected Result: For an array {"apple", "banana", "cherry"}, the output should be: apple banana cherry
    private static void printStringArrayElements() {
        // Implementation goes here
        System.out.println("Task: 10 ");
        String [] fruits ={"apple", "banana", "cherry"};
        for (String fruit : fruits){
        System.out.print(fruit + " ");}


    }

    public static void main(String[] args) {
        // Call each task method
        printFirstNNaturalNumbers();
        userInputValidation();
        sumOfArrayElements();
        multiplicationTable();
        printArrayElementsWithForEach();
        printSquareOfStars();
        multiplicationTable1ToN();
        findFirstNEvenNumbers();
        countEvenNumbers();
        printStringArrayElements();
    }
}
