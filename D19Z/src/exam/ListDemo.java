package exam;


import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.*;



public class ListDemo extends JFrame{
	JFileChooser jc=new JFileChooser();
	File file;
	JList jbx1;
	StringBuffer msg;
	JTextField text;
	JTextField text2;
	static DefaultListModel s1;
	JButton jb6;
	public ListDemo(){
		JPanel up=new JPanel();
		 s1=new DefaultListModel();
		text=new JTextField(3);
		text2=new JTextField(5);
		JPanel jp2=new JPanel();
		JButton jb1=new JButton("添加");
		JButton jb2=new JButton("删除");
		JButton jb3=new JButton("修改");
		JButton jb4=new JButton("关闭");
		JButton jb5=new JButton("选择文件");
		jb6=new JButton("保存文件");
		jb1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(!new String(text.getText()).equals("")&&!new String(text2.getText()).equals("")){
					s1.addElement(text.getText()+"  "+text2.getText());
					text2.setText("");
				}
			}
			
		});
		jb2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				s1.removeElement(jbx1.getSelectedValue());
				
			}
			
		});
		jb3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!new String(text.getText()).equals("")&&!new String(text2.getText()).equals("")){
					s1.setElementAt((text.getText()+"  "+text2.getText()), jbx1.getSelectedIndex());
				}
				
			}
			
		});
		jb4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				int i=JOptionPane.showConfirmDialog(null, "是否关闭？","选项",JOptionPane.YES_NO_CANCEL_OPTION);
				if(i==JOptionPane.YES_OPTION){
					System.exit(0);
				}
				
			}
			
		});
		jb5.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				jc.showOpenDialog(null);
				 file=jc.getSelectedFile();
				if(file!=null)
				 jb6.setEnabled(true);
				
			}
			
		});
		jb6.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				boolean b=savaFile(file);
				if(b)
					JOptionPane.showMessageDialog(null, "文件保存成功");
				else
					JOptionPane.showMessageDialog(null, "文件保存失败");
			}
			
		});
		up.add(new JLabel("学号:"));
		up.add(text);
		up.add(new JLabel("姓名:"));
		up.add(text2);
		up.add(jb1);
		up.add(jb3);
		 jp2.add(jb2);
		 
		 jp2.add(jb5);
		 jp2.add(jb6);
		 jp2.add(jb4);
		 jb6.setEnabled(false);
		 jbx1=new JList(s1);
		 jbx1.setSelectionMode(2);
		 
		 		
	    add(up,BorderLayout.NORTH);
	    add(jp2,BorderLayout.SOUTH);
	    JScrollPane jp1=new JScrollPane(jbx1);				  
	    add(jp1);
		
	}
	public static void main(String[] args) {
		ListDemo se=new ListDemo();
		se.setResizable(false);
		se.setSize(400,200);
		se.setTitle("aaaaaaaa");
		se.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		se.setVisible(true);
		se.setLocationRelativeTo(null);

	}
	public static boolean savaFile(File file){
		PrintWriter pw = null;
		try{
			pw=new PrintWriter(file);
			for( Object s:s1.toArray()){
				pw.println(s.toString());
			}
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			pw.close();
		}
	}

}
