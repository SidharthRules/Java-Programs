import javax.swing.*;
import java.awt.*;
class MyFrame extends JFrame
{
	public static void main(String as[])
	{
		JFrame f= new JFrame("MY FRAME");
		JLabel l1=new JLabel("Sample Label 1");
		JLabel l2=new JLabel("Sample Label 2");
		JButton b1 = new JButton("OK1");
		JButton b2 = new JButton("OK2");;
		Container c = f.getContentPane();
		c.setLayout(new GridLayout(2,2));
		c.add(l1);
		c.add(b1);
		c.add(l2);
		c.add(b2);
		f.setVisible(true);
		f.setSize(300,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
