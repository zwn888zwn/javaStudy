package d17z;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;



public class ListDemo extends JFrame{
	JList jbx1;
	StringBuffer msg;
	JTextField text;
	DefaultListModel s1;
	public ListDemo(){
		 s1=new DefaultListModel();
		text=new JTextField(5);
		JPanel jp2=new JPanel();
		JButton jb1=new JButton("���");
		JButton jb2=new JButton("ɾ��");
		jb1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(!new String(text.getText()).equals(""))
				s1.addElement(text.getText());
			}
			
		});
		jb2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				s1.removeElement(jbx1.getSelectedValue());
				
			}
			
		});
		jp2.add(text);
		jp2.add(jb1);
		jp2.add(jb2);
		 
		 
		 s1.addElement("�Է�");
		 s1.addElement("˯��");
		 s1.addElement("����Ϸ");
		 jbx1=new JList(s1);
		 jbx1.setSelectionMode(2);
		 		
	    add(new JLabel("��ϲ����ʲô:"),BorderLayout.NORTH);
	    add(jp2,BorderLayout.SOUTH);
	    JScrollPane jp1=new JScrollPane(jbx1);				  
	    add(jp1);
		
	}
	public static void main(String[] args) {
		ListDemo se=new ListDemo();
		se.setResizable(false);
		se.pack();
		se.setTitle("aaaaaaaa");
		se.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		se.setVisible(true);
		se.setLocationRelativeTo(null);

	}

}
