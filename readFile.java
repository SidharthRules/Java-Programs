import java.io.*;
class ReadFile
{
	public static void main(String as[])
	{
		String fname="dpb.txt",buf=null;
		BufferedReader br=null;
		try
		{
			br= new BufferedReader(new FileReader(fname));
			while((buf=br.readLine())!=null)
			{
				System.out.println(buf);
			}
			br.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
