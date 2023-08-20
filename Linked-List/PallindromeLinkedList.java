class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode middleNode = slow;

        // reverse the l1 linked list

        ListNode curr = middleNode;
        ListNode prev = null;
        ListNode nextPointer;

         while(curr != null) {
             nextPointer = curr.next;
             curr.next = prev;
             prev = curr;
             curr = nextPointer;
         }

         ListNode left = head;
         ListNode right = prev;

         while(right != null) {
             if(right.val != left.val) {
                 return false;
             }
             right = right.next;
             left = left.next;
         }
         return true;
    }
}
