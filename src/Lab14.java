
import java.util.Scanner;

public class Lab14 {
    // Task 1: Sum of First N Numbers (While Loop)
    // Instruction: Write a program that takes user input for a number N and calculates the sum of numbers from 1 to N using a while loop.
    // Expected Result: If the user inputs 5, the output should be "Sum: 15" (since 1+2+3+4+5=15).
    public static void sumOfFirstNNumbersWhile() {
        // Implementation here
        Scanner l = new Scanner(System.in);
        System.out.println("Enter");
        int b = l.nextInt();
        int sum = 0;
        while (b >= 1) {
            sum = b + sum;
            b--;
        }
        System.out.println("Sum" + sum);
    }

    // Task 2: Countdown from N to 1 (Do-While Loop)
    // Instruction: Write a program that takes user input for a number N and prints a countdown from N to 1 using a do-while loop.
    // Expected Result: If the user inputs 5, the output should be "5 4 3 2 1".
    public static void countdownDoWhile() {
        // Implementation here

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int a = sc.nextInt();
        do {
            System.out.println(a + " ");
            a--;
        }
        while (a >= 1);
        System.out.println(" ");

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
    public static void printMultiplicationTableFor () {
        // Implementation here
        Scanner l3 = new Scanner(System.in);
        System.out.println("Enter");
        int L3 = l3.nextInt();
        for (int i = 1; i <= 10; i++)
            System.out.println(L3 + "x" + i + " = " + L3 * i);
    }


    public static void main(String[] args) {
        sumOfFirstNNumbersWhile();
        countdownDoWhile();
        printMultiplicationTableFor();
    }
}
//Collapse




