import java.util.Scanner;

public class OddOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && a != c) {
            System.out.println(c);
        } else if (a == c && a != b) {
            System.out.println(b);
        } else if (b == c && b != a) {
            System.out.println(a);
        } else if (a != b && a != c && b != c) {
            System.out.println("x: all different");
        } else {
            System.out.println("x: all same");
        }

        sc.close();
    }
}
