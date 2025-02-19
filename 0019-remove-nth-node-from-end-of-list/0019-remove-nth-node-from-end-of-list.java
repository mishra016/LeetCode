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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;
        ListNode slow = head;

        //move fast n steps
        for(int i=0; i<n; i++){
            fast = fast.next;
        }

        //if fast is null after moving n steps
        if(fast == null){
            return head.next;
        }

        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;

        // ListNode curr = head;
        // int length = 0;
        // //Calculate length
        // while(curr!= null){
        //     length++;
        //     curr = curr.next;
        // }

        // //if 1 node
        // if(n==length){
        //     return head.next;
        // }

        // curr = head;
        // for(int i=1; i<length - n; i++){
        //     curr = curr.next;
        // }

        // //remove target
        // curr.next = curr.next.next;

        // return head;
    }
}