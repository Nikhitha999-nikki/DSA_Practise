import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class CompleteBT {
    // Build a complete binary tree from array in level order
    static Node BuildTree(int[] arr, int i, int n) {
        if (i >= n) return null;
        Node root = new Node(arr[i]);
        root.left = BuildTree(arr, 2 * i + 1, n);
        root.right = BuildTree(arr, 2 * i + 2, n);
        return root;
    }

    // Inorder traversal
    static void inorder(Node root) {
        if (root != null) {
            
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("no.of nodes");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Node root = BuildTree(arr, 0, n);
        System.out.println("inorder traversal");
        inorder(root);
        sc.close();
    }
}
    
