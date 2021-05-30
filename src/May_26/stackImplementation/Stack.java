/**
 * 
 * @author Shashwat Kumar
 * @category Foxmula Internship
 * 
 */

package May_26.stackImplementation;


public class Stack {
	
	private LinkedList stack;
	private int top;
	
	public Stack() {
		stack = new LinkedList();
		top = -1;
	}
	
	public void push(int element) {
		stack.insertNode(element);
		top++;
	}
	
	public void pop() {
		if(top<0) {
			System.out.println("No element exists in Stack");
		}
		else {
			stack.deleteNode();
			top--;
		}
	}
	
	public boolean checkEmpty() {
		return stack.isEmpty();
	}
	
	public int peek() {
		return stack.getLastElement();
	}
	
	public int getNumberOfElements() {
		return top+1;
	}

}
