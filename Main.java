import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arithmetic expression: ");
        String input = sc.nextLine();
        boolean result = AlgoProgram.isBalanced(input);
        System.out.println("Is Balanced? " + result);
        sc.close();
    }
}
