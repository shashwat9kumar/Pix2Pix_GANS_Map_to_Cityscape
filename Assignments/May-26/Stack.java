package May_26;

import java.util.ArrayList;

public class Stack {
	private ArrayList<Integer> arr;
	private int top = -1;
	
	Stack(){
		arr = new ArrayList<Integer>();
	}
	
	Stack(int capacity){
		arr = new ArrayList<Integer>(capacity);
	}
	
	public void push(int element) {
		arr.add(element);
		top++;
	}
	
	public void pop() {
		if(top<0) {
			System.out.println("No elements to pop");
		}
		else {
			arr.remove(top--);
		}
	}
	
	public boolean checkEmpty() {
		return top<0?true:false;
	}
	
	public int getNumberOfElements() {
		return top+1;
	}
	
}
