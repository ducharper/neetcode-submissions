/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode sortedList = new ListNode();
        ListNode current = sortedList;
        
        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                current.next = new ListNode(list2.val, null);
                list2 = list2.next;
            } else {
                current.next = new ListNode(list1.val, null);
                list1 = list1.next;
            }

            current = current.next;
        }

        while (list1 != null) {
            current.next = new ListNode(list1.val, null);
            list1 = list1.next;
            current = current.next;
        }

        while (list2 != null) {
            current.next = new ListNode(list2.val, null);
            list2 = list2.next;
            current = current.next;
        }

        return sortedList.next;
    }
}