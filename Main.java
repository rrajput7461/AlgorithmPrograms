import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (so that range is 0 to 2^n - 1): ");
        int n = sc.nextInt();
        int N = (int) Math.pow(2, n);
        System.out.println("Think of a number between 0 and " + (N - 1));
        AlgoProgram.findNumber(0, N - 1, sc);
        sc.close();
    }
}
