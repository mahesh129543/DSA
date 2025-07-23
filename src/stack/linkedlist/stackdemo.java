package stack.linkedlist;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}

public class stackdemo {
    Node head;
    stackdemo(){
        head = null;
    }
    void push(int d){
        if(head == null){
            head = new Node(d);
        }else{
            Node n= new Node(d);
            n.next = head;
            head = n;
        }

    }
    void pop(){
        if(head == null){
            System.out.println("Stack is empty");
        }else{
            head = head.next;

        }

    }
    int top(){
        if(head == null){
            System.out.println("Stack is empty");
        }else{
            System.out.println(head.data);
        }

        return 0;
    }
    void display(){
        if(head == null){
            System.out.println("Stack is empty");
        }else{
            System.out.println(head.data);
        }

    }
    boolean empty(){
        if(head == null){
            System.out.println("Stack is empty");
        }
        return false;
    }
}
