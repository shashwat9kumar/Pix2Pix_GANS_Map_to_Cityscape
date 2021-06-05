package June_3rd;

import java.util.Scanner;

public class CheckNumber {
	
	static boolean isOdd(int number) {
		return (number%2==0)?false:true;
	}
	
	
	static boolean isPrime(int number) {
		int count=0;
		for(int i=2;i<=number/2;i++) {
			if(number%i==0)
				count++;
		}
		return (count!=0)?false:true;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to be checked");
		
		try {
			int number = sc.nextInt();
			if(isOdd(number) && isPrime(number)) {
				throw new OddandPrimeNumberException("Odd and Prime Number Exception Occurred");
			}
			System.out.println("No exception Occurred");
		}
		catch(OddandPrimeNumberException exception) {
			System.out.println(exception.errorMessage());
			System.out.println(exception.getMessage());
		}
		finally {
			sc.close();
		}
		
	}

}
