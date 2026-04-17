
class Stack{
    int[] stack = new int[5];
    int top = 0;
    public void push(int data){
        stack[top] = data;
        top ++;
    }
    public int pop(){
        top --;
        int data;
        data = stack[top];
        stack[top] = 0;
        return data;
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top<=0;
    }
    public void show(){
        for(int i : stack){
            System.out.print(i +" ");
        }
    }
}
public class StackImplementation {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
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
