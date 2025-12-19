import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        boolean result = AlgoProgram.isPalindrome(input);
        System.out.println("Is Palindrome? " + result);
        sc.close();
    }
}
