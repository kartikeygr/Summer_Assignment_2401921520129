class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // base case
        if(list1 == null || list2 == null) {
            return list1 == null ? list2 : list1;
        }

        // case 1
        if(list1.val <= list2.val) {
// we move head to next node of list1 and compare it with other nodes of list 2
            list1.next = mergeTwoLists(list1.next, list2);

            return list1;

        } else {

            // case 2
            list2.next = mergeTwoLists(list1, list2.next);

            return list2;
        }
    }
}
