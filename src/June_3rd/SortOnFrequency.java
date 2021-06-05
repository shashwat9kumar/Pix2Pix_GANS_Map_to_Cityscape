package June_3rd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SortOnFrequency {
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	
	/**
	 * Function to input elements in array list and store corresponding element's frequency in HashMap
	 */
	void input() {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter 0 to input elements to array list and 1 to exit inputting");
			choice = sc.nextInt();
			if(choice == 0) {
				System.out.println("Enter a number");
				int num = sc.nextInt();
				arrayList.add(num);
				
				if(map.containsKey(num)) {
					map.put(num, map.get(num) + 1);
				}
				else {
					map.put(num, 1);
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
	
	
	void sortAndPrint(){
		ArrayList<Map.Entry<Integer, Integer>> temp = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
		
		temp.sort((Map.Entry<Integer, Integer> m1, Map.Entry<Integer, Integer> m2) -> m1.getValue() - m2.getValue());
		
		System.out.println(temp);
		System.out.println();
		for(Map.Entry<Integer, Integer> m: temp) {
			System.out.print(m.getKey() + " , ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		SortOnFrequency object = new SortOnFrequency();
		object.input();
		object.sortAndPrint();
	}

}
