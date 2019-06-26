package example;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.*;

public class TextFieldDemo extends JFrame implements ActionListener {
	JTextField input =new JTextField(10);
	JTextArea display=new JTextArea(8,10);
	JScrollPane pane=new JScrollPane(display);
	public TextFieldDemo(){
		this.add(input,BorderLayout.NORTH);
		this.add(pane,BorderLayout.CENTER);
		input.requestFocus();
		display.setLineWrap(true);
		input.addActionListener(this);
	}
	public static void main(String[] args) {
		TextFieldDemo se=new TextFieldDemo();
		se.pack();
		se.setTitle("aaaaaaaa");
		se.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		se.setVisible(true);
		se.setLocationRelativeTo(null);
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		display.append(input.getText());
		display.append("\r\n");
		input.selectAll();
		
	}

}
