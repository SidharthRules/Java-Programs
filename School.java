import java.sql.Connection;
import java.sql.DriverManager;
class School
{
	public static final String dri="jdbc.odbc.jdbcodbc.driver";
	public static final String url="jdbc:mysql://localhost";
	public static final String user="root";
	public static final String pass="";
	public static void main(String []as)
	{
		try
		{
			Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Success");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
