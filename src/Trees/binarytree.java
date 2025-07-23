package Trees;

import java.util.Scanner;

class Node1{
    int data;
    Node left;
    Node right;
    Node1(int d){
        data=d;
        left= null;
        right= null;

    }
}
public class binarytree {
    Node root;

    binarytree(){

        Scanner sc=new Scanner(System.in);
        root=buildTree(sc);
    }
    Node buildTree(Scanner sc){
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }

        Node temp=new Node(data);
        temp.left=buildTree(sc);
        temp.right=buildTree(sc);
        return temp;

    }
    void print(){
        System.out.println("preorder traversal");
        this.preorder(root);


    }
    void printinorder(){
        System.out.println("inorder traversal");
        this.inorder(root);
    }
    void printpostorder(){
        System.out.println("postorder traversal");
        this.postorder(root);
    }
    void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    void postorder(Node root){
        if(root==null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    int getheiht(){
        return height(root);
    }

    int height(Node root){

        if(root==null){
            return 0;
        }
        int h1=height(root.left);
        int h2=height(root.right);
        return Math.max(h1,h2)+1;
    }
    static int sumofnode(Node root){
        if(root==null){
            return 0;
        }
        return root.data+sumofnode(root.left)+sumofnode(root.right);
    }

    public static void main(String[] args) {
        binarytree obj=new binarytree();
       obj.print();
        System.out.println();
       obj.printinorder();
        System.out.println();
       obj.printpostorder();
        System.out.println();
        System.out.println("this is the height of the tree:"+obj.getheiht());
        System.out.println("sum:"+obj.sumofnode(obj.root));


    }


}
