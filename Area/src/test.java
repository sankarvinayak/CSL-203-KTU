import java.util.Scanner;

public class test {
	public static double area(double a) {
		return 3.14*a*a;
		
	}
	public static double area(double a,double b) {
		return a*b;
	}
	public static double area(double a,double b,double c) {
		double p=(a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}

	public static void main(String[] args) {
		double a,b,c;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		a=input.nextInt();
		System.out.println("Area of circle is "+area(a));
		System.out.println("Enter the length and bredth");
		a=input.nextFloat();
		b=input.nextFloat();
		System.out.println("Area of rectangle is "+area(a,b));
		System.out.println("Enter the 3 sides");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		System.out.println("Area of triangle is "+area(a,b,c));
	}

}
