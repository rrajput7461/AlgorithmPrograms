import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        if (AlgoProgram.isAnagram(s1, s2))
            System.out.println("The two strings are ANAGRAMS");
        else
            System.out.println("The two strings are NOT ANAGRAMS");
        sc.close();
    }
}
