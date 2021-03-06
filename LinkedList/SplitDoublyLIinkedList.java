// splitting doubly linked list into two 
// two equal doubly linked lists (even number of nodes)
// make one ode extra in first list (odd humber of noedes)

class Node 
{
	int data;
	Node next;
	Node(int value)
	{
		data = value;
		next = null;
	}
}

public class Rest 
{
	static Node insertNode(int value, Node head)
	{
		Node temp, ptr = null;
		temp = new Node(value);
		if(head == null)
			head = temp;
		else
		{
			ptr = head;
			while(ptr.next != null)
			{
				ptr = ptr.next;
			}
			ptr.next = temp;
		}
		return temp;
	}
	

    static void splitList(Node head)
	{
		Node p1 = head;
		Node p2 = head;
		do
		{
		  	p2 = p2.next;
			p1 = p1.next.next;
			
		}while(p1!=head && p1.next != head);
		
		if(p1.next == head) //odd number of nodes
		{
			p1.next = p2.next;
			p2.next = head;
			
			displayList(head);
			System.out.println();
			displayList(p1);
		}
		else if(p1 == head) //even number of nodes
		{
			Node temp1 = head.next;
			Node temp2 = p2.next;
			head.next = temp2;
			p2.next = temp1;
			
			displayList(head);
			System.out.println();
			displayList(p2);
		}
	}

	static  void displayList(Node head)
	{
		Node temp = head;
		do{
			System.out.print(temp.data+" ");
		 temp = temp.next;
		}while(head != temp);
	}
	
	public static void main(String [] args)
	{
		Node head = null;
		
	    head = insertNode(10, head);
		insertNode(20, head);
		insertNode(30, head);
		insertNode(40, head);
		insertNode(50, head);
		insertNode(60, head);   
		insertNode(56, head);   
		Node end = insertNode(78, head); 
        
		end.next = head;
		
		displayList(head);
		System.out.println();
		splitList(head);
	}
}