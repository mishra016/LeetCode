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

        ArrayList<Integer> val = new ArrayList<>();

        ListNode curr = head;

        while(curr !=null){
            val.add(curr.val);
            curr = curr.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode newCurrent = dummy;
        
        for (int i = val.size() - 1; i >= 0; i--) {
            newCurrent.next = new ListNode(val.get(i));
            newCurrent = newCurrent.next;
        }
        
        return dummy.next;
    }
}