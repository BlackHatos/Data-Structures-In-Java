/**
Time complexity: O(n)
Space complexity: O(n)
*/

import java.util.*;
import static java.lang.System.*;

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

public class FindNthNodeFromEndUsingHashTable
{
	 static Node head = null, tail = null;
	
	 static void insertNode(int data)
	 {
		 Node temp = new Node(data), ptr = null;
		 if(head == null)
			 head = temp;
		 else
			 tail.next = temp;
		 tail = temp;
	 }
 
	 static void display()
	 {
		 Node ptr = head;
		 
		 while(ptr != null)
		 {
			 out.print(ptr.data+" ");
			 ptr = ptr.next;
		 }
		 out.println();
	 }
	 
	 static void nthNodeFromEnd(int n)
	 {
		Map<Integer, Node> map =  new HashMap<>();
		
		Node ptr = head;
		int count = 0;
		while(ptr != null)
		{
			map.put(count+1, ptr);
			count++;
			ptr = ptr.next;
		}
		
		Node rslt = map.get(count-n+1);
        		
		if(rslt == null)
			out.println("Insufficient number of nodes");
		else
			out.println(rslt.data);
	 }
	 
	public static void main(String [] args) 
	{
	  insertNode(10);
	  insertNode(7);
	  insertNode(8);
	  insertNode(41);
	  insertNode(3);
	  insertNode(45);
	  display();
	  out.println();
	  nthNodeFromEnd(1);
	}
}