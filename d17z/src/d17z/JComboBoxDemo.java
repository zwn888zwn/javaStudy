package d17z;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;



public class JComboBoxDemo extends JFrame{
	JComboBox jbx1;
	public JComboBoxDemo(){
		JPanel jp1=new JPanel();
		 jbx1=new JComboBox();
		jbx1.addItem("�Է�");
		jbx1.addItem("˯��");
		jbx1.addItem("����Ϸ");
	    jp1.add(new JLabel("��ϲ����ʲô:"));
	    jp1.add(jbx1);
	    jbx1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, jbx1.getSelectedItem());
			}
	    	
	    });
	    add(jp1);
		
	}
	public static void main(String[] args) {
		JComboBoxDemo se=new JComboBoxDemo();
		se.pack();
		se.setTitle("aaaaaaaa");
		se.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		se.setVisible(true);
		se.setLocationRelativeTo(null);

	}

}
