package $5;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class TM01 extends JFrame {
	Random r = new Random();
	JLabel label01 = new JLabel();
	JLabel label02 = new JLabel("+");
	JLabel label03 = new JLabel();
	JLabel label03_01 = new JLabel("=");
	JLabel label04 = new JLabel("--by ����ǿ");
	JPanel panel01 = new JPanel();
	JPanel panel02 = new JPanel();
	JPanel panel03 = new JPanel();
	JTextField jtd = new JTextField();

	public static void main(String[] args) {

		TM01 t=new TM01();

	}

	TM01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200, 250);
		setSize(150, 200);
		setVisible(true);
		setResizable(false);

		JButton jbt01 = new JButton("����");
		jbt01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label04.setText("������ϸ��Ŷ!");
				int num01 = r.nextInt(200);
				String s1 = Integer.toString(num01);
				label01.setText(s1);
				int num02 = r.nextInt(200);
				String s2 = Integer.toString(num02);
				label03.setText(s2);
			}
		});

		JButton jbt02 = new JButton("ȷ��");
		jbt02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					int num1 = Integer.parseInt(label01.getText());
					int num2 = Integer.parseInt(label03.getText());
					
					int num3 = Integer.parseInt(jtd.getText());
					if ((num1 + num2) == num3) {
						label04.setText("�ش���ȷ!����һ���!");
					} else {
						label04.setText("�ش����!");
					}
				
				}catch(java.lang.NumberFormatException e1){
					label04.setText("�𰸸�ʽ����ȷ!");
				}
			}
		});

		panel01.setLayout(new GridLayout(1, 5, 5, 5));
		panel01.add(label01);
		panel01.add(label02);
		panel01.add(label03);
		panel01.add(label03_01);
		panel01.add(jtd);

		panel02.setLayout(new FlowLayout());
		panel02.add(jbt01);
		panel02.add(jbt02);

		panel03.add(panel02, BorderLayout.NORTH);
		panel03.add(label04, BorderLayout.CENTER);

		add(panel01, BorderLayout.NORTH);
		add(panel03, BorderLayout.CENTER);

	}
}

