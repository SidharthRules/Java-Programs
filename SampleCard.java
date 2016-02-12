import java.awt.*;
import java.applet.*;
/*
<applet code="SampleCard" width=300 height=400>
</applet>
*/
public class SampleCard extends Applet {
CardLayout cl = new CardLayout();
public void init () {
String fonts[] = Toolkit.getDefaultToolkit().getFontList();
setLayout (cl);
Panel pA = new Panel();
Panel pC = new Panel ();
pA.setLayout (new GridLayout (3, 2));
List l = new List(4, false);
Choice c = new Choice ();
for (int i=0;i<fonts.length;i++) {
pA.add (new Checkbox (fonts[i]));
l.addItem (fonts[i]);
c.addItem (fonts[i]);
}
pC.add (l);
pC.add (c);
add ("One", pA);
add ("Two", new Button ("Click Here"));
add ("Three", pC);
}
public boolean action (Event e, Object o) {
cl.next(this);
return true;
}
}
