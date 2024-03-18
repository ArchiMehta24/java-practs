import java.util.*;


public class SDemo 
{	
	public static void main(String[] args)
	{
		LinkedList<Integer> node = new LinkedList<Integer>();
		node.add(11);
		node.add(20);
		node.add(30);
		node.add(40);
		node.add(50);
		
		LinkedList<Integer> node1 = new LinkedList<Integer>();
		node1.add(10);
		node1.add(20);
		node1.add(31);
		node1.add(40);
		node1.add(50);
		node1.add(60);
		

		System.out.println("o1 = "+addList(node, node1));
		System.out.println("o2 = "+addOddNumbers(node, node1));		
	}
	
	/*static int addList(LinkedList<Integer> node, LinkedList<Integer> node1)
	{
		node.addAll(node1);
		int a = node.size();
		int sum = 0;
			
		for(int i=0; i<a; i++)
		{
			sum = sum + (int)node.get(i);
		}
						
		return sum;		
	}*/
	
	static int addList(LinkedList<Integer> node, LinkedList<Integer> node1)
	{
		node.addAll(node1);
		int sum = 0;
		Iterator<Integer> it = node.iterator();
		while(it.hasNext())
		{
			int n = (Integer)it.next();
			sum=sum+n;
		}
		
		return sum;		
	}
	
	static int addOddNumbers(LinkedList<Integer> node, LinkedList<Integer> node1)
	{
		node.addAll(node1);
		int sum1 = 0;
		Iterator<Integer> it = node.iterator();
		while(it.hasNext())
		{
			int n = (Integer)it.next();
			if(n%2!=0)
			{
				sum1=sum1+n;
			}
			
		}
		
		return sum1;
	}


}
