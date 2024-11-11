// Write a Java program that takes a number as input and calculates the sum of its digits.


import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int sum = 0;
        while (num != 0) {
            sum += num % 10; // Add the last digit to sum
            num /= 10; // Remove the last digit
        }

        System.out.println("Sum of the digits is: " + sum);
    }
}

