
// Write a Java program that takes a number as input and prints its multiplication table up to 10.
import java.util.*;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a integer :");
        int num = sc.nextInt();
        if (num >= 0) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + num * i);
            }

        } else {
            System.out.println("Please enter a integer greater than or equal to 0 ");
        }
        sc.close();

    }

}
