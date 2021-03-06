// Time complexity : O(log i) > here i is index of element to be searched
// This is useful in case when array is unbounded (tends to infinite)

import java.util.Arrays;
public class ExponentialSearch 
{
    static int exponentialSearch(int A[], int item)
	{
		int i = 1;
		if(A[0] == item)
		  return 0;
	  
		while(i < A.length && A[i] <= item) //O(log i) > "i" is index of searched element
		{
		     if(A[i] == item)
				 return i;
			 i = i * 2;
		}
		
		// it returns a negative nuber if element is not found in the array
		/** 
		* use 'A.length' and 'i+1' instead of 
		* 'A.length-1' and 'i' beacause it is exclusive
		*/
	    return Arrays.binarySearch(A,i/2,Math.min(i+1,A.length),item); //O(log i)
	}
		
	public static void main(String [] args)
	{
		int A[] = {5,6,7,10,23,54,45,78,4,0,23,645,8,52,156,78};
		Arrays.sort(A);
		for(int x : A)
		System.out.print(x+" ");
		int item = 45;
		System.out.print("\n"+exponentialSearch(A,item));		
	}
}