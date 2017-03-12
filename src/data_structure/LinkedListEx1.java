package data_structure;

public class LinkedListEx1 {

	public static void main(String[] args) {
		LinkedList L = new LinkedList();
		System.out.println("(1) insert three nodes into empty list");
		L.insertLastNode("monday");
		L.insertLastNode("wednesday");
		L.insertLastNode("sunday");
		L.printList();

		// System.out.println("(2) insert a node Friday behind the node
		// wednesday");
		// ListNode pre = L.searchNode("wednesday");
		// if(pre == null) {
		// System.out.println("search failed >> there is no data you are looking
		// for...");
		// }
		// else {
		// L.insertMiddleNode(pre, "friday");
		// L.printList();
		// }
		//
		// System.out.println("(3) Reverse nodes of the list");
		// L.reverseList();
		// L.printList();
		//
		// System.out.println("(4) Delete the last node of the list");
		// L.deleteLastNode();
		// L.printList();
	}

	public static class LinkedList {

		Node head;

		public class Node {
			String data;
			Node link;
		}

		public LinkedList() {
			head = null;
		}

		public void insertLastNode(String data) {
			Node newNode = new Node();
			newNode.data = data;
			newNode.link = null;
			if (head == null) {
				this.head = newNode;
			} else {
				Node temp = head;
				while (temp.link != null) {
					temp = temp.link;
				}
				temp.link = newNode;
			}
		}

		public void printList() {
			Node temp = this.head;
			System.out.println("Print List!!");
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.link;
			}
			System.out.println("Finish printing!!");
		}
	}
}
