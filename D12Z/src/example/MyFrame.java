package example;
import javax.swing.*;

import java.awt.*;
public class MyFrame extends JFrame {
	public MyFrame(){
		ImageIcon AAIcon=new ImageIcon("c:/138139139294.jpg");
		
		JPanel p1=new JPanel();
		JSplitPane p2=new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		JSplitPane jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		JScrollPane js=new JScrollPane();
		Font myFont=new Font("黑体",3,22);
		p2.setDividerLocation(150);
		p2.setTopComponent(new JTextArea());
		p2.setBottomComponent(new JTextArea());
		p2.setDividerSize(4);
		JTextArea ar =new JTextArea();
		ar.setBackground(new Color(0,0,255));
		ar.setForeground(Color.white);
		ar.setFont(myFont);
		jsp.setDividerLocation(150);
		jsp.setLeftComponent(js);
		jsp.setRightComponent(p2);
		p1.setLayout(new BorderLayout(4,3));
		jsp.setDividerSize(2);
		js.setViewportView(ar);
		p1.add(jsp,BorderLayout.CENTER);
		p1.add(new JLabel("点击次数是:0"),BorderLayout.SOUTH);
		JButton jb=new JButton(AAIcon);
		p1.add(jb,BorderLayout.NORTH);
		add(p1);
	}
	public static void main(String[] args) {
		MyFrame frame=new MyFrame();
		frame.setTitle("框架1");
		frame.setSize(400,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
