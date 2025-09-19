import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of sections:");
        int sections = sc.nextInt();

        System.out.println("Enter number of students per section:");
        int studentsPerSection = sc.nextInt();

        System.out.println("Enter number of students passed:");
        int studentsPassed = sc.nextInt();

        int totalStudents = sections * studentsPerSection;
        double passRate = (double) studentsPassed / totalStudents * 100;

        if (passRate >= 50) {
            System.out.println("YES, majority passed");
        } else {
            System.out.println("NO, majority failed");
        }

        sc.close();
    }
}
