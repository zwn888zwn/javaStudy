package homework;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class kh16_6 extends JFrame{
	static int i=0;
	JLabel jl;
	kh16_6(){
	 jl=new JLabel();
		add(jl);
		this.addMouseListener(new MouseAdapter(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				super.mouseClicked(arg0);
				i++;
				if(i%2==0)
					jl.setText("Java is fun");
				else{
					jl.setText("Java is powerful");
				}
			}
			
		});
	}
	public static void main(String[] args) {
		kh16_6 se=new kh16_6();
		se.setSize(200,300);
		se.setTitle("aaaaaaaa");
		se.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		se.setVisible(true);
		se.setLocationRelativeTo(null);

	}

}
