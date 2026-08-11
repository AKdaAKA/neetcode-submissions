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
         ListNode prev = null;
    ListNode current = head;

    while (current != null) {
        //moving pointers
        ListNode next = current.next; //goes to node 1
        current.next = prev; //points 0 to null (end)
        prev = current; // set prev to node 0
        current = next; //set current to 1
        System.out.print(prev.val + " ");
    }

    return prev; //return head

    }
    
}
