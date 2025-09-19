import java.util.Scanner;

public class workhour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter work hours for other days:");
        int workHour = sc.nextInt();

        System.out.println("Enter work hours for Wednesday:");
        int workHourWednesday = sc.nextInt();

        if (workHour > workHourWednesday) {
            int totalWorkHour = (workHour * 4) + workHourWednesday;
            System.out.println("Total work hours per week: " + totalWorkHour);
        } else {
            System.out.println("Work hours for other days are not greater than Wednesday");
        }

        sc.close();
    }
}
