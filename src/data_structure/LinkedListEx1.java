package data_structure;

public class LinkedListEx1 {

	public static void main(String[] args) {
		LinkedList L = new LinkedList();
		System.out.println("(1) insert three nodes into empty list");
		L.insertLastNode("monday");
		L.insertLastNode("wednesday");
		L.insertLastNode("sunday");
		L.printList();
		
		System.out.println("(2) insert a node Friday behind the node wednesday");
		ListNode pre = L.searchNode("wednesday");
		if(pre == null) {
			System.out.println("search failed >> there is no data you are looking for...");
		}
		else {
			L.insertMiddleNode(pre, "friday");
			L.printList();
		}
		
		System.out.println("(3) Reverse nodes of the list");
		L.reverseList();
		L.printList();
		
		System.out.println("(4) Delete the last node of the list");
		L.deleteLastNode();
		L.printList();
	}
}
