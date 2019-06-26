
import javax.swing.*;
import java.awt.*;
public class OvalJButton extends JButton{
	public OvalJButton(String s){
		super(s);
	}

	protected void paintComponent(Graphics g){
		super.paintComponents(g);
		g.drawOval(0, 0, this.getWidth()-2,this.getHeight()-2);
		
	}

}
