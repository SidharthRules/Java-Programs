import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class SImpleAppletParam extends Applet{		
	public void paint(Graphics g){
		g.setColor(Color.blue);
		setBackground(Color.white);
		g.drawRect(30,30,200,200);
		setBackground(Color.white);
		g.drawString("Hello World, I am an Applet !",50,50);
		g.drawString(s,50,110);
		g.drawString(getParameter("name").toString(),50,70);
		g.drawString(getParameter("myName").toString(),50,100);
		}*/
	}
	
/*<APPLET CODE="SImpleAppletParam.class" width="600" height="400">
 * <param name="name" value="Sidharth">
 * <param name=myName value=Sidharth>
 * </APPLET>*/
