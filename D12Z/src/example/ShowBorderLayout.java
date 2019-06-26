package example;
import javax.swing.*;
import java.awt.*;
public class ShowBorderLayout extends JFrame{
	public ShowBorderLayout(){
		JPanel p1=new JPanel();
		p1.setLayout(new BorderLayout(5,5));
		p1.add(new JButton("east"),BorderLayout.EAST);
		p1.add(new JButton("west"),BorderLayout.WEST);
		p1.add(new JButton("south"),BorderLayout.SOUTH);
		p1.add(new JButton("center"),BorderLayout.CENTER);
		JPanel p2=new JPanel();
		p2.setLayout(new GridLayout(3,2,5,5));
		p2.add(new JLabel("First Name"));
		p2.add(new JTextField(8));
		p2.add(new JLabel("MI"));
		p2.add(new JTextField(1));
		p2.add(new JLabel("Last Name"));
		p2.add(new JTextField(8));
		p1.add(p2,BorderLayout.NORTH);
		add(p1);
	}
	public static void main(String[] args) {
		ShowBorderLayout frame =new ShowBorderLayout();
		frame.setTitle("가가가가가가가가가가가");
		frame.setSize(500,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
