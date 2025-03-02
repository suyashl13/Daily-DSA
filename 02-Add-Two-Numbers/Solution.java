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
     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultHead = new ListNode(-1);
        ListNode prevNode = resultHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            
            int result = (((l1Val + l2Val) % 10) + carry) % 10;
            carry = (l1Val + l2Val + carry) > 9 ? 1 : 0;

            ListNode newNode = new ListNode(result);
            prevNode.next = newNode;
            prevNode = prevNode.next;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        
        ListNode result = resultHead.next;
        return result;
    }
}
