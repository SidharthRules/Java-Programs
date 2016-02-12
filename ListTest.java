import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ListTest extends JFrame implements ItemListener
{
	JList l1,l2;
	JFrame f;
	JButton b;
	ListTest()
	{
		final String labels[] = { "A", "B", "C", "D", "E" };
		f=new JFrame("My F");
		f.setVisible(true);
		f.setSize(200,300);
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b=new JButton("Copy");
		l1=new JList(labels);
		l2=new JList();
		f.add(l1);
	}
	public void gui()
	{
		
		//f.add(l2);
		//l1.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		//List st = ie.getSelectedValuesList();
		//l2.add(st);		
	}
	public static void main(String a[])
	{
		new ListTest().gui();
	}
}
