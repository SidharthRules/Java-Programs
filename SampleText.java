import java.awt.*;
import java.awt.event.*;import java.applet.*;
/*<applet code="SampleText" width =400 height=300>
</applet>
*/
public class SampleText extends Applet implements KeyListener
{
public void init()
{
Label lab = new Label ("Enter Characters :");
add (lab);
TextField tf = new TextField (20);
add (tf);
tf.addKeyListener(this);
}
public void keyPressed(KeyEvent e)
{
showStatus("key Down");
}
public void keyReleased(KeyEvent e)
{
showStatus("key Up");}
public void keyTyped(KeyEvent e)
{
showStatus(" Recently typed characters are : " + e.getKeyChar());
}
}
