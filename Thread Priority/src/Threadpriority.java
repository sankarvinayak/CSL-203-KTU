
public class Threadpriority extends Thread{
	public void run() {
		System.out.println("running thread name is:"+Thread.currentThread().getName()+"  priority is:"+Thread.currentThread().getPriority());
		
	}

	public static void main(String[] args) {
		Threadpriority t1 = new Threadpriority();
		Threadpriority t2 = new Threadpriority();
		Threadpriority t3 = new Threadpriority();
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();

	}

}
