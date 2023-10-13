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
    
   public static int getHeight(Node node) {
       if(node == null) {
          return 0;  // empty height
       }
       
       int leftHeight = getHeight(node.left);
       int rightHeight = getHeight(node.right);
       
       
       return Math.max(leftHeight, rightHeight)+1;
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
        
       int height = getHeight(tree.root);
       System.out.print("The Height of Binary Tree is : " + height);
        
    }
}
