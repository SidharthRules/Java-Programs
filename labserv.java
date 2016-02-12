import java.io.*;
import java.net.*;
import java.util.*;

class labserv
{
	public static void main(String[] args)
	{
		ConnectionManager cm=new ConnectionManager();
		cm.accept();
	}
}

class ConnectionManager
{
	private ServerSocket ss;
	private final int PORT=4;
	private int client_count;
	private HashSet<BufferedWriter> broadcast=new HashSet<BufferedWriter>();
	
	ConnectionManager()
	{
		try
		{
			ss=new ServerSocket(PORT);
			System.out.println("Server is in port "+PORT);
		}
		catch(Exception e)
		{
		}
	}
	
	public void accept()
	{
		while(true)
		{
			try
			{
				Thread t=new Thread(new ClientThread(ss.accept(), ++client_count));
				t.start();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}	
	private class ClientThread implements Runnable
	{
		private Socket s;
		private int client_count;
		private BufferedReader br;
		private String msg;
		ClientThread(Socket s, int client_count)
		{
			this.s=s;
			this.client_count=client_count;
		}
	
		public void run()
		{
			try
			{
				System.out.println("Client-"+client_count+" is now online");
				//broadcast to clients
				for(BufferedWriter w : broadcast)
				{
					w.write("Client-"+client_count+"is activated "+"\n");
					w.flush();
				}
				br=new BufferedReader(new InputStreamReader(s.getInputStream()));
				broadcast.add(new BufferedWriter(new OutputStreamWriter(s.getOutputStream())));
				msg=br.readLine();
				while(!msg.equalsIgnoreCase("q"))
				{
					System.out.println("CLIENT-"+client_count+" messaged: "+msg);
					//broadcast to clients
					for(BufferedWriter w : broadcast)
					{
						w.write("CLIENT-"+client_count+" texted : "+msg+"\n");
						w.flush();
					}
					msg=br.readLine();			
				}
				System.out.println("CLIENT-"+client_count+" is offline");
				//broadcast to clients
				for(BufferedWriter w : broadcast)
				{
					w.write("CLIENT-"+client_count+" LEFT THE CHAT\n");
					w.flush();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}