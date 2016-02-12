import java.applet.*;
import java.awt.*;
public class SimpleApplet extends Applet{
	public void paint(Graphics g){
		g.setColor(Color.blue);
		setBackground(Color.white);
		g.drawRect(30,30,200,200);
		setBackground(Color.white);
		g.drawString("Hello World, I am an Applet !",50,50);
		}
	}
	
/*<APPLET CODE="SimpleApplet.class" width="600" height="400"></APPLET>*/
