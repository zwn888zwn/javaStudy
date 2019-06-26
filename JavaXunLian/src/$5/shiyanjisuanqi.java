package $5;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class shiyanjisuanqi extends JFrame{
	JTextField jt1,jt2,jt3;
	JButton jb1,jb2,jb3,jb4;
	JPopupMenu jpop=new JPopupMenu();
	JMenu jm1=new JMenu("OPE");
	JMenu jm2=new JMenu("Exit");
	JMenuItem jmi1=new JMenuItem("ADD");
	JMenuItem jmi2=new JMenuItem("SUB");
	JMenuItem jmi3=new JMenuItem("MUT");
	JMenuItem jmi4=new JMenuItem("DIV");
	JMenuItem jmi5=new JMenuItem("Exit");
	public void show(java.awt.event.MouseEvent evt){
		if(evt.isPopupTrigger())
		jpop.show(evt.getComponent(), evt.getX(), evt.getY());
	}
	public String cau(int i){
		double a,b;
		double reu=0;
		a=Double.parseDouble(jt1.getText());
		b=Double.parseDouble(jt2.getText());
		switch(i){
		case 1:  reu=(double)a+b; break;
		case 2:  reu=(double)a-b; break;
		case 3:  reu=(double)a*b; break;
		case 4:  reu=(double)a/b;  break;
		}
		return String.valueOf(reu);
	}
	public shiyanjisuanqi(){
		
		JPanel jp1=new JPanel();
		jp1.add(new JLabel("num1"));
		jp1.add(jt1=new JTextField(3));
		jp1.add(new JLabel("num2"));
		jp1.add(jt2=new JTextField(3));
		jp1.add(new JLabel("result"));
		jp1.add(jt3=new JTextField(8));
		jt3.setEnabled(false);
		JPanel jp2=new JPanel();
		jp2.add(jb1=new JButton("ADD"));
		jp2.add(jb2=new JButton("SUB"));
		jp2.add(jb3=new JButton("MUD"));
		jp2.add(jb4=new JButton("DIV"));
		add(jp1,BorderLayout.NORTH);
		add(jp2,BorderLayout.SOUTH);
		jm1.add(jmi1);
		jm1.add(jmi2);
		jm1.add(jmi3);
		jm1.add(jmi4);
		jm2.add(jmi5);
		jpop.add(jm1);
		jpop.add(jm2);
		jb1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				jt3.setText(cau(1));
				
			}
			
		});
		jb2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				jt3.setText(cau(2));
				
			}
			
		});
		jb3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				jt3.setText(cau(3));
				
			}
			
		});
		jb4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				jt3.setText(cau(4));
				
			}
			
		});
		jmi1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				jt3.setText(cau(1));
				
			}
			
		});
		jmi2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				jt3.setText(cau(2));
				
			}
			
		});
		jmi3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				jt3.setText(cau(3));
				
			}
			
		});
		jmi4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				jt3.setText(cau(4));
				
			}
			
		});
		jmi5.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}
			
		});
		this.addMouseListener(new MouseAdapter(){

			@Override
			public void mousePressed(MouseEvent arg0) {
				show(arg0);
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				show(arg0);
			}
			
		});

		
		
	}
	public static void main(String[] args) {
		shiyanjisuanqi shiyan=new shiyanjisuanqi();
		shiyan.setVisible(true);
		shiyan.setDefaultCloseOperation(3);
		shiyan.pack();
		shiyan.setResizable(false);

	}

}
