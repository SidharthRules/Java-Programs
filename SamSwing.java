import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Citi extends JPanel
{
	Citi()
	{
		JLabel l=new JLabel("Citi Page");
		add(l);
	}
}
class Colo extends JPanel
{
	Colo()
	{
		JLabel l=new JLabel("Colo Page");
		add(l);
	}
}
class Fla extends JPanel
{
	Fla()
	{
		JLabel l=new JLabel("Fla Page");
		add(l);
	}
}
class SamSwing extends JFrame
{
	public static void main(String []ss)
	{
		JFrame f= new JFrame("Sample Frame");
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("Cities", new Citi());
		jtp.addTab("Colors", new Colo());
		jtp.addTab("Flavors", new Fla());
		f.add(jtp);
		f.setVisible(true);
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b= new JButton("Sam");
		f.add(b);
	}
}
