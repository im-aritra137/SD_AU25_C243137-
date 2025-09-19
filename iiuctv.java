import java.util.Scanner;

public class iiuctv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        float cost = sc.nextFloat();

        int subscription = number / 6;
        float total = subscription * cost;
        float averageCost = total / number;

        System.out.println(averageCost);
        sc.close();
    }
}
