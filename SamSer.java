import java.io.*;
class SamSer implements Serializable
{
	int a, b;
	SamSer(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	void disp()
	{
		System.out.println("The Values are : "+a+" "+b);
	}
	void update()
	{
		a-=1;
		b-=2;
	}
	public static void main(String []as)
	{
		SamSer s=new SamSer(2,3);
		try
		{
			ObjectOutputStream oos=new ObjectOutputStream( new FileOutputStream("obj.txt"));
			ObjectInputStream ois=new ObjectInputStream( new FileInputStream("obj.txt"));
			s.disp();
			//Serialization
			System.out.println("Writing the Object Data to a File !");
			oos.writeObject(s);
			s.update();
			s.disp();
			//DeSerialization
			System.out.println("Reading the Object Data to a File !");
			s=(SamSer) ois.readObject();
			s.disp();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
