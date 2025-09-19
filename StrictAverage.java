import java.util.Scanner;

public class StrictAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double average = (a + b) / 2.0;

        if (average > c) {
            System.out.println("Average is strictly greater than C");
        } else {
            System.out.println("Average is not strictly greater than C");
        }

        sc.close();
    }
}
