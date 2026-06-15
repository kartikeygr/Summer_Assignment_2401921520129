
class Solution {

    public ListNode reverseList(ListNode head) {

        // empty list or single node
        if(head == null || head.next == null) {
            return head;
        }

        ListNode prevNode = head;
        ListNode currNode = head.next;

        while(currNode != null) {

            // store next node
            ListNode nextNode = currNode.next;

            // reverse link
            currNode.next = prevNode;

            // move pointers
            prevNode = currNode;
            currNode = nextNode;
        }

        // old head becomes last node
        head.next = null;

        // new head
        head = prevNode;

        return head;
    }
}
