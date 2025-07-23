package Trees;
class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data = d;
        left = null;
        right = null;

    }
}
public class buidtree {
    static void printtree(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        printtree(root.left);

        printtree(root.right);

    }

    static void printtree1(Node root){
        if(root == null){
            return;
        }

        printtree1(root.left);
        System.out.print(root.data+" ");
        printtree1(root.right);
    }
    static void printtree2(Node root){
        if(root == null){
            return;
        }

        printtree2(root.left);

        printtree2(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("preorder traversal:");
        printtree(root);
        System.out.println();
        System.out.println("inorder traversal:");
        printtree1(root);
        System.out.println();
        System.out.println("postorder traversal:");
        printtree2(root);
    }
}
