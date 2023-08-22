class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // corner case
        if(lists == null || lists.length == 0) {
          return null;
        }
        return mergeKListHelper(lists, 0, lists.length-1);
    }

    private ListNode mergeKListHelper(ListNode[] lists, int start, int end) {
      if(start == end){
        return lists[start];
      } 

      if(start + 1 == end) {
         return merge(lists[start], lists[end]);
      }

      int mid = start + (end-start)/2;
      ListNode left = mergeKListHelper(lists, start, mid);
      ListNode right = mergeKListHelper(lists, mid+1, end);
      return merge(left, right);
   }

   private ListNode merge(ListNode l1, ListNode l2) {
      //  create a dummy node to acess the pointer
      ListNode dummy = new ListNode(0);
      ListNode curr = dummy;

      while(l1 != null && l2 != null) {
        if(l1.val < l2.val) {
          curr.next = l1;
          l1 = l1.next;
        } else {
          curr.next = l2;
          l2 = l2.next;
        }
        curr = curr.next;
      }
      curr.next = (l1 != null) ? l1 : l2;
      return dummy.next;
   }
}
