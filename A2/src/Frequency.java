import java.util.Scanner;
public class Frequency {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=input.next();
	System.out.println("Enter charactor to check frequency");
	char element=input.next().charAt(0);
	int frequency=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==element) {
			frequency++;
		}
	}
	System.out.println("The frequency of given charactor is"+frequency);
	}
}