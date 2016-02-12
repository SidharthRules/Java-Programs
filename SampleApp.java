import java.applet.*;
import java.awt.*;
public class SampleApp extends Applet
{
	public void init()
	{
		Button b= new Button("Bla");
		Label l=new Label("Bla Label",Label.CENTER);
		Checkbox c=new Checkbox("Ture",true);
		CheckboxGroup cg = new CheckboxGroup();
		add(l);
		add(b);
		add(c);
		add(new Checkbox("Bla2",cg,false));
		add(new Checkbox("Bla3",cg,false));
		add(new Checkbox("Bla4",cg,true));

	}

}	
/*<APPLET CODE="SampleApp" width="600" height="400"></APPLET>*/

