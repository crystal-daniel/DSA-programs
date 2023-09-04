public class BinarySearchTree {
    Node create(Node root, int data)
    {
        if(root == null)
        {
            Node newnode = new Node();
            newnode.data = data;
            newnode.left = null;
            newnode.right = null;
            return newnode;
        }
        if(data<root.data)
            root.left = create(root.left, data);
        else if(data> root.data)
            root.right = create(root.right, data);
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
    Node search(Node root, int data)
    {
        if(root == null)
            System.out.println("Element is not found!");
        else if(data<root.data)
            root.left = search(root.left, data);
        else if(data>root.data)
            root.right = search(root.right, data);
        else
            System.out.println("Element is found!");
        return root;
    }
}
