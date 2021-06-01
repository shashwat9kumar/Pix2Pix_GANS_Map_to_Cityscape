/**
 * 
 * @author Shashwat Kumar
 * @category Foxmula Internship
 * 
 */

package May_31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurrence_in_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter 0 to input elements to array list and 1 to exit inputting");
			choice = sc.nextInt();
			if(choice == 0) {
				System.out.println("Enter a number");
				int input = sc.nextInt();
				arrayList.add(input);
				if(map.containsKey(input)) {
					map.put(input, (map.get(input)+1));
				}
				else {
					map.put(input, 1);
				}
			}
			else if(choice == 1) {
				break;
			}
			else {
				System.out.println("Wrong choice");
			}
		}while(choice!=1);

		System.out.println("\n\nThe Array List has the following element counts: ");
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			System.out.println("There are " + entry.getValue() + " instances of element " + entry.getKey());
		}
		
		
		sc.close();
	}

}
