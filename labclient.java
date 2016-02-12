import java.io.*;
import java.net.*;
import java.util.*;

class labclient
{
	public static void main(String args[])
	{
		Connection c=new Connection();
		c.communicate();
	}
}

class Connection implements Runnable
{
	private String server_data;
	private int PORT=4;
	private final Scanner sc=new Scanner(System.in);
	private BufferedReader br;
	private BufferedWriter bw;
	private Socket s;
	private Thread t;
	
	Connection()
	{
		try
		{
			s=new Socket("localhost", PORT);
			br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			t=new Thread(this);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void communicate()
	{
		t.start();
		while(true)
		{
			try
			{
				bw.write(sc.nextLine()+"\n");
				bw.flush();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public void run()
	{
		while(true)
		{
			try
			{
				server_data=br.readLine();
				System.out.println(server_data);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
