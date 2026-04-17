import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        System.out.println(stack.pop());

        System.out.println(stack.peek());

        System.out.println(stack);

        System.out.println(stack.search(200));   // Return index from top  -> 1 base indexing

        System.out.println(stack.isEmpty());
        
        stack.clear();
        System.out.println(stack.isEmpty());
    }
}
