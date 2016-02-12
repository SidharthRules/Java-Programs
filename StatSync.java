//Program to implement Statement Snchronization in Java
class Bla1
{
	int a;
	Bla1(int a)
	{
		this.a=a;
	}
	synchronized void disp()
	{
		System.out.println("The Val is "+a);
	}
}
class StatSync extends Thread
{
	Bla1 b1;
	StatSync(Bla1 b1)
	{
		this.b1=b1;
	}
	synchronized public void run()
	{
		b1.disp();
	}
	public static void main(String []args)
	{
		StatSync s1,s2,s3,s4,s5,s6,s7,s8;
		s1=new StatSync(new Bla1(1));
		s2=new StatSync(new Bla1(2));
		s3=new StatSync(new Bla1(3));
		s4=new StatSync(new Bla1(4));
		s5=new StatSync(new Bla1(5));
		s6=new StatSync(new Bla1(6));
		s7=new StatSync(new Bla1(7));
		s8=new StatSync(new Bla1(8));
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();
		s6.start();
		s7.start();
		s8.start();
		try{
			s1.join();
			s2.join();
			s3.join();
			s4.join();
			s5.join();
			s6.join();
			s7.join();
			s8.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
