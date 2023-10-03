class StackUsingArray {
    
    // initialize all the variables
    private static int size;
    private static int top;
    private static int stackArray[];
    
    // constructor
    public StackUsingArray(int size) {
        this.size = size;
        this.stackArray = new int[size];
        this.top = -1;
    }
    
    // method to cheack stack is empty
    public static boolean isEmpty() {
        return (top == -1);
    }
    // methid to check stack is full
    public static boolean isFull() {
        return (top == size-1);
    }
    
    // method to implement push operation
    public static void push(int value) {
        if(isFull()) {
            System.out.println("Stack is Full Cannot push");
            return;
        }
        // if not full push the element in an array
        stackArray[++top] = value;
    }
    
    // impelement pop operation
    public static int pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty cannot pop");
            return -1;
        }
        // if not empty  so pop the element
        return stackArray[top--];
    }
    
    // implement peek() operation
    public static int peek() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stackArray[top];
    }
    
    // print the element of stack
    
    public static void display() {
        System.out.println("Stack (top to bottom ) : ");
        for(int i=top; i>=0; i--) {
           System.out.println(stackArray[i] + " "); 
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
       StackUsingArray st = new StackUsingArray(5);
       
        //push the element
        st.push(10);
        st.push(20);
        st.push(30);
       
        
        // display the element
        st.display();
        
        // pop the element
        int popElement = st.pop();
        System.out.println("Popped Element is : " + popElement);
    
        // peek operation check
        
        int peekElement = st.peek();
        System.out.println("Peeked Element is : " + peekElement);
        
        // display the updated stack
        st.display();
    }
}
