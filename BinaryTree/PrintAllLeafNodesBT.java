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
    
    public static void printLeafNodes(Node node) {
        if(node == null) {
            return;
        }
        
        if(node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }
         printLeafNodes(node.left);
         printLeafNodes(node.right);
    }
    
    public static void main(String[] args) {
        Traversal tree = new Traversal();
        
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(8);
        
        System.out.println("All Leaf Node is : ");
        tree.printLeafNodes(tree.root);
        
    }
}
