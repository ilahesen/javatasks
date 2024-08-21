
import java.util.Scanner;

public class Homework14 {

    // Task 1: Multiplication of First N Numbers (While Loop)
    // Instruction: Write a program that takes user input for a number N and calculates the product of numbers from 1 to N using a while loop.
    // Expected Result: If the user inputs 5, the output should be "Product: 120" (since 1*2*3*4*5=120).
    public static void multiplicationOfFirstNNumbersWhile() {
        // Implementation here
        Scanner sc = new Scanner(System.in);
        System.out.println( "N ededini daxil edin ");
        int N =sc.nextInt();
        int  n = 1;
        while (N>=1){
        n=n*N;
        N-=1;
        }
        System.out.println("Product: " + n);
        }

    // Task 2: Count from N to 20 (Do-While Loop)
    // Instruction: Write a program that takes user input for a number N and prints numbers from N to 20 using a do-while loop.
    // Expected Result: If the user inputs 17, the output should be "17 18 19 20".
    public static void countFromNTo20DoWhile() {
        // Implementation here
        Scanner n = new Scanner(System.in);
        System.out.println("Enter N ");
        int N= n.nextInt();
        do {
        System.out.print(N + " ");
        N++;
        }
        while (N<=20);
        System.out.println(" ");
        }

    // Task 3: Print Numbers from 1 to N (For Loop)
    // Instruction: Write a program that takes user input for a number N and prints all numbers from 1 to N using a for loop.
    // Expected Result: If the user inputs 5, the output should be "1 2 3 4 5".
    public static void printNumbersFor() {
        // Implementation here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N ");
        int  i = sc.nextInt();
        for ( i = 1; i <= 5; i++) {
        System.out.print(i + " ");
        }
        System.out.println(" ");
        }

    // Task 4: Sum of Even Numbers from 1 to N (While Loop)
    // Instruction: Write a program that takes user input for a number N and calculates the sum of all even numbers from 1 to N using a while loop.
    // Expected Result: If the user inputs 10, the output should be "Sum of even numbers: 30" (since 2+4+6+8+10=30).
    public static void sumOfEvenNumbersWhile() {
        // Implementation here
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number N ");
        int N = n.nextInt();
        int sum = 0;
        int s = 2;
        while (N>=s) {
        sum+=s;
        s+=2;
        }
        System.out.println("Sum of even numbers: " + sum);
        }
    // Task 5: Print Digits of a Number in Reverse with Spaces (Do-While Loop)
    // Instruction: Write a program that takes user input for a number and prints its digits in reverse order with spaces between them using a do-while loop.
    // Expected Result: If the user inputs 12345, the output should be "5 4 3 2 1".
    public static void printDigitsReverseWithSpacesDoWhile() {
        // Implementation here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number ");
        int num = sc.nextInt();
        do {
        System.out.print(num%10+ " ");
        num/=10;        }
        while ( num > 0);
        System.out.println("");
        }

    // Task 6: Calculate Factorial of a Number (For Loop)
    // Instruction: Write a program that takes user input for a number N and calculates its factorial using a for loop.
    // Expected Result: If the user inputs 5, the output should be "Factorial: 120" (since 5! = 5*4*3*2*1 = 120).
    public static void calculateFactorialFor() {
        // Implementation here
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter a number N ");
        int N = sc.nextInt();
        int i;
        int fact =1;
        for ( i = 1 ; i<=N; i++) {
        fact = fact*i;
        }
        System.out.println("Factorial of " + N + " is: " + fact);
        }

    // Task 7: Print Numbers from N to 1 in Reverse Order (While Loop)
    // Instruction: Write a program that takes user input for a number N and prints all numbers from N to 1 in reverse order using a while loop.
    // Expected Result: If the user inputs 5, the output should be "5 4 3 2 1".
    public static void printNumbersInReverseWhile() {
        // Implementation here
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter a number N ");
        int N = sc.nextInt();
        int i = 0;
        while (N>=1){
        System.out.print(N + " ");
        N--;
        }
        System.out.println(" ");
        }

    // Task 8: Print Odd Numbers from 1 to N (Do-While Loop)
    // Instruction: Write a program that takes user input for a number N and prints all odd numbers from 1 to N using a do-while loop.
    // Expected Result: If the user inputs 10, the output should be "1 3 5 7 9".
    public static void printOddNumbersDoWhile() {
        // Implementation here
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number N ");
        int N = n.nextInt();
        int i =1;

        while (i<=N) {
        System.out.print(i + " ");
        i=i+2;
        }
        }

    // Task 9: Count Down from N to 1 (For Loop)
    // new code
    // Instruction: Write a program that takes user input for a number N and prints numbers from N down to 1 using a for loop.
    // Expected Result: If the user inputs 5, the output should be "5 4 3 2 1".
    public static void countDownFromNTo1For() {
        // Implementation here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number N ");
        int N = sc.nextInt();
        for (int i = N; i>=1; i--) {
        System.out.print(i + " ");
        }
        System.out.println(" ");
        }

    // Task 10: Print Sum of Numbers from 1 to N (While Loop)
    // Instruction: Write a program that takes user input for a number N and calculates the sum of all numbers from 1 to N using a while loop.
    // Expected Result: If the user inputs 5, the output should be "Sum: 15" (since 1+2+3+4+5=15).
    public static void sumOfNumbersWhile() {
        // Implementation here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number N ");
        int N = sc.nextInt();
        int sum = 0;
        while (N>=1) {
        sum = sum+N;
        N--;
        }
        System.out.println("Sum " + sum);
        }

    public static void main(String[] args) {
       multiplicationOfFirstNNumbersWhile();
       countFromNTo20DoWhile();
       printNumbersFor();
       sumOfEvenNumbersWhile();
       printDigitsReverseWithSpacesDoWhile();
       calculateFactorialFor();
       printNumbersInReverseWhile();
       printOddNumbersDoWhile();
       countDownFromNTo1For();
       sumOfNumbersWhile();
    }
}
