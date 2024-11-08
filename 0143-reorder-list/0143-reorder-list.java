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
    public void reorderList(ListNode head) {

        List<ListNode> nodes = new ArrayList<>();

        ListNode curr = head;

        while(curr !=null){
            nodes.add(curr);
            curr = curr.next;
        }

        int i=0; int j= nodes.size()-1;

        while(i<j){
            nodes.get(i).next = nodes.get(j);
            i++;

            if(i==j){
                break;
            }

            nodes.get(j).next = nodes.get(i);
            j--;
        }

        nodes.get(i).next = null;
        
    }
}