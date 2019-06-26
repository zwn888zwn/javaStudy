package example;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
public class Test1jisuanqi extends JFrame {
	Test1jisuanqi(){
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		p1.setLayout(new GridLayout(4,3,2,2));
		p2.setLayout(new BorderLayout());
		for(int i=1;i<=9;i++){
			p1.add(new JButton(i+""));
		}
		p1.add(new JButton("0"));
		p1.add(new JButton("Start"));
		p1.add(new JButton("Stop"));
		p2.add(new JTextField("Time to be displayed here"),BorderLayout.NORTH);
		p2.add(p1,BorderLayout.EAST);
		add(p2,BorderLayout.EAST);
		add(new JButton("FOOD TO BE PLACED HERE"),BorderLayout.CENTER);
		
	}
	public static void main(String[] args) {
		Test1jisuanqi frame =new Test1jisuanqi();
		frame.setTitle("aaa");
		frame.setLocationRelativeTo(null);
		frame.setSize(450,320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
