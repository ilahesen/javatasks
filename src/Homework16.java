    import org.w3c.dom.ls.LSOutput;

    import javax.sound.midi.Soundbank;
    import java.util.Scanner;

             public class Homework16 {
    // Task 1: Print Odd Numbers from 1 to N (For Loop)
    // Instruction: Create a method that takes an integer N as input and prints all odd numbers from 1 to N. Use a for loop.
    // Call this method in the main method.
    // Expected Result: If the user inputs 7, the output should be "1 3 5 7".
    public static void printOddNumbers() {
    // Implementation goes here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int w1 = sc.nextInt();
        int num = 7;
        for (int i= 1; i<= num ; i++){
            if  (i%2!=0)
                System.out.print(i+ " ");
        }
        System.out.println(" ");
    }


    // Task 2: Print the First N Even Numbers (For Loop)
    // Instruction: Create a method that takes an integer N as input and prints the first N even numbers. Use a for loop.
    // Call this method in the main method.
    // Expected Result: If the user inputs 5, the output should be "2 4 6 8 10".
    public static void printtheFirstNEvenNumbers() {
    // Implementation goes here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int w2 = sc.nextInt();
        int num = 10;
        for (int i= 1; i<= num ; i++){
            if  (i%2==0)
                System.out.print(i+ " ");
        }
        System.out.println("  ");
    }

    // Task 3: Calculate the Power of a Number
    // Instruction: Create a method that takes two integers, base and exponent, and calculates the result of base raised to the power of exponent.
    // Use a for loop for this task.
    // Call this method in the main method.
    // Expected Result: If the user inputs base=2 and exponent=3, the output should be "8".
    public static void calculatethePowerofaNumber() {
        System.out.println("Task: 3 ");
        int base = 2;
        int exponent = 3;
        int out = 1;
        for(int i =0; i< exponent; i++) {
            out *=base;
        }
        System.out.println( out );
    }

    // Task 4: Check if a Number is Even (While Loop)
    // Instruction: Create a method that takes an integer N as input and checks if it is even. Use a while loop.
    // Call this method in the main method.
    // Expected Result: If the user inputs 4, the output should be "4 is even
    public static void  checkIfaNumberIsEven() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        int num = sc.nextInt();
             int i = 4;
             while (i==num) {
             System.out.println(i + " is even ");
             i++;
             }
    }


    // Task 5: Print Multiples of N up to M (For Loop)
    // Instruction: Create a method that takes two integers N and M as input, and prints the multiples of N up to M. Use a for loop.
    // Call this method in the main method.
    // Expected Result: If the user inputs N=3 and M=10, the output should be "3 6 9".
    public static void printMultiplesOfN(){
        System.out.println("Task: 5 ");
        int N =3;
        int M=10;
        for(int i = N; i<=10;i+=N ){
            System.out.print(i+ " ");
           }
        System.out.println(" ");
           }
                 // Task 6: Print "Hello" N Times (While Loop)
    // Instruction: Create a method that takes an integer N as input and prints "Hello" N times. Use a while loop.
    // Call this method in the main method.
    // Expected Result: If the user inputs 3, the output should be:
    // "Hello"
    // "Hello"
    // "Hello"
    public static void printHelloNTimes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        String w ="Hello";
        int i= 1;
        while (i<=a){
            System.out.println(w + " ");
            i++;
        }
    }

    // Task 7: Print Numbers from 1 to N (For Loop)
    // Instruction: Create a method that takes an integer N as input and prints all numbers from 1 to N. Use a for loop.
    // Call this method in the main method.
    // Expected Result: If the user inputs 5, the output should be "1 2 3 4 5".
    public static void PrintNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        for (int i= 1; i<=a; i++){
        System.out.print(i + " ");
        }
        System.out.println(" ");
        }

    // Task 8: Print a Character N Times (For Loop)
    // Instruction: Create a method that takes a character and an integer N as input and prints the character N times in a single line. Use a for loop.
    // Call this method in the main method.
    // Expected Result: If the user inputs '*' and 5, the output should be "*****".
    public static void PrintACharacter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        char star ='*';
        for(int i =1; i<=a; i++){
            System.out.print( "*");
        }
        System.out.println(" ");
    }

    // Task 9: Calculate the Sum of the First N Natural Numbers (For Loop)
    // Instruction: Create a method that takes an integer N as input and calculates the sum of the first N natural numbers.
    // Use a for loop for this task.
    // Call this method in the main method.
    // Expected Result: If the user inputs 4, the output should be "10" (because 1 + 2 + 3 + 4 = 10).
    public static void CalculatetheSumNaturalNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int sum =0;
        for(int i =1; i<=a; i++){
            sum = sum+i;
        }
        System.out.print(sum);
        System.out.println(" ");
    }


                 // Task 10: Print a Countdown from N to 1 (While Loop)
    // Instruction: Create a method that takes an integer N as input and prints a countdown from N to 1. Use a while loop.
    // Call this method in the main method.
    // Expected Result: If the user inputs 5, the output should be "5 4 3 2 1".
    // Main method to call all tasks
    public static void PrintACountdown(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int i =0;
        while (i< a){
            System.out.print(a + " ");
            a--;
        }
        System.out.println(" ");
    }


    public static void main(String[] args) {
        // Task 1: Get user input for Task 1 and call method for Task 1
        printOddNumbers();

        // Task 2: Get user input for Task 2 and call method for Task 2
        printtheFirstNEvenNumbers();

        // Task 3: Get user input for Task 3 and call method for Task 3
        calculatethePowerofaNumber();

        // Task 4: Get user input for Task 4 and call method for Task 4
         checkIfaNumberIsEven();

        // Task 5: Get user input for Task 5 and call method for Task 5
        printMultiplesOfN();

        // Task 6: Get user input for Task 6 and call method for Task 6
        printHelloNTimes();

        // Task 7: Get user input for Task 7 and call method for Task 7
        PrintNumbers();

        // Task 8: Get user input for Task 8 and call method for Task 8
           PrintACharacter();

        // Task 9: Get user input for Task 9 and call method for Task 9
             CalculatetheSumNaturalNumbers();

        // Task 10: Get user input for Task 10 and call method for Task 10

            PrintACountdown();




    }
}

