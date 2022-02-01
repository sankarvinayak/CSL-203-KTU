import java.util.Scanner;

public class Prime {
	public static boolean isprime(int n) {
		int i;
		for(i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		n=input.nextInt();
		if(isprime(n)) {
			System.out.println("Given  number is a prime");
		}
		else {
			System.out.println("Given  number is not a prime");
		}
	}
	

}
