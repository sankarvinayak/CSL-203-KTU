
public class ThreadSync {
	public static void main(String args[])
	{
		CallThread target = new CallThread();
		Caller ob1 = new Caller(target, "Thread A");
		Caller ob2 = new Caller(target, "Synchronized");
		Caller ob3 = new Caller(target, "Thread B");
		try
		{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch (InterruptedException e)
		{
			System.out.println("Interrupted");
		}
	}
}
