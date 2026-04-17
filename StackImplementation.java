
class Stack {
    int[] stack = new int[5];
    int top = 0;

    public void push(int data) {
        if (top == 5) {
            System.out.println("Stack is already full");
        }
        else{
        stack[top] = data;
        top++;
        }
    }

    public int pop() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            top--;

            data = stack[top];
            stack[top] = 0;
        }
        return data;
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public void show() {
        for (int i : stack) {
            System.out.print(i + " ");
        }
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.pop();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(40);
        stack.push(40);

        stack.show();
        stack.pop();
        System.out.println();
        System.out.println(stack.size());
        stack.show();
        System.out.println();
        System.out.println(stack.isEmpty());
    }
}
