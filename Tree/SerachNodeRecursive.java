import static java.lang.System.*;

class Node 
{
	int data;
	Node left, right;
	Node(int data)
	{
		this.data = data;
		left = right = null;
	}
}

public class SerachNodeRecursive
 {
	static boolean search(Node root, int target)
	{	
        if(root == null)
			return false;
		
	    if(root.data == target)
			return true;
	      // not found -->               call to right else -->      return true
        return !search(root.left, target)? search(root.right, target): true;
	}    
		
    public static void main(String args[] ) throws Exception
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
		
		out.println(search(root, 1));
    }

}
