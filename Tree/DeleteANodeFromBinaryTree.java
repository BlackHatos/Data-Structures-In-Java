/**
Time complexity  : O(n)
Space complexity : O(n)
*/

import static java.lang.System.*;
import java.util.*;

class Node
{
	int data;
	Node left;
	Node right;
	
	public Node(int data)
	{
		this.data = data;
		left = null;
		right = null;
	}
}

public class DeleteANodeFromBinaryTree
{
	static void levelOrder(Node root)
	{
		Queue<Node> q = new ArrayDeque<>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			root = q.remove();
			out.print(root.data+" ");
			if(root.left != null)
				q.add(root.left);
			if(root.right != null)
				q.add(root.right);
		}
		out.println();
	}
	
	static void deleteNode(Node root, int value)
	{
		Node deepNode = null;
		Node requiredNode = null;
		Node prev = null;
		
		Queue<Node> q = new ArrayDeque<>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			root = q.remove();
			
			if(root.data == value)
				requiredNode = root;
			
			if(root.left != null)
			{
				prev = root;
				q.add(root.left);
			}

			if(root.right != null)
			{
				prev = root;
				q.add(root.right);
			}
				
		}
		
		deepNode = root;
		requiredNode.data = deepNode.data;
		
		if(prev.left == deepNode)
			prev.left = null;
		else
			prev.right = null;
	}
		
	  public static void main(String [] args)
		{
		
		  Node root = new Node(1);
		  Node r2 = new Node(2);
		  Node r3 = new Node(3);
		  Node r4 = new Node(4);
		  Node r5 = new Node(5);
		  Node r6 = new Node(6);
		  Node r7 = new Node(7);
		  
		  root.left = r2;
		  root.right = r3;
		  r2.left = r4;
		  r2.right = r5;
		  r3.left = r6;
		  r3.right = r7;
          levelOrder(root);
		  deleteNode(root, 2);
		  levelOrder(root);
		}
}
