package example;
import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class GetMouseLoca extends JFrame{
	JLabel jl;
	class MouseLis extends MouseAdapter {
		
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				jl.setText("×ø±ê£ºX="+arg0.getX()+",Y="+arg0.getY());
				
				
			}

		}
	
	
	public GetMouseLoca(){
		JPanel jp=new JPanel();
		 jl=new JLabel("×ø±ê£º");
		 
		jp.addMouseListener(new MouseLis());
			
		
		add(jp,BorderLayout.CENTER);
		add(jl,BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		GetMouseLoca se=new GetMouseLoca();
		se.setSize(200,300);
		se.setTitle("aaaaaaaa");
		se.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		se.setVisible(true);
		se.setLocationRelativeTo(null);

	}

}
