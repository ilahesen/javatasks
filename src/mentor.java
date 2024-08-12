import java.util.Scanner;

public class mentor {
    // Task 1: Sum of First N Numbers (While Loop)
    // Instruction: Write a program that takes user input for a number N and calculates the sum of numbers from 1 to N using a while loop.
    // Expected Result: If the user inputs 5, the output should be "Sum: 15" (since 1+2+3+4+5=15).
    public static void sumOfFirstNNumbersWhile() {
        // Implementation here
        Scanner a = new Scanner(System.in);
        System.out.println("Enter");
        int b = a.nextInt();
        int sum = 0;
        int sum2 = 1;
        while (sum2 <= b){
            sum +=b; ++sum;
            System.out.println( "Sum" + sum);
        }
    }
    // Task 2: Countdown from N to 1 (Do-While Loop)
    // Instruction: Write a program that takes user input for a number N and prints a countdown from N to 1 using a do-while loop.
    // Expected Result: If the user inputs 5, the output should be "5 4 3 2 1".
    public static void countdownDoWhile() {
        // Implementation here
    }
    // Task 3: Print Multiplication Table (For Loop)
    // Instruction: Write a program that takes user input for a number and prints the multiplication table for that number from 1 to 10.
    // Expected Result: If the user input number is 5, the output should be:
    // 5 x 1 = 5
    // 5 x 2 = 10
    // 5 x 3 = 15
    // 5 x 4 = 20
    // 5 x 5 = 25
    // 5 x 6 = 30
    // 5 x 7 = 35
    // 5 x 8 = 40
    // 5 x 9 = 45
    // 5 x 10 = 50
    public static void printMultiplicationTableFor() {
        // Implementation here
    }
    public static void main(String[] args) {
        sumOfFirstNNumbersWhile();
        countdownDoWhile();
        printMultiplicationTableFor();
    }
}

