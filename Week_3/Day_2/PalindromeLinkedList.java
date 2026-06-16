class Solution {

    // find middle node
    public ListNode findMiddle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // reverse linked list
    public ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }

    public boolean isPalindrome(ListNode head) {

        // empty list or single node
        if(head == null || head.next == null) {
            return true;
        }

        // find middle
        ListNode middle = findMiddle(head);

        // reverse second half
        ListNode secondHalfStart = reverse(middle.next);

        // first half start
        ListNode firstHalfStart = head;

        // compare both halves
        while(secondHalfStart != null) {

            if(firstHalfStart.val != secondHalfStart.val) {
                return false;
            }

            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }

        return true;
    }
}
