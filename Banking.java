import java.util.Scanner;
class BankingCashCounter {
    static class Node {
        String name;
        String action;
        int amount;
        Node next;
        Node(String name, String action, int amount) {
            this.name = name;
            this.action = action;
            this.amount = amount;
            this.next = null;
        }
    }
    static class Queue {
        Node front, rear;
        public void enqueue(String name, String action, int amount) {
            Node newNode = new Node(name, action, amount);
            if (rear == null) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
        }
        public Node dequeue() {
            if (front == null) {
                return null;
            }
            Node temp = front;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return temp;
        }
        public boolean isEmpty() {
            return front == null;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();
        int cashBalance = 10000;
        while (true) {
            System.out.println("---Banking Cash Counter---");
            System.out.println("1. Add Person to Queue");
            System.out.println("2. Process Next Person");
            System.out.println("3. Show Cash Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Person Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Action (deposit/withdraw): ");
                    String action = sc.nextLine().toLowerCase();
                    System.out.print("Enter Amount: ");
                    int amount = sc.nextInt();
                    queue.enqueue(name, action, amount);
                    System.out.println("Person added to queue!");
                    break;
                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("No people in queue!");
                    } else {
                        Node person = queue.dequeue();
                        System.out.println("\nProcessing: " + person.name);
                        if (person.action.equals("deposit")) {
                            cashBalance += person.amount;
                            System.out.println("Deposited: " + person.amount);
                        } else if (person.action.equals("withdraw")) {
                            if (cashBalance >= person.amount) {
                                cashBalance -= person.amount;
                                System.out.println("Withdrawn: " + person.amount);
                            } else {
                                System.out.println("Insufficient balance for withdrawal!");
                            }
                        } else {
                            System.out.println("Invalid action!");
                        }
                        System.out.println("Transaction Completed.");
                    }
                    break;
                case 3:
                    System.out.println("Current Cash Balance: " + cashBalance);
                    break;
                case 4:
                    System.out.println("Exiting Program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
