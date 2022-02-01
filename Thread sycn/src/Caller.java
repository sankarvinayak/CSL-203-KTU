public class Caller  implements Runnable{
	String msg;
	CallThread target;
	Thread t;
	public Caller(CallThread targ,String s)
	{
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		synchronized (target)
		{
		target.call(msg);
		}
	}

}
