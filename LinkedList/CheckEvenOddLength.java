/**
Time complexity: O(n)
Space complexity : O(1) 
*/

import static java.lang.System.*;
import java.util.*;

class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
	   this.data = data;   
	   next =  null;
	}
}

public class CheckEvenOddLength
{
	 static Node tail = null;
	
	 static Node insertNode(Node head,int data)
	 {
		 Node temp = new Node(data);
		 Node ptr = null;
		 
		if(head == null)
		{
			head = temp;
			tail = head;
			return head;
		}
		
        tail.next = temp;
        tail = temp;
		
		return tail;
	 }
	 
	 
	 static void mergeLists(Node head1, NOde head2)
	 {
		 
	 }
	 
	 static void displayList(Node head)
	 {
		 Node ptr = head;
		 
		 while(ptr != null)
		 {
			 out.print(ptr.data+" ");
			 ptr = ptr.next;
		 }
		 
		 out.println();
	 }
	 			
	public static void main(String [] args) 
	{
		Node head1 =  null;
		head1 = insertNode(head1, 5);
		insertNode(head1, 8);
		insertNode(head1, 32);
		insertNode(head1, 7);
		insertNode(head1, 52);
		insertNode(head1, 45);
				
		displayList(head1);
		checkEvenOdd(head1);
	}
}