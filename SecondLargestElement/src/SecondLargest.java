import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		int n,i,lar1,lar2;
		int arr[]=new int[20];
		Scanner input = new Scanner(System.in);
		System.out.println("How many elemnts you wish to enter");
		n=input.nextInt();
		System.out.println("Enter "+n+" Elements");
		for(i=0;i<n;i++) {
			arr[i]=input.nextInt();
			
		}
		if(arr[0]<arr[1]) {
			lar1=arr[0];
			lar2=arr[1];
		}else {
			lar1=arr[1];
			lar2=arr[0];
		}
		for(i=2;i<n;i++) {
			if(arr[i]<lar1) {
				lar2=lar1;
				lar1=arr[i];
			}else if(arr[i]<lar2) {
				lar2=arr[i];
			}
		}
		System.out.println("Second smallest element is"+lar2);
	}

}
