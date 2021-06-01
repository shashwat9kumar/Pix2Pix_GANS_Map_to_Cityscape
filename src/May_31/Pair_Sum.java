/**
 * 
 * @author Shashwat Kumar
 * @category Foxmula Internship
 * 
 */

package May_31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Pair_Sum {

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
			}
			else if(choice == 1) {
				break;
			}
			else {
				System.out.println("Wrong choice");
			}
		}while(choice!=1);

		System.out.println("Enter the sum, whose pair is to be found");
		int k = sc.nextInt();
		boolean flag = false;
		
		for(int i: arrayList) {
			map.put(i, k-i);
			if(map.containsKey(i) && map.containsKey((k-i))) {
				System.out.println("Array List has the pair : " + (i) + " & " + (k-i));
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("The array list has no pair that leads to sum " + k);
		}
		sc.close();
	}

}
