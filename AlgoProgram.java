import java.util.Scanner;
public class AlgoProgram {
    public static void findNumber(int low, int high, Scanner sc) {
        if (low == high) {
            System.out.println("Your number is: " + low);
            return;
        }
        int mid = (low + high) / 2;
        System.out.println("Is your number between " + low + " and " + mid + "? (true/false)");
        boolean answer = sc.nextBoolean();
        if (answer) {
            findNumber(low, mid, sc);
        } else {
            findNumber(mid + 1, high, sc);
        }
    }
}
