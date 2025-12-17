import java.util.LinkedList;
import java.util.Queue;
public class AlgoProgram {
    private Queue<String> queue = new LinkedList<>();
    private int cashBalance = 10000; // initial bank cash
    public void addPerson(String person) {
        queue.add(person);
        System.out.println(person + " added to queue");
    }
    public void processPerson(int choice, int amount) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        String person = queue.poll();
        System.out.println("Serving: " + person);
        if (choice == 1) { // Deposit
            cashBalance += amount;
            System.out.println("Deposited: " + amount);
        }
        else if (choice == 2) { // Withdraw
            if (amount <= cashBalance) {
                cashBalance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient bank balance");
            }
        }
        System.out.println("Current Bank Balance: " + cashBalance);
    }
}
