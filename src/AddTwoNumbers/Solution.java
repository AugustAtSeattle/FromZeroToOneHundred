package AddTwoNumbers;
//You are given two non-empty linked lists representing two non-negative integers. 
//The digits are stored in reverse order and each of their nodes contain a single digit. 
//Add the two numbers and return it as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

import DataStructure.ListNode;

//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode dummy = new ListNode(0);
    	ListNode next = dummy;
    	
    	int num1 = 0; 
    	int num2 = 0;
    	int carry = 0;
    	ListNode newNode = null;
    	while(l1 != null || l2 != null){
    		if(l1 != null){
    			num1 = l1.val;
    			l1 = l1.next;
    		}
    		
    		if(l2 != null){
    			num2 = l2.val;
    			l2 = l2.next;
    		}
    		
    		int sum = carry + num1 + num2;
    		if(carry + num1 + num2 > 9){
    			newNode = new ListNode(sum%10);
    			carry = 1;
    		}else{
    			newNode = new ListNode(sum);
    			carry = 0;
    		}
    		
    		next.next = newNode;
    		next = next.next;
			num1 = 0;
			num2 = 0;
    	}
    	
    	if(carry == 1){
    		next.next =  new ListNode(1);
    	}
    	
    	
        return dummy.next;
    }
}
