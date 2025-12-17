import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlgoProgram bank = new AlgoProgram();
        while (true) {
            System.out.println("\n--- Banking Cash Counter ---");
            System.out.println("1. Add Person to Queue");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter person name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    bank.addPerson(name);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    int dep = sc.nextInt();
                    bank.processPerson(1, dep);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    int wit = sc.nextInt();
                    bank.processPerson(2, wit);
                    break;
                case 4:
                    System.out.println("Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
