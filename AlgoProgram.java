public class AlgoProgram {
    static class Stack<T> {
        private Node<T> top;
        private int size;
        static class Node<T> {
            T data;
            Node<T> next;
            Node(T data) {
                this.data = data;
            }
        }
        public Stack() {
            top = null;
            size = 0;
        }
        public void push(T data) {
            Node<T> newNode = new Node<>(data);
            newNode.next = top;
            top = newNode;
            size++;
        }
        public T pop() {
            if (top == null) return null;
            T data = top.data;
            top = top.next;
            size--;
            return data;
        }
        public T peek() {
            if (top == null) return null;
            return top.data;
        }
        public boolean isEmpty() {
            return top == null;
        }
        public int size() {
            return size;
        }
    }
    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expr.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
