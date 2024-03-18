import java.util.*;

public class DynamicSort
{
	static void bubbleSort1(int[] arr1, int m)
	{
		int temp = 0;
		for(int i=0; i<m; i++)
		{
			for(int j=1; j<(m-i); j++)
			{
				if(arr1[j-1] > arr1[j])
				{
					temp = arr1[j-1];
					arr1[j-1] = arr1[j];
					arr1[j] = temp;
				}				
			}
		}
	}

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("-------OTHER SORT--------");
		System.out.println("enter the length of array and then the array: ");
		int m=sc.nextInt();
		int arr1[]= new int[m];
		for(int i=0; i<m; i++)
		{
			arr1[i]=sc.nextInt();
			bubbleSort1(arr1, i+1);
			System.out.println("sorted array after "+(i+1)+"th element is entered: ");
			for(int j=0; j<m; j++)
			{
				System.out.println(arr1[j]);
			}
		}
		System.out.println("array is sorted");

		
	}

}

