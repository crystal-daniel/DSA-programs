public class BinaryTree {
    Node create(int data) {
        Node newnode = new Node();
        newnode.left = null;
        newnode.data = data;
        newnode.right = null;
        return newnode;
    }
    Node constructBinaryTree(int [] a, int i, int n)
    {
        Node root = null;
        if(i<=n)
        {
            root = create(a[i]);
            root.left = constructBinaryTree(a, 2*i, n);
            root.right = constructBinaryTree(a, (2*i)+1, n);
        }
        return root;
    }
    void inorderTraversal(Node root)
    {
        if(root==null)
            return;
        inorderTraversal(root.left);
        System.out.print(root.data+"\t");
        inorderTraversal(root.right);
    }
    void preorderTraversal(Node root)
    {
        if(root==null)
            return;
        System.out.print(root.data+"\t");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    void postorderTraversal(Node root)
    {
        if(root==null)
            return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data+"\t");
    }
}
