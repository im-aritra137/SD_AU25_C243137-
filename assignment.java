import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfTasks = 3;
        int timePerTask = 1;
        int totalTime = numberOfTasks * timePerTask;

        System.out.println("Enter the start time:");
        int startTime = sc.nextInt();

        if (startTime + totalTime <= 10) {
            System.out.println("You can complete the assignment");
        } else {
            System.out.println("You cannot complete the assignment");
        }

        sc.close();
    }
}
