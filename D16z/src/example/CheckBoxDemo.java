package example;


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class CheckBoxDemo extends JFrame {
	JCheckBox jb1,jb2,jb3,jb4;
	JPasswordField pass2;
	JRadioButton jrb1,jrb2;
	CheckBoxDemo(){
		setLayout(new GridLayout(0,1));
		jb1=new JCheckBox("dnf");
		jb2=new JCheckBox("CF");
		jb3=new JCheckBox("LOL");
		jb4=new JCheckBox("DOTA2",true);
		jrb1=new JRadioButton("男",true);
		jrb2=new JRadioButton("女");
		ButtonGroup group=new ButtonGroup();
		group.add(jrb1);
		group.add(jrb2);
		JPanel jp2=new JPanel();
		JButton bt1=new JButton("确定");
		JPanel jp1=new JPanel();
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jb4);
		jp2.add(new JLabel("性别："));
		jp2.add(jrb1);
		jp2.add(jrb2);
		add(jp1);
		add(jp2);
		add(bt1);
		bt1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String hobby="爱好有：";
				if(jb1.isSelected())
					hobby+=jb1.getText()+";";
				if(jb2.isSelected())
					hobby+=jb2.getText()+";";
				if(jb3.isSelected())
					hobby+=jb3.getText()+";";
				if(jb4.isSelected())
					hobby+=jb4.getText()+";";
				hobby+="\r\n";
				if(jrb1.isSelected())
					hobby+="性别： 男";
				if(jrb2.isSelected())
					hobby+="性别： 女";
				JOptionPane.showMessageDialog(null, hobby);
			
			
		}});
		
		
	}
	public static void main(String[] args) {
		CheckBoxDemo se=new CheckBoxDemo();
		se.pack();
		se.setTitle("aaaaaaaa");
		se.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		se.setVisible(true);
		se.setLocationRelativeTo(null);

	}

}
