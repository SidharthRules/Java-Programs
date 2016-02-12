import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class SimpleUni extends JFrame implements ActionListener
{
	String lm="";
	JCheckBox c[]=new JCheckBox[5];
	JLabel l;
	JButton b;
	JFrame f;
	SimpleUni()
	{
		f= new JFrame("Universities");
		//c[]= new JCheckBox[5];
		b=new JButton("check");
		l=new JLabel(lm);
	}
	public void GUI()
	{
		for (int i=0;i<5;i++)
			{
				c[i]=new JCheckBox("Course"+i,false);
				f.add(c[i]);
				//System.out.println(c[0].isSelected());
			}
		f.add(b);
		f.add(l);
		b.addActionListener(this);
		f.setLayout(new GridLayout(7,1));
		f.setSize(200,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		for (int i=0;i<5;i++)
		{
			if(c[i].isSelected())
				lm+=c[i].getText()+", ";
		}
		System.out.println(lm);
		l.setText(lm+" Selected.");
		lm="";
	}
	public static void main(String []as)
	{
		SimpleUni ob = new SimpleUni();
		ob.GUI();
	}
}
