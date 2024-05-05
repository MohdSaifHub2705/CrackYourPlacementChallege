class Solution {
    public ListNode reverseList(ListNode head) {
       if(head == null || head.next == null) {
        return head;
       } 

       ListNode prev = null;
       ListNode curr = head;
       ListNode nextNode;

       while(curr != null) {
        nextNode = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextNode;
       }

       return prev;
    }
}
