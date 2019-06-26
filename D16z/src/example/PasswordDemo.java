package example;


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class PasswordDemo extends JFrame {
	JPasswordField pass1;
	JPasswordField pass2;
	
	PasswordDemo(){
		pass1=new JPasswordField();
		pass2=new JPasswordField();
		JButton bt1=new JButton("ȷ��");
		JPanel jp1=new JPanel();
		jp1.setLayout(new GridLayout(2,2));
		jp1.add(new JLabel("���룺"));
		jp1.add(pass1);
		jp1.add(new JLabel("�ظ����룺"));
		jp1.add(pass2);
		add(jp1);
		add(bt1,BorderLayout.SOUTH);
		bt1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String p1=new String(pass1.getPassword());
				String p2=new String(pass2.getPassword());
				if(!p1.equals("")||!p2.equals("")){
					if(p1.equals(p2)){
						JOptionPane.showMessageDialog(null, "�������óɹ�");
					}
					else{
						JOptionPane.showMessageDialog(null, "�������벻һ��");
				}
				}else{
					JOptionPane.showMessageDialog(null, "����������");
				}
			}
			
		});
		
		
	}
	public static void main(String[] args) {
		PasswordDemo se=new PasswordDemo();
		se.setSize(200,150);
		se.setTitle("aaaaaaaa");
		se.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		se.setVisible(true);
		se.setLocationRelativeTo(null);

	}

}
