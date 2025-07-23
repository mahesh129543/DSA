package stack;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

class stack {

    ArrayList<Integer> arr;
    stack() {
        arr = new ArrayList<>();


    }
    void push(int x) {
        arr.add(x);

    }

     int pop() {
        if (arr.isEmpty()) {
            System.out.println("Stack is empty");
        }
       return arr.remove(arr.size()-1);

     }
     int peek() {
        if (arr.isEmpty()) {
            System.out.println("Stack is empty");
        }
        return arr.get(arr.size()-1);
    }
    void printstack() {
        System.out.println("the hole arraylist using the stack data structure:"+arr);
    }
}

public class stackofarraylist {

    public static void main(String[] args) {
        stack st = new stack();
        st.push(5);
        st.push(7);
        st.push(9);
        st.printstack();
        System.out.println("delete the last element:"+st.pop());
        System.out.println("getting the top element of the stack:"+st.peek());


    }
}
