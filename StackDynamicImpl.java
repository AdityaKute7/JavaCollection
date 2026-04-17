
class Stack {
    int capacity = 2;
    int[] stack = new int[capacity];
    int top = 0;

    public void push(int data) {
        if (capacity == size()) {
            grow();
        }
        stack[top] = data;
        top++;
    }

    public void grow() {
        int length = size();

        int[] newStack = new int[capacity * 2];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
        capacity *= 2;

    }
    public int pop() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            top--;

            data = stack[top];
            stack[top] = 0;
            shrink();
        }
        return data;
    }

    public void shrink(){
        int length = size();
        if(length <= (capacity/2)/2)
            capacity = capacity/2;
            
        
        int[] newStack = new int[capacity];
            System.arraycopy(stack, 0, newStack, 0, length);
            stack = newStack;
    }

    public int size() {
        return top;
    }

    public boolean isEmpty(){
        return top<=0;
    }

    public void show() {
        for (int i : stack) {
            System.out.println(i);
        }
    }
}

public class StackDynamicImpl {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(30);
        stack.push(30);
        stack.push(30);
        stack.push(30);
        stack.push(40);
        stack.push(30);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        
        

        stack.show();
    }
}
