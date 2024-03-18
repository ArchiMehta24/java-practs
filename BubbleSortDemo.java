import java.util.*;

public class BubbleSortDemo
{
	static void bubbleSort(int[] arr, int n)
	{
		System.out.println("before sorting:");
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println();
				
		int temp = 0;
		for(int i=0; i<n; i++)
		{
			for(int j=1; j<(n-i); j++)
			{
				if(arr[j-1] > arr[j])
				{
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}				
			}
		}
		
		System.out.println("after sorting:");
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]);
		}
	}
		
	public static void main(String[] args)
	{
		System.out.println("-------BUBBLE SORT--------");
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter the length of array and then the array: ");
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		bubbleSort(arr,n);			
	}

}

