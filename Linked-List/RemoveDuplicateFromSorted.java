class Solution {
    public ListNode deleteDuplicates(ListNode head) {
      
        ListNode curr = head;

        while(curr != null && curr.next != null) {
         // curr ka data != curr ke next ke data ke equal hai to 
          if(curr.val != curr.next.val) {
               // curr pointer move by one 
               curr = curr.next;
          } else {
            // nahi to curr.next pointer ko 2 times move kar denge curr.next = curr.next.next;
            curr.next = curr.next.next;
          }   
        }
        return head;
    }
}
