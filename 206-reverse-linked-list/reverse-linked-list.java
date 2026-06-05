import java.util.*;
class Solution {

    public ListNode reverseList(ListNode head) {
       //using recursion
       
       if(head == null || head.next == null){
        return head;
       }
        
        ListNode newHead = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }
}