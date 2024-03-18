import java.util.*;

public class SDemo2 {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Integer> node = new LinkedList<>();
        LinkedList<Integer> node1 = new LinkedList<>();

        // Input for first linked list
        System.out.println("Enter up to 5 elements for first linked list:");
        for (int i = 0; i < 5; i++) {
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                node.add(value);
            }
        }

        // Clear scanner buffer
        scanner.nextLine();

        // Input for second linked list
        System.out.println("Enter up to 5 elements for second linked list:");
        for (int i = 0; i < 5; i++) {
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                node1.add(value);
            } 
        }

        System.out.println("o2 = " + myLinkedList(node, node1));        
    }
    
    static LinkedList<Integer> myLinkedList(LinkedList<Integer> node, LinkedList<Integer> node1) {
        node1.add(1, node.get(1));
        node.remove(1);
        return node1;
    }
}
