package week2.day2;

import java.util.Arrays;

public class arraysort {
	public static void main(String args[])
	{
		int[] arr = {1,2,3,4,7,6,8};
		
		// sorting
		
		Arrays.sort(arr);
		
		System.out.println("\n The  sorted array ");
		
		for(int num : arr)
			
		{
			System.out.println(num + " ");
			}
		
		
		// length
		
		
		for(int i=1;i<=arr.length;i++)
			
		{
			if(i!=arr[i-1])
				
			{
				System.out.println("\n the length of array is");
				
				System.out.println(i);break;
				
			}
			
			
		}
		
	}
}
