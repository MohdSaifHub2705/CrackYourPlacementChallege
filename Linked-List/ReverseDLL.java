public static Node reverseDLL(Node  head)
{
    //Your code here

   // intialize temp pointer for tracking the node 
    Node temp = null;
    Node curr = head;
    
    while(curr != null) {
        // temp connect to || curr -> prev
        temp = curr.prev;
        // curr prev connect to curr next
        curr.prev = curr.next;
        // curr next connect to the temp;
        curr.next = temp;
       // curr to curr.prev 
        curr = curr.prev;
    }
    
    if(temp != null) {
        head = temp.prev;
    }
    return head;
}
