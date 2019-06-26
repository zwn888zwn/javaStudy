package example;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventDemo extends JFrame {
	 JLabel mess=new JLabel("");
	 JButton  redBut;
	public MouseEventDemo(){
		setLayout(new GridLayout(0,1,5,5));
	  redBut=new JButton("red");
		redBut.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mess.setForeground(Color.RED);
			mess.setText("this is ok");
		}});
		redBut.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e) {
			
				redBut.getParent().setBackground(Color.YELLOW);
			}

			@Override
			public void mouseExited(MouseEvent e) {
			
				redBut.getParent().setBackground(Color.WHITE);
			}
			
		});
		JButton blueBut=new JButton("blue");
		blueBut.addMouseListener(new MouseAdapter(){

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				super.mouseEntered(arg0);
				arg0.getComponent().setVisible(false);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				super.mouseExited(arg0);
				arg0.getComponent().setVisible(true);
			}
			
		});
		blueBut.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mess.setForeground(Color.BLUE);
			mess.setText("this is ok");
		}});
		mess.setFont(new Font("ºÚÌå",2,30));
		add(redBut);
		add(blueBut);
		add(mess);
		
	}
	public static void main(String[] args) {
		MouseEventDemo se=new MouseEventDemo();
		se.setSize(400,600);
		se.setTitle("aaaaaaaa");
		se.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		se.setVisible(true);
		se.setLocationRelativeTo(null);
		
	}
	

}
