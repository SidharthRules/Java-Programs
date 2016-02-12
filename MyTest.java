import java.awt.*;
import java.applet.*;
public class MyTest extends Applet
{
	public void paint(Graphics g)
	{
		for(int i=0;i<400;i+=20)
		{
			Dimension d = getSize();
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, d.width, d.height);
			g.setColor(Color.RED);			
			g.fillOval(i,50,100,100);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
//<applet code="MyTest" height = 300 width= 500></applet>
