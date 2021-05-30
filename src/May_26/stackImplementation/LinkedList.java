/**
 * 
 * @author Shashwat Kumar
 * @category Foxmula Internship
 * 
 */

package May_26.stackImplementation;

public class LinkedList {
	
	private Node head;  // to store head of linked list
	private Node tail;   // to store tail of linked list
	
	static class Node {  
		
		/**
		 * To store the nodes of LinkedList
		 */
		
		int data;
		Node next;
		
		Node( int data){
			this.data = data;
			next = null;
		}
	}
	
	public LinkedList(){
		head = null;
		tail = null;
	}
	
	public void insertNode(int data) {
		Node newNode = new Node(data);
		if(head == null && tail == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = tail.next;
		}
	}
	
	public boolean deleteNode() {
		if(head ==null || tail == null) {
			return false;
		}
		else if(head == tail) {
			head = null;
			tail = null;
			return true;
		}
		else{
			Node n;
			for(n = head; n.next != tail; n = n.next) {
				; // reaching the pen-ultimate element of list 
			}
			System.out.println("Removing data : " + tail.data);
			n.next = null;
			tail = n;
			return true;
		}
	}
	
	public boolean isEmpty() {
		if(tail == null) 
			return true;
		else 
			return false;
	}
	
	public int getLastElement() {
		if(! isEmpty())
			return tail.data;
		else 
			return Integer.MIN_VALUE;  // Error value returned;
	}
	
	public void display() {
		if(! isEmpty() ) {
			for(Node n = head; n != null; n = n.next) {
				System.out.println(n.data);
			}
			System.out.println();
		}
		else {
			System.out.println("List is Empty");
		}
	}
}
