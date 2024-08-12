import java.util.Scanner;

public class HomeWork13 {
    // Task 1: Check Positive Number
    // Instruction: Write a program that takes user input for a number and checks if it is positive. If it is, print "The number is positive."
    // Expected Result: If the user input number is 5, the output should be "The number is positive."
    public static void checkPositiveNumber() {
        // Implementation here
        Scanner a = new Scanner(System.in);
        System.out.println("Entered number ");
        int num = a.nextInt();


        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("Not positive or neqative.");
        }
    }

    // Task 2: Check Even or Odd
    // Instruction: Write a program that takes user input for a number and checks if it is even or odd. Print "The number is even." or "The number is odd." accordingly.
    // Expected Result: If the user input number is 4, the output should be "The number is even."
    public static void checkEvenOrOdd() {
        // Implementation here
        int num = 4;
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + "is odd.");
        }
    }

    // Task 3: Categorize Age
    // Instruction: Write a program that takes user input for an age and categorizes it into groups: Child (0-12), Teenager (13-19), Adult (20-64), Senior (65+). Print the appropriate category.
    // Expected Result: If the user input age is 25, the output should be "Adult."
    public static void categorizeAge() {
        // Implementation here
        Scanner a = new Scanner(System.in);
        System.out.println("Enter age");
        int age = a.nextInt();
        if (age >= 0 && age <= 12) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else if (age >= 20 && age <= 64) {
            System.out.println("Adult");
        } else if (age >= 65) {
            System.out.println("Senior");
        } else {
            System.out.println("Wrong information");
        }
    }

    // Task 4: Determine Weekday or Weekend
    // Instruction: Write a program that takes user input for a day of the week (1-7) and prints whether it is a Weekday (1-5) or Weekend (6-7). Print "Invalid day" if the number is outside this range.
    // Expected Result: If the user input day is 3, the output should be "Weekday."
    public static void determineWeekdayOrWeekend() {
        // Implementation here
        Scanner s = new Scanner(System.in);
        System.out.println("Entered the day of the week");
        int day = s.nextInt();
        if (day <= 5) {
            System.out.println("Weekday.");
        } else if (day > 5 && day < 8) {
            System.out.println("Weekend.");
        } else if (day > 7) {
            System.out.println("Invalid day");
        } else {
            System.out.println("wrong information");
        }
    }

    // Task 5: Check Leap Year
    // Instruction: Write a program that takes user input for a year and checks if it is a leap year. A leap year is divisible by 4 but not by 100, except if it is also divisible by 400. Print "Leap year." or "Not a leap year." accordingly.
    // Expected Result: If the user input year is 2020, the output should be "Leap year."
    public static void checkLeapYear() {
        // Implementation here
        Scanner a = new Scanner(System.in);
        System.out.println("Enter year");
        int year = a.nextInt();

        if (year / 4 == 0 && year / 400 == 0) {
            System.out.println("Leap year.");
        } else if (year / 100 == 0) ;
        {
            System.out.println("Not a leap year.");
        }

    }

    // Task 6: Categorize BMI
    // Instruction: Write a program that takes user input for a Body Mass Index (BMI) and categorizes it as follows: Underweight (<18.5), Normal weight (18.5-24.9), Overweight (25-29.9), Obese (30+). Print the category.
    // Expected Result: If the user input BMI is 22, the output should be "Normal weight."
    public static void categorizeBMI() {
        // Implementation here
        Scanner a = new Scanner(System.in);
        System.out.println("Enter weight");
        double w = a.nextDouble();
        if (w <= 18.5) {
            System.out.println("Underweight");
        } else if (w >= 18.5 && w <= 24.9) {
            System.out.println(" Normal weight");
        } else if (w >= 25 && w <= 29.9) {
            System.out.println("Overweight");
        } else if (w >= 30) {

            System.out.println("Obese");
        }
    }

    // Task 7: Check Voting Eligibility
    // Instruction: Write a program that takes user input for an age and checks if the person is eligible to vote. The minimum age to vote is 18. Print "Eligible to vote." or "Not eligible to vote." accordingly.
    // Expected Result: If the user input age is 20, the output should be "Eligible to vote."
    public static void checkVotingEligibility() {
        // Implementation here
        Scanner a = new Scanner(System.in);
        System.out.println("Enter age");
        int age = a.nextInt();
        if (age >= 18) {
            System.out.println("Eligible to vote.");
        } else if (age <= 18) {
            System.out.println("Not eligible to vote");
        }
    }

    // Task 8: Determine Days in Month
    // Instruction: Write a program that takes user input for a month number (1-12) and prints the number of days in that month. For February, print "28 or 29 days." Print "Invalid month" if the number is outside this range.
    // Expected Result: If the user input month is 2, the output should be "28 or 29 days."
    public static void determineDaysInMonth() {
        // Implementation here
        Scanner a = new Scanner(System.in);
        System.out.println("enter month number 1-12 ");
        int month = a.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28 or 29 days ");
            default:
                System.out.println("invalid month");
        }
    }

    // Task 9: Check Temperature
    // Instruction: Write a program that takes user input for the temperature and prints a message based on the following conditions: Below 0: "Freezing", 0-10: "Very Cold", 11-20: "Cold", 21-30: "Warm", Above 30: "Hot".
    // Expected Result: If the user input temperature is 25, the output should be "Warm."
    public static void checkTemperature() {
        // Implementation here
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the temperature");
        int temp = a.nextInt();
        if (temp <= 0) {
            System.out.println("Freezing");
        } else if (temp >= 0 && temp <= 10) {
            System.out.println("Very Cold");
        } else if (temp >= 11 && temp <= 20) {
            System.out.println("Cold");
        } else if (temp >= 21 && temp <= 30) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot");
        }
    }

    // Task 10: Convert Number to Word
    // Instruction: Write a program that takes user input for a number (1-5) and prints the corresponding word in English (1 for "One", 2 for "Two", etc.). Print "Invalid number" if the number is outside this range.
    // Expected Result: If the user input number is 3, the output should be "Three."
    public static void convertNumberToWord() {
        // Implementation here
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a number (1-5): ");
        int num = a.nextInt();
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Invalid number");
        }
    }

    // Task 11: Switch String Input
    // Instruction: Write a program that takes user input for a string and prints "A" if the input is "aaaa", "B" if the input is "bbbb", and "C" if the input is "cccc". Print "Invalid input" for any other string.
    // Expected Result: If the user input is "aaaa", the output should be "A."
    public static void switchStringInput() {
        // Implementation here
        Scanner letter = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = letter.nextLine();
        switch (input)  {
            case "aaaa":
                System.out.println("A");
                break;
            case "bbbb":
                System.out.println("B");
                break;
            case "cccc":
                System.out.println("C");
                break;
            default:
                System.out.println("invalid string");
        }
    }

    public static void main(String[] args) {
        checkPositiveNumber();
        checkEvenOrOdd();
        categorizeAge();
        determineWeekdayOrWeekend();
        checkLeapYear();
        categorizeBMI();
        checkVotingEligibility();
        determineDaysInMonth();
        checkTemperature();
        convertNumberToWord();
        switchStringInput();
    }
}
