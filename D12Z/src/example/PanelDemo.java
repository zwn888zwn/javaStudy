package example;
import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
public class PanelDemo extends JFrame {
	public PanelDemo(){
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p1.setBorder(new TitledBorder("Main"));
		JButton bt1=new JButton("finish");
		bt1.setToolTipText("ok");
		p2.add(new JButton("next"));
		p2.add(bt1);
		p2.add(new JButton("cancel"));
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		add(new JLabel("create a java project"),BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		PanelDemo pd=new PanelDemo();
		pd.setSize(500,300);
		pd.setTitle("aaaaaaaaaaaa");
		pd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pd.setLocationRelativeTo(null);
		pd.setVisible(true);

	}

}
