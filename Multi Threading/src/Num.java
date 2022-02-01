import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Num extends Thread{
	Random random = new Random();
	public void run() {
		for(int i=0;i<10;i++) {
			int num =random.nextInt();
			if(num%2 == 0) {
				square sq = new square();
				sq.squ(num);
			}
			else {
				cube cu = new cube();
				cu.cub(num);
			}
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
