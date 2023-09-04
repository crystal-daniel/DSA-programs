import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree obj = new BinaryTree();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        int [] a = new int[n+1];
        System.out.println("Enter the tree elements: ");
        for (int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
        }
        Node root = obj.constructBinaryTree(a,1,n);
        System.out.println("Inorder traversal: ");
        obj.inorderTraversal(root);
        System.out.println("\nPreorder traversal: ");
        obj.preorderTraversal(root);
        System.out.println("\nPostorder traversal: ");
        obj.postorderTraversal(root);
    }
}
