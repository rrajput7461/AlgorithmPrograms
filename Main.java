public class Main {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 0 and 1000:");
        for (int i = 0; i <= 1000; i++) {
            if (AlgoProgram.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
