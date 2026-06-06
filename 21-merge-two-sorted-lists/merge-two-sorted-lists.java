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
         //InPlace Solution for the merging of 2 sorted list
        ListNode l1 = list1;
        ListNode l2 = list2;
        if(list1 == null) return list2;
        if(list2 == null)return list1;
        //swap l1 & l2(l1 points smaller always)
        if(l1.val > l2.val){
        ListNode temp = l1;
        l1 = l2;
        l2 = temp;
          }

        ListNode res = l1;
        while(l1 != null && l2 != null){
            ListNode tmp = null;
            while(l1 != null && l1.val <= l2.val){
                tmp = l1;
                l1 = l1.next;
            }
            tmp.next = l2;

            //swap
           ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        return res;
    }
}