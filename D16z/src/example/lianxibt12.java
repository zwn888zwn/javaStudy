package example;


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class lianxibt12 extends JFrame {
	JButton bt1=new JButton("点我");
	JButton bt2=new JButton("点我");
	lianxibt12(){
		setLayout(new FlowLayout());
		bt1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				bt1.setEnabled(false);
				bt2.setEnabled(true);
				
			}
			
		});
		bt2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				bt1.setEnabled(true);
				bt2.setEnabled(false);
			}
			
		});
		add(bt1);
		add(bt2);
	}
	public static void main(String[] args) {
		lianxibt12 se=new lianxibt12();
		se.setSize(200,300);
		se.setTitle("aaaaaaaa");
		se.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		se.setVisible(true);
		se.setLocationRelativeTo(null);

	}

}
