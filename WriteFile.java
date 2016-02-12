import java.io.*;
public class WriteFile
{
	public static void main(String args[])
	{
		String fname="dpb.txt",st="init";
		BufferedWriter bw=null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			bw = new BufferedWriter(new FileWriter(fname));
			System.out.println("Give a blank new line to terminate !");
			while(!st.equals(""))
			{
				bw.write(st=br.readLine());
				bw.newLine();
			}
			bw.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
