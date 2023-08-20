class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
         HashSet<Integer> hs = new HashSet<>();
         Node curr = head;
         Node prev = null;
         
         while(curr != null) {
             int currIndexData = curr.data;
             // duplicates present in the set prev->pointer = point to curr->next pointer and remove curr;
             if(hs.contains(currIndexData)) {
                 prev.next = curr.next;
             } else {
                 // duplicates not present in the set to add data set and move pointer to the prev = curr 
                 hs.add(currIndexData);
                 prev = curr;
             }
             curr = curr.next;
         }
         return head;
         
    }
}
