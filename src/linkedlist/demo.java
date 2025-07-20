package linkedlist;

import org.w3c.dom.ls.LSOutput;

public class demo {
    int data;
    demo next;
    demo(int d) {
        data = d;
        next = null;

    }



    public static void main(String[] args) {
        demo d1 = new demo(5);
        demo d2 = new demo(6);
        d1.next = d2;
        System.out.print(d1.data+"-->");
        System.out.print(d1.next.data+"--> ");
        System.out.print(d2.next);

    }
}
