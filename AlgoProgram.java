import java.util.ArrayDeque;
import java.util.Deque;
public class AlgoProgram {
    public static boolean isPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                return false;
            }
        }
        return true;
    }
}
