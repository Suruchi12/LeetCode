/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ListNode{
    int value;
    ListNode next;
    ListNode(int x){
        value = x;
    }
}
class LinkedList
{
    ListNode head = null;
    
    void insert(int data){
        ListNode temp = new ListNode(data);
        temp.next = null;
        ListNode p = head;
        if(head==null)
            head = temp;
        else{
            while(p.next!=null)
                p = p.next;
            p.next = temp;
            
        }
    }
    
    void display(){
        ListNode p = head;
        while(p!=null){
            System.out.print(p.value + "->");
            p=p.next;
        }
        System.out.println("Null");
        
    }
    
    public static void add(LinkedList l1, LinkedList l2){
        LinkedList l3 = new LinkedList();
        
        ListNode p = l1.head;
        ListNode q = l2.head;
        ListNode r = l3.head;
        int sum=0,carry=0;
        while(p!=null || q!=null ){
            sum = carry + (p!=null?p.value:0) + (q!=null?q.value:0);
            
            if(sum >= 10)
                carry =1;
            else
                carry =0;
            
            sum = sum%10;
            
            l3.insert(sum);
            if(p!=null)
                p = p.next;
            if(q!=null)
                q= q.next;
            
        }
        if(carry>0)
            l3.insert(carry);
        l3.display();
    }
    
    public static void main (String[] args) throws java.lang.Exception
    {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        
        l1.insert(7);
        l1.insert(5);
        l1.insert(9);
        l1.insert(4);
        l1.insert(6);
        
        l2.insert(8);
        l2.insert(4);
        
        l1.display();
        l2.display();
        
        add(l1,l2);
    }
}

