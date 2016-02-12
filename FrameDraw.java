import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class rect extends JPanel
{
	 public void paintComponent(Graphics g) {
		 
		super.paintComponent(g);
		g.drawRect(10,10,150,50);
	}
}
class circle extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawOval(10,10,150,150);
	}
}
class FrameDraw extends JFrame
{
	public static void main(String s[])
	{
		JFrame jf = new JFrame();
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("Rectangle", new rect());
		jtp.addTab("Circle", new circle());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(jtp); // TODO: add parameters to constructor call.
		jf.setSize(500, 500);
		jf.setVisible(true);
	}
}
