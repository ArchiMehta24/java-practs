import java.util.*;

class LLNode2 {

	private int data;
	private LLNode2 next; // data type of next is LLNode2

	public int getData() {
		return data; // getter
	}

	public void setData(int data) {
		this.data = data; // setter
	}

	public LLNode2 getNext() {
		return next;
	}

	public void setNext(LLNode2 next) {
		this.next = next;
	}

	public LLNode2(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.next = null;
	}

}// end of node

public class LLDemo3 {

	// don't comment
	// creation of a linked list
	static LLNode2 createLL(LLNode2 head, int data) { // head is start pointer here if its null we add data to it
		LLNode2 h = head;
		LLNode2 p = h;
		LLNode2 q = h;
		LLNode2 newNode = null;

		if (h == null) {
			h = new LLNode2(data);
		}

		else {
			while (p != null) {
				q = p;
				p = p.getNext();
			}

			newNode = new LLNode2(data);
			q.setNext(newNode); // connect q's 'next' to newNode
		}
		return h;
	}

	// adding the value to the last node --- [a]
	static void addLast(LLNode2 head, int d) {
		LLNode2 newNode = new LLNode2(d);
		if (head == null)
			head = newNode;
		LLNode2 Current = head;
		while (Current.getNext() != null)
			Current = Current.getNext();
		Current.setNext(newNode);
		newNode.setNext(null);
		display(head);

	}

	// insertion of data with the help of position -- [b]
	static LLNode2 alterLL(LLNode2 head, int data, int pos) {
		LLNode2 h = head;
		LLNode2 p = h;
		LLNode2 q = h;
		LLNode2 newNode = new LLNode2(data);

		if (pos == 1) {
			newNode.setNext(h);
			return newNode;
		}
		for (int i = 1; i < pos; i++) {
			p = p.getNext();
		}
		for (int j = 1; j < pos - 1; j++) {
			q = q.getNext();
		}
		newNode.setNext(p);
		q.setNext(newNode);

		return h;
	}

	// changing the first value in the sense changing 20 to 99 -- [c]
	static void changeVAl(LLNode2 head, int d, int change) {
		System.out.println("After changing:");
		LLNode2 newnode = new LLNode2(d);
		LLNode2 current = head;
		while (current != null) {
			if (current.getData() == d) {
				current.setData(change);
			}
			current = current.getNext();
		}
		display(head);

	}

	// adding the value directly to the first node -- [d]
	static void addFirst(LLNode2 head, int d) {
		LLNode2 newNode = new LLNode2(d);
		if (head == null)
			head = newNode;
		newNode.setNext(head);
		head = newNode;
		display(head);

	}

	// inserting a value with the help of a value asked from the user present in the
	// list --[e]
	static void addNodeval(LLNode2 head, int d, int change) {
		LLNode2 newnode = new LLNode2(d);
		LLNode2 current = head;
		while (current != null) {
			if (current.getData() == d) {
				newnode.setNext(current.getNext());
				current.setNext(newnode);
				newnode.setData(change);

			}
			current = current.getNext();
		}
		display(head);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("how many nodes you want ? ");
		int n = sc.nextInt();

		LLNode2 head = null;
		LLNode2 p = null;
		LLNode2 q = null;

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the data : ");
			int data = sc.nextInt();
			LLNode2 x = createLL(head, data);
			if (i == 0) {
				head = x;
				p = x;
				q = x;
			}

		}

		display(head); // don't comment
		System.out.println();
		System.out.println("eneter which number ou want to add: ");
		int data = sc.nextInt();// don't comment
		System.out.println("eneter position: ");
		int pos = sc.nextInt();
		LLNode2 b = alterLL(head, data, pos);
		System.out.println(alterLL(head, data, pos));
//   changeVAl(head, d, change); // [c]
//   System.out.println();
//   addNodeval(head, 30, 99); //[e]
//   System.out.println();
//   addFirst(head,40); // [d]
//   System.out.println();
//   addLast(head,100); //[a]
//   System.out.println();
//   //[b]
//   System.out.println("enter the new data: ");
//   int nd=sc.nextInt();
//   System.out.println("enter the new position: ");
//   int np=sc.nextInt();
//   LLNode2 ghg=alterLL(head,nd,np);
//   display(ghg);

	}

	// don't comment
	static void display(LLNode2 head) {
		LLNode2 p = head;
		LLNode2 q = null;
		while (p != null) {

			q = p; // one node behind p
			System.out.print("-->" + q.getData());
			p = p.getNext();
		}
	}

}
