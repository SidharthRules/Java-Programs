//Creating Thread Using Runnable Instance !
public class MyThreadRun implements Runnable
{
	int x;
	Thread t;
	MyThreadRun(int y)
	{
		x=y;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		System.out.println("The Value passes to this thread is: "+x);
	}
	public static void main(String []as)
	{
		MyThreadRun a,b,c;
		a = new MyThreadRun(3);
		b = new MyThreadRun(5);
		System.out.println(b.t.isAlive());
		try
		{
			b.t.join();
			a.t.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}/*Starting the Threads
		a.start();
		b.start();*/
		//Alternatively you can create and start thread like this
		//new Thread(new MyThreadRun(7)).start();
	}
}
