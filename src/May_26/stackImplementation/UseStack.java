/**
 * 
 * @author Shashwat Kumar
 * @category Foxmula Internship
 * 
 */

package May_26.stackImplementation;

import java.util.Scanner;

public class UseStack {
	
	static void checkSameNumberofElements(Stack s1, Stack s2) {
		
		/*
		 * To check if 2 instances of stack have same number of elements
		 */
		
		if(s1.getNumberOfElements() == s2.getNumberOfElements()) {
			System.out.println("Both stacks have same number of elements: " + s1.getNumberOfElements());
		}
	}

	public static void main(String[] args) {
		
		Stack s1 = new Stack();
		Stack s2 = new Stack();
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		do {
			
			System.out.println();
			System.out.println("Use the following inputs to perform operations:");
			System.out.println("1 : to push in Stack 1");
			System.out.println("2 : to pop from Stack 1");
			System.out.println("3 : to check if Stack 1 is empty");
			System.out.println("4 : to push in Stack 2");
			System.out.println("5 : to pop from Stack 2");
			System.out.println("6 : to check if Stack 2 is empty");
			System.out.println("7 : to exit");
			
			int input = sc.nextInt();
			
			if(input == 1) {
				System.out.println("Input element to be added in Stack 1");
				int element = sc.nextInt();
				s1.push(element);
			}
			else if(input == 2) {
				s1.pop();
			}
			else if(input == 3) {
				if(s1.checkEmpty()) System.out.println("Stack is empty");
				else System.out.println("Stack is not empty");
			}
			else if(input == 4) {
				System.out.println("Input element to be added in Stack 2");
				int element = sc.nextInt();
				s2.push(element);
			}
			else if(input == 5) {
				s2.pop();
			}
			else if(input == 6) {
				if(s2.checkEmpty()) System.out.println("Stack is empty");
				else System.out.println("Stack is not empty");
			}
			else if(input == 7) {
				flag = false;
			}
			else {
				System.out.println("Incorrect Input. Kindly enter a valid value");
				continue;
			}
			
			checkSameNumberofElements(s1, s2);
			
		}while(flag);
		
		sc.close();
	}

}
