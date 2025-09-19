import java.util.Scanner;

public class Capitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.length() > 0) {
            String result = Character.toUpperCase(s.charAt(0)) + s.substring(1);
            System.out.println(result);
        } else {
            System.out.println("");
        }

        sc.close();
    }
}
