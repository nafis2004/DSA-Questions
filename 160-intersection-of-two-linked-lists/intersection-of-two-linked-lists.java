/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;

        HashMap<ListNode , Integer> map = new HashMap<>();
        while(temp != null){
            map.put(temp , 1);
            temp = temp.next;
        }

        ListNode temp1 = headB;
        while(temp1 != null){
            if(map.containsKey(temp1)){
                return temp1;
                }
                temp1 = temp1.next;
        }
        return null;

    }
}