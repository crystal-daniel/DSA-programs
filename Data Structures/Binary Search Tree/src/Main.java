import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int data, ch;
        Node root = null;
        BinarySearchTree obj = new BinarySearchTree();
        Scanner in = new Scanner(System.in);
        System.out.println("1. Insert\n2. Inorder Traversal\n3. Preorder Traversal\n4. Postorder Traversal\n5. Search\n6. Exit");
        do {
            System.out.println("Enter your choice: ");
            ch = in.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.println("Enter data: ");
                    data = in.nextInt();
                    root = obj.create(root, data);
                }
                case 2 -> {
                    System.out.println("Inorder Traversal: ");
                    obj.inorderTraversal(root);
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("Preorder Traversal: ");
                    obj.preorderTraversal(root);
                    System.out.println();
                }
                case 4 -> {
                    System.out.println("Postorder Traversal: ");
                    obj.postorderTraversal(root);
                    System.out.println();
                }
                case 5 -> {
                    System.out.println("Enter data to search: ");
                    data = in.nextInt();
                    root = obj.search(root, data);
                }
                case 6 -> {
                    System.out.println("Program Terminating!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid Input! Please Enter again!");
            }
        } while (true);
    }
}
