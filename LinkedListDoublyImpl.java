
class Node{
    Node prev;
    int data;
    Node next;
}

class DoublyLinkedList{
    Node head;
    Node tail;

    public void insertAtFirst(int data){
        Node node = new Node();
        node.data = data;

        if(head ==null){
            head = tail = node;
        }else{
        node.next = head;
        head.prev = node;
        head = node;
    }
}
    
    public void insertAtLast(int data){
        Node node = new Node();
        node.data = data;

        if(head ==null){
            head = tail = node;
        }
        else{
        tail.next = node;
        node.prev = tail;
        tail = node;
    }
}

    public void popFront(){
        Node temp = head;

        head = head.next;
        head.prev = null;         // If the linkedList is empty then check if(head == null){head.prev = null} otherwise the head will goes null
        temp.next = null;
    }

    public void popBack(){
    if(tail == null) return; // empty list

    if(head == tail){  // only one node
        head = tail = null;
        return;
    }
    Node temp = tail;
    tail = tail.prev;
    tail.next = null;   // correct fix
    temp.prev = null;   // optional cleanup
}

    public void show(){
        Node n = head;
        while(n!=null){
            System.out.println(n.data);
            n = n.next;
        }
    }
}

public class LinkedListDoublyImpl {
    public static void main(String[] args){
        DoublyLinkedList ddl = new DoublyLinkedList();

        ddl.insertAtFirst(10);
        ddl.insertAtFirst(100);
        ddl.insertAtLast(100);
        ddl.insertAtLast(2000);
        ddl.insertAtFirst(300);

        ddl.popFront();
        ddl.popFront();
        ddl.popBack();
        ddl.popBack();
        ddl.show();

    }
}
