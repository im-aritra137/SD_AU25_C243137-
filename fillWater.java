import java.util.Scanner;

public class fillwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] full = new boolean[3];

        for (int i = 0; i < 3; i++) {
            int input;
            do {
                System.out.println("Enter status of bottle " + (i + 1) + " (0 for empty, 1 for full):");
                input = sc.nextInt();
            } while (input != 0 && input != 1);

            full[i] = (input == 1);
        }

        sc.close();

        int emptyCount = 0;
        for (boolean bottle : full) {
            if (!bottle) emptyCount++;
        }

        if (emptyCount >= 2) {
            System.out.println("Water fill time");
        } else {
            System.out.println("It's not time to fill water");
        }
    }
}
