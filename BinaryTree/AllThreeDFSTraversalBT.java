class Node {
    int data;
    Node left;
    Node right;
    
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Traversal {
    Node root;
    
    public Traversal() {
        root = null;
    }
    
    public static void printInorderTraversal(Node node) {
        if(node != null) {
            printInorderTraversal(node.left);
            System.out.print(node.data + " ");
            printInorderTraversal(node.right);
        }
    }
    
    public static void printPreorderTraversal(Node node) {
        if(node != null) {
            System.out.print(node.data + " ");
            printPreorderTraversal(node.left);
            printPreorderTraversal(node.right);
        }
    }
    
    public static void printPostorderTraversal(Node node) {
        
        if(node != null) {
        printPostorderTraversal(node.right);
        printPostorderTraversal(node.left);
        System.out.print(node.data + " ");
        }
    }
    
    public static void main(String[] args) {
        Traversal tree = new Traversal();
        
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        
        
        
        
        // INORDER TRAVERSAL
        // System.out.println("Inorder Traversal :");
        // tree.printInorderTraversal(tree.root);
        
        // PREORDER TRAVERSAL
        //  System.out.println("PreOrder Traversal :");
        // tree.printPreorderTraversal(tree.root);
        
        // POSTORDER TRAVERSAL
        System.out.println("PostOder Traversal is :");
        tree.printPostorderTraversal(tree.root);
        
        
    }
}
