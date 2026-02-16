//chack the tree bst or not
import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class IsBST{
    Node root;
        Node insert(Node root,int data){
            if(root==null){
                return new Node(data);
            }
            if(data<root.data) root.left=insert(root.left,data);
            else if(data>root.data) root.right=insert(root.right,data);
            return root;
        }
        void inorder(Node root,ArrayList<Integer> arr){
            if(root!=null){
                inorder(root.left,arr);
                arr.add(root.data);
                inorder(root.right,arr);
            }
        }
        boolean isSorted(ArrayList<Integer> arr){
            for(int i=1;i<arr.size();i++){
                if(arr.get(i)<=arr.get(i-1)) return false;
            }
            return true;
        }
        boolean checkBST(Node root){
            ArrayList<Integer> arr=new ArrayList<>();
            inorder(root,arr);
            return isSorted(arr);
        }
        public static void main(String[] args)
        {
            IsBST BST=new IsBST();
            Scanner sc=new Scanner(System.in);
            System.out.println();
            System.out.println("Enter number of nodes:");
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                int data=sc.nextInt();
                BST.root=BST.insert(BST.root,data);
            }
            if(BST.checkBST(BST.root)){
                System.out.println("The tree is a binary search tree.");
            }else{
                System.out.println("The tree is not a binary search tree.");
            }
            sc.close();
        }
}
