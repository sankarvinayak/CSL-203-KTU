
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Transpose {
	public static void printmatrix(int[][] matrix,int row,int col) {
		int i,j;
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++) {
				System.out.print(matrix[i][j]+" ");
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws IOException {
		int row,col,i,j;
		int matrix1[][]=new int[10][10];
		int matrixt[][]=new int[10][10];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rows\t");
		row=input.nextInt();
		System.out.print("Enter number of columns\n");
		col=input.nextInt();
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++) {
				System.out.println("Element["+(i+1)+"]+["+(j+1)+"]:");
				matrix1[i][j]=input.nextInt();
			}
		}
		for(i=0;i<=row;i++){    
			for(j=0;j<=col;j++){    
			matrixt[i][j]=matrix1[j][i];  
			}    
			} 
		System.out.println("\nCurrent matrix");
		printmatrix(matrix1,row,col);
		System.out.println("\nTranspose");
		printmatrix(matrixt, col, row);
		
	}

}
