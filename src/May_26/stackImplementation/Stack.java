/**
 * 
 * @author Shashwat Kumar
 * @category Foxmula Internship
 * 
 */

package May_26.stackImplementation;

import java.util.ArrayList;

public class Stack {
	
	private ArrayList<Integer> stack;  // stack implemented using arraylist
	private int top = -1;              // variable to keep track of the top element of stack
	
	Stack(){
		stack = new ArrayList<Integer>();
	}
	
	Stack(int capacity){
		stack = new ArrayList<Integer>(capacity);
	}
	
	int peek() {
		
		/*
		 * To see the top element of the stack
		 */
		
		return stack.get(top);
	}
	
	public void push(int element) {
		
		/*
		 * To push an element on top of the stack
		 */
		
		stack.add(element);
		top++;
	}
	
	public void pop() {
		
		/*
		 * To pop an element from the top of the stack
		 */
		
		if(top<0) {
			System.out.println("No elements to pop");
		}
		else {
			System.out.println("Removed element : " + peek());
			stack.remove(top--);
		}
	}
	
	public boolean checkEmpty() {
		
		/*
		 * To check if the stack is empty
		 */
		
		return top<0?true:false;
	}
	
	public int getNumberOfElements() {
		
		/*
		 * To get the number of elements in the stack
		 */
		
		return top+1;
	}
	
}
