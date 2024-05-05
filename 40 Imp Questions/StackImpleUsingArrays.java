// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ArrayStack{
    
    private int maxSize;
    private int[] stackArray;
    private int top;
    
    public ArrayStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top  = -1;
    }
    
    public void push(int value) {
        if(top == maxSize-1) {
            System.out.println("Stack Overflow");
            return;
        }
        stackArray[++top] = value;
    }
    
    public int pop() {
        if(top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stackArray[top--];
    }
    
    public int peek() {
         if(top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stackArray[top];
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }
    
    public boolean isFull() {
        return (top == maxSize-1);
    }
    
    public static void main(String[] args) {
       ArrayStack st = new ArrayStack(5);
       
       st.push(1);
       st.push(2);
       st.push(3);
       
       System.out.println("Top Element is " + st.peek());
       
       System.out.println("Popping elements from array Stack");
       while(!st.isEmpty()) {
           System.out.print(st.pop() + " ");
       }
    }
}
