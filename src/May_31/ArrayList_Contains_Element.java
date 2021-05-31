/**
 * 
 * @author Shashwat Kumar
 * @category Foxmula Internship
 * 
 */

package May_31;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Contains_Element {
	
	public static void showArrayList(ArrayList<Integer> arrayList) {
		for(int i: arrayList) {
			System.out.print(i + ",\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter 0 to input elements to array list and 1 to exit inputting");
			choice = sc.nextInt();
			if(choice == 0) {
				System.out.println("Enter a number");
				arrayList.add(sc.nextInt());
			}
			else if(choice == 1) {
				break;
			}
			else {
				System.out.println("Wrong choice");
			}
		}while(choice!=1);
		
		System.out.println("The arraylist we have is: ");
		showArrayList(arrayList);
		
		choice = 0;
		do {
			System.out.println("Enter 0 to input elements to check in array list and 1 to exit");
			choice = sc.nextInt();
			if(choice == 0) {
				System.out.println("Enter a number");
				int input = sc.nextInt();
				if(arrayList.contains(input)) {
					System.out.println("The array list contains " + input);
				}
				else {
					System.out.println("The array list does not contain " + input);
				}
			}
			else if(choice == 1) {
				break;
			}
			else {
				System.out.println("Wrong choice");
			}
		}while(choice!=1);
		
		sc.close();
	}

}
