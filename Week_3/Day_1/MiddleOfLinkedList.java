class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        //slow means pointer moves 1 step
        //fast moves 2 steps
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //slow reaches middle when fast reaches the end
        return slow;
        
    }
}
