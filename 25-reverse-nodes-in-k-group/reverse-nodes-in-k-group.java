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
    //function to reverse a ll using recursive approach
    public static ListNode reverseLL(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseLL(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
    //function to return kth node
    ListNode getKthNode(ListNode temp , int k){
         k -= 1;
        while(temp != null && k>0){
            k--;
            temp = temp.next;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevLast = null;
        while(temp != null){
        ListNode kthNode = getKthNode(temp , k);
        if(kthNode == null){
            if(prevLast != null){
                prevLast.next = temp;
            }
                break;
        }

            ListNode nextNode = kthNode.next;
            kthNode.next = null;
            reverseLL(temp);
            if(temp == head){
                head = kthNode;
            }else{
                prevLast.next = kthNode;
            }
            prevLast = temp;
            temp= nextNode;
        }
        return head;
    }
}
