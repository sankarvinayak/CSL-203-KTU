import java.util.Scanner;

public class Sort {
	Scanner input = new Scanner(System.in);
	public static void sort(int arr[],int size) {
		Scanner input = new Scanner(System.in);
		int i,j;
		int opt,temp;
		System.out.println("1-Sort in assending order \n2-Sort in descenting order \nEnter your input");
		opt = input.nextInt();
		if(opt==1) {
			for(i=0;i<size-1;i++) {
				for(j=i+1;j<size;j++) {
					if(arr[j]<arr[i]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}else {
			for(i=0;i<size-1;i++) {
				for(j=i+1;j<size;j++) {
					if(arr[j]>arr[i]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		for(i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void sort(String args[],int size) {
		Scanner input = new Scanner(System.in);
		int i,j;
		int opt;
		System.out.println("1-Sort from A to Z\n2-Sort from Z to A\nEnter your input");
		opt = input.nextInt();
		if(opt==1) {
			for(i = 0; i<size-1; i++)   
			{  
				for (j = i+1; j<size; j++)   
				{   
					if(args[i].compareTo(args[j])>0)   
					{  
						String temp = args[i];  
						args[i] = args[j];  
						args[j] = temp;  
					}  
				}  
			}
		}else {
			for(i = 0; i<size-1; i++)   
			{  
				for (j = i+1; j<size; j++)   
				{   
					if(args[i].compareTo(args[j])<0)   
					{  
						String temp = args[i];  
						args[i] = args[j];  
						args[j] = temp;  
					}  
				}  
			}
		}
		for(i=0;i<size;i++) {
			System.out.println(args[i]);
		}
	}
	public static void main(String args[]) {
		int n1,n2,i;
		Scanner input = new Scanner(System.in);
		int[] arr = new int[20];
		String[] str = new String[20];
		System.out.println("How many intiger numbers you wish to sort");
		n1 = input.nextInt();
		for(i=0;i<n1;i++) {
			System.out.println("Intiger"+(i+1)+":");
			arr[i]=input.nextInt();
		}
		System.out.println("How many Strings you wish to sort");
		n2 = input.nextInt();
		for(i=0;i<n2;i++) {
			System.out.println("String"+(i+1)+":");
			str[i]=input.next();
		}
		sort(arr,n1);
		sort(str,n2);
	}
}
