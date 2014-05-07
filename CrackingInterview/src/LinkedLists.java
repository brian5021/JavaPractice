import java.util.HashMap;

public class LinkedLists {

	

	void removeDup(Node n) {
		HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
		Node prev = null;
		while (n != null) {
			if (freq.get(n.data) != null) {
				prev.next = n.next;
			}
			else {
				freq.put((Integer) n.data, 1);
				prev = n;
			}
			n = n.next;
		}
		
	}

}

 class Node {
	Object data;
	Node next = null;

	Node(Object data) {
		this.data = data;
	}

	void appendToTail(Object d) {
		Node end = new Node(d);
		Node n = this;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}

	Node deleteNode(Node head, Object d) {
		Node n = head;
		if (n.data.equals(d)) {
			return head.next;
		}
		while (n.next != null) {
			if (n.next.data.equals(d)) {
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		return head;
	}
}
	

