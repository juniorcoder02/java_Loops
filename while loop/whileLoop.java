import java.util.*;

public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int range = sc.nextInt();
        int i = 1;
        while (i <= range) {
            System.out.println(i);
            i = i + 1;
        }
        System.out.println("Done");
        sc.close();

    }
}