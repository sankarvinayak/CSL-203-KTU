import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

class PrimeCheck implements Runnable{
	String str;
	boolean isprime=false;
	@Override
	public void run() {
		Random random = new Random();   
		int n=random.nextInt(50);
		if(n<1)
			return;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return;
			}
		}
		str = "The randomly generated intiger "+n+" is a prime number";
		isprime=true;
	}
	public String getValue(){
		return str;
	}
}
class fileWriting implements Runnable{
	String str;
	public void setStr(String str) {
		this.str=str;
	}
	@Override
	public void run() {
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter("output.txt",true);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			pw.println(str);
			System.out.println("Data Successfully appended into file");
			pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			 
			 try {
				 pw.close();
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
	}
	
}
public class PrimeThread {
	static void write() {
		PrimeCheck p = new PrimeCheck();
		fileWriting f = new fileWriting();
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(f);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(p.isprime) {
		f.setStr(p.getValue());
		t2.start();
	}}
	
	public static void main(String args[]) throws InterruptedException {
		for(;;)
			write();
}
}
