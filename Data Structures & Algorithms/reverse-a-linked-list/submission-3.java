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
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;

        return helper(null, head);
    }

    private ListNode helper(ListNode prev, ListNode cur){

        if(cur == null){
            return prev;
        }

        ListNode head = helper(cur, cur.next);
        cur.next = prev;
        return head;
    }
}
