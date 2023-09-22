class LinkedList {
     private ListNode head;
     private static class ListNode{
         private int data;
         private ListNode next;
        
        ListNode(int data) {
            this.data = data;
            this.next = next;
        }
    }
    
    public void display() {
        ListNode curr = head;
        
        while(curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    
    public int getLength() {
        if(head == null) {
            return 0;
        }
        ListNode curr = head;
        int count = 0;
        while(curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    } 
    
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        
        ll.head.next = second;
        second.next = third;
        third.next = fourth;
        
        ll.display();
        
        // getLength method
        System.out.println("length is -> " + ll.getLength());
      
    }
}
