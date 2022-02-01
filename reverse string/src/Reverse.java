import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Reverse {
	public static String Rev(String str) {
		String rev="";
		int i=0,j=str.length()-1;
		for(i=0;i<=j;i++) {
			rev+=str.charAt(j-i);
		}
		return rev;
	}
	public static void main(String[] args) throws IOException {
		String str;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		str=br.readLine();
		System.out.println(Rev(str));

	}
}
