/*
 You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 
 You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 
 Example
 
 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 Explanation: 342 + 465 = 807.
 
 Your input
 [7,5,9,4,6]
 [8,4]
 Output
 [5,0,0,5,6]
 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode l3 = new ListNode(0);
        ListNode temp = l3;
        int sum=0, carry=0;
        
        while(l1!=null || l2!=null)
        {
            
            sum = carry + (l1!=null?l1.val:0) + (l2!=null?l2.val:0);
            if(sum>=10)
            {
                carry = sum/10;
                sum = sum%10;
            }
            else
                carry = 0;
            
            temp.next = new ListNode(sum);
            temp= temp.next;
            
            if(l1!=null)
                l1 = l1.next;
            if(l2!=null)
                l2 = l2.next;
            
        }
        
        if(carry>0)
        {
            temp.next = new ListNode(carry);
        }
        return l3.next;
    }
}
