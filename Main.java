import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integers (space separated): ");
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        AlgoProgram.bubbleSort(arr);
        System.out.println("Sorted integers:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
