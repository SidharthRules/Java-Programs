import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class TextKey extends JFrame implements KeyListener
{
	JLabel l;
	String s;
	public void gui()
	{
		s="";
		JFrame f = new JFrame("My Frame");
		JTextField t = new JTextField(20);
		l= new JLabel(s);
		t.addKeyListener(this);
		f.add(t);
		f.add(l);
		f.setLayout(new FlowLayout());
		f.setSize(300,200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String []args)
	{
		new TextKey().gui();		
	}
	public void keyPressed(KeyEvent ke){}
	public void keyTyped(KeyEvent ke)
	{
		System.out.println(ke.getKeyChar()+"");
		l.setText(ke.getKeyChar()+"");
	}
	public void keyReleased(KeyEvent ke){}
}
