// Write a Java program that prints the following pattern for a given n:
// *
// **
// ***
// ****
// *****

import java.util.*;

public class printPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows : ");
        int lines = sc.nextInt();
        sc.close();
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
