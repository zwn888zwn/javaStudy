package example;
import javax.swing.*;

import java.awt.*;
public class Test2kexuejisuanqi extends JFrame{
	public Test2kexuejisuanqi(){
	this.setLayout(new BorderLayout(5,10));
	JPanel p1=new JPanel();
	p1.setLayout(new BorderLayout(5,7));
	JPanel p2=new JPanel();
	p2.setLayout(new GridLayout(1,3,7,7));
	p2.add(new JButton("BcakSpac"));
	p2.add(new JButton("CE"));
	p2.add(new JButton("C"));
	p1.add(new JTextField(),BorderLayout.NORTH);
	p1.add(p2,BorderLayout.CENTER);
	JPanel p3=new JPanel();
	p3.setLayout(new GridLayout(4,3,7,7));
	String[] s1={"1","2","3","/","sqrt","4","5","6","*","%","7","8","9","-","1/x","0","+/-",".","+","="};
	for(int i=0;i<20;i++){
		p3.add(new JButton(s1[i]));
	}

	p3.setLayout(new GridLayout(4,2,7,7));
	add(p1,BorderLayout.NORTH);
	//add(p3,BorderLayout.WEST);
	add(p3,BorderLayout.CENTER);
	}
	public static void main(String[] args){
		Test2kexuejisuanqi frame=new Test2kexuejisuanqi();
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setTitle("jisuanqi");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

	
}
