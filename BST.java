import java.util.Scanner;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BST{
    Node root;
    Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=insert(root.left,data);
        }
        else if(data>root.data){
            root.right=insert(root.right,data);
        }
        return root;
    }
    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.data+" ");
            inorder(root.right);
        }
    }
    void preorder(Node root){
        if(root!=null){
            System.out.println(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data+" ");
        }
    }
    public static void main(String[] args)
    {
        BST BST=new BST();
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("Enter number of nodes:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter node data:");
            int data=sc.nextInt();
            BST.root=BST.insert(BST.root,data);
        }
        System.out.println("inorder traversal :");
        BST.inorder(BST.root);
        System.out.println("preorder traversal :");
        BST.preorder(BST.root);
        System.out.println("postorder traversal :");
        BST.postorder(BST.root);
        sc.close();

    }
}