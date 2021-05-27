package May_26.stackImplementation;

import java.util.ArrayList;

public class Stack {
	private ArrayList<Integer> stack;
	private int top = -1;
	
	Stack(){
		stack = new ArrayList<Integer>();
	}
	
	Stack(int capacity){
		stack = new ArrayList<Integer>(capacity);
	}
	
	int peek() {
		return stack.get(top);
	}
	
	public void push(int element) {
		stack.add(element);
		top++;
	}
	
	public void pop() {
		if(top<0) {
			System.out.println("No elements to pop");
		}
		else {
			System.out.println("Removed element : " + peek());
			stack.remove(top--);
		}
	}
	
	public boolean checkEmpty() {
		return top<0?true:false;
	}
	
	public int getNumberOfElements() {
		return top+1;
	}
	
}
