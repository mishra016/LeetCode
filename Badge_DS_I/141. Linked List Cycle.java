/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode pos1 = head;
        ListNode pos2 = head;

        while(pos2!= null && pos2.next!= null){
            pos2 = pos2.next.next;
            pos1 = pos1.next;
            if(pos1 == pos2){
                return true;
            }
        }
        return false;
    }
}