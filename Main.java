import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter words (comma separated): ");
        String[] words = sc.nextLine().split(",");
        AlgoProgram.mergeSort(words);
        for (String w : words)
            System.out.print(w + " ");
        sc.close();
    }
}
