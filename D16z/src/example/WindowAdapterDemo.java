package example;

import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class WindowAdapterDemo extends JFrame {
	JPanel jp1;
	public WindowAdapterDemo() {
		jp1=new JPanel();
		JButton bt2 = new JButton("确定");
		bt2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}});
		
		
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JButton bt1 = new JButton("ok");
		add(bt1);
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "This is ok");
			}
		});
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent arg0) {
				int i=JOptionPane.showConfirmDialog(null, "是否关闭？","选项",JOptionPane.YES_NO_CANCEL_OPTION);
				if(i==JOptionPane.YES_OPTION){
					System.exit(0);
				}
			}

			@Override
			public void windowOpened(WindowEvent arg0) {
				JOptionPane.showMessageDialog(null, "This is ok");
				
			}});

	}

	class BtListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "This is ok");
		}
	}

	public static void main(String[] args) {
		WindowAdapterDemo se = new WindowAdapterDemo();
		se.setSize(200, 100);
		se.setTitle("aaaaaaaa");
		se.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		se.setVisible(true);
		se.setLocationRelativeTo(null);

	}

}
