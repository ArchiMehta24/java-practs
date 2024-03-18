import java .util.*;
class LLNode
{
	private int data;
	private LLNode next;
	public int getData() 
	{
		return data;
	}
	public void setData(int data) 
	{
		this.data = data;
	}
	public LLNode getNext() 
	{
		return next;
	}
	public void setNext(LLNode next) 
	{
		this.next = next;
	}
	
	public LLNode(int data)
	{
		this.data = data;
		this.next = null;
	}
}

public class LLDemo 
{
	static LLNode createLL(LLNode head, int data)
	{
		LLNode h = head;
		LLNode p = h;
		LLNode q = h;
		LLNode newNode = null;
		if(h == null)
		{
			h = new LLNode(data);
		}
		else
		{
			while(p != null)
			{
				q = p; //q points to one node previous than p
	 			p = p.getNext(); // p points to the next node			
			}
			
			newNode = new LLNode(data);
			q.setNext(newNode);
		}
		
		return h;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. of nodes: ");
		int n = sc.nextInt();
		LLNode head = null; //start node is the head node.
		LLNode p = null;
		LLNode q = null;
		
		for(int i=0; i<n; i++)
		{
			System.out.println("enter the data: ");
			int data = sc.nextInt();
			LLNode a = createLL(head, data);
			if(i==0)
			{
				head = a;
				p=a;
				q=a;
			}
		}
		while(p!=null)
		{
			q=p;
			System.out.print("-->"+q.getData());
			p=p.getNext();
		}
	}
}
