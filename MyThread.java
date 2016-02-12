//Creating Thread Using Thread Class!
public class MyThread extends Thread
{
	int x;
	MyThread(int y)
	{
		x=y;
		this.start();
	}
	public void run()
	{
		System.out.println("The Value passes to this thread is: "+x);
	}
	public static void main(String []as)
	{
		MyThread a,b,c;
		a = new MyThread(3);
		b = new MyThread(5);
		c = new MyThread(7);
	}
}
