class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        Node curr = head;
        Node ptr0 = new Node(0);
        Node ptr1 = new Node(1);
        Node ptr2 = new Node(2);
        
        // all pointer to point the temps variable
        Node temp1 = ptr0;
        Node temp2 = ptr1;
        Node temp3 = ptr2;
        
        while(curr != null) {
            if(curr.data == 0) {
               Node nextPtr0 = new Node(curr.data);
               temp1.next = nextPtr0;
                // move pointer by 1 and check another iteration
               curr = curr.next;
               temp1 = nextPtr0;
            } else if(curr.data == 1) {
                Node nextPtr1 = new Node(curr.data);
                temp2.next = nextPtr1;
                curr = curr.next;
                temp2 = nextPtr1;
            } else if(curr.data == 2) {
                Node nextPtr2 = new Node(curr.data);
                temp3.next = nextPtr2;
                curr = curr.next;
                temp3 = nextPtr2;
            }
        }
        ptr0 = ptr0.next;
        ptr1 = ptr1.next;
        ptr2 = ptr2.next;
        
        if(ptr0 == null && ptr1 == null) {
            return ptr2;
        }
        
        if(ptr0 == null) {
            temp2.next = ptr2;
            return ptr1;
        }
        
        if(ptr1 == null) {
            temp1.next = ptr2;
            return ptr0;
        }
        
        if(ptr2 == null) {
            temp1.next = ptr1;
            return ptr0;
        }
        
        temp1.next = ptr1;
        temp2.next = ptr2;
        return ptr0;
    }
}
