/**
 * 
 * @author Shashwat Kumar
 * @category Foxmula Internship
 * 
 */

package May_31;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Traverse_TreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter 0 to input elements to set and 1 to exit inputting");
			choice = sc.nextInt();
			if(choice == 0) {
				System.out.println("Enter a number");
				set.add(sc.nextInt());
			}
			else if(choice == 1) {
				break;
			}
			else {
				System.out.println("Wrong choice");
			}
		}while(choice!=1);
		
		System.out.println("The set we have is: ");
		
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + ",\t");
		}
		System.out.println();
		
		sc.close();

	}

}
