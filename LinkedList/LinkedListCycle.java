/* -----------------------------------
 *  WARNING:
 * -----------------------------------
 *  Your code may fail to compile
 *  because it contains public class
 *  declarations.
 *  To fix this, please remove the
 *  "public" keyword from your class
 *  declarations.
 */

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
class Solution {
    public static boolean hasCycle(ListNode head) {
        
        if(head == null || head.next == null)
            return false;
        ListNode slow,fast;
        slow=fast=head;
        fast=head.next.next;
        
        while(fast!= null)
        {
            if(fast==slow)
                return true;
            
            if(fast.next == null)
                return false;
            
            fast=fast.next.next;
            slow=slow.next;
        }
        
        return false;
        
    }
    public static void main(String[] args){
        
        ListNode head = new ListNode(1);
        ListNode p = head;
        p.next = new ListNode(2);
        p = p.next;
        p.next= new ListNode(3);
        p=p.next;
        p.next = new ListNode(4);
        p=p.next;
        p.next=head;
        
        boolean bool = hasCycle(head);
        System.out.println(bool);
    }
}

