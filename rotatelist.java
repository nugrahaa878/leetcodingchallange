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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        } else {
            int n = 1;
            ListNode tail = head;
            
            while(tail.next != null) {
                n++;
                tail = tail.next;
            }
            int step = n- (k%n);
            tail.next = head;
            ListNode newTail = tail;
            while(step-- > 0) {
                newTail = newTail.next;
            }
            ListNode newHead = newTail.next;
            newTail.next = null;
            return newHead;
        }
    }
}