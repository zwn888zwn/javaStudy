

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ActionDemo extends JFrame {
	 JLabel mess=new JLabel("");
	public ActionDemo(){
		setLayout(new GridLayout(0,1,5,5));
		JButton redBut=new JButton("red");
		redBut.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mess.setForeground(Color.RED);
			mess.setText("this is ok");
		}});
		JButton blueBut=new JButton("blue");
		blueBut.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mess.setForeground(Color.BLUE);
			mess.setText("this is ok");
		}});
		mess.setFont(new Font("ºÚÌå",2,30));
		add(redBut);
		add(blueBut);
		add(mess);
		add(new OvalJButton("ok"));
		
	}
	public static void main(String[] args) {
		ActionDemo se=new ActionDemo();
		se.setSize(400,600);
		se.setTitle("aaaaaaaa");
		se.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		se.setVisible(true);
		se.setLocationRelativeTo(null);
		
	}
	

}
