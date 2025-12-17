import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter words (comma separated): ");
        String[] words = sc.nextLine().split(",");
        AlgoProgram.insertionSort(words);
        System.out.println("Sorted words:");
        for (String word : words) {
            System.out.print(word + " ");
        }
        sc.close();
    }
}
