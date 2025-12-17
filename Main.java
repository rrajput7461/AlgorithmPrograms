import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter words (comma separated): ");
        String[] words = sc.nextLine().split(",");
        System.out.print("Enter word to search: ");
        String key = sc.nextLine();
        if (AlgoProgram.search(words, key))
            System.out.println("Word FOUND");
        else
            System.out.println("Word NOT FOUND");
        sc.close();
    }
}
