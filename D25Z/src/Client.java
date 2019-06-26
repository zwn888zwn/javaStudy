

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.*;
public class Client extends JFrame {
	private JTextField jtf = new JTextField();
	private JTextArea jta = new JTextArea();
	double r;
	DataInputStream in;
	DataOutputStream out;
	public Client() {
		this.add(jta);
		jta.setEditable(false);
		JPanel p0 = new JPanel();
		p0.setLayout(new BorderLayout());
		p0.add(new JLabel("输入半径："), BorderLayout.WEST);
		p0.add(jtf, BorderLayout.CENTER);
		jtf.setHorizontalAlignment(JTextField.RIGHT);
		jtf.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				r=Double.parseDouble(jtf.getText().trim());
				try{
				out.writeDouble(r);
				double area=in.readDouble();
				jta.append("半径是 "+r);
				jta.append("面积是 "+area+"\r\n");
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
			
		});
		this.add(p0, BorderLayout.SOUTH);
		
		this.setTitle("客户端");
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		try {
			Socket socket=new Socket("127.0.0.1",5555);
			in=new DataInputStream(socket.getInputStream());
			 out=new DataOutputStream(socket.getOutputStream());
			
	
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Client();

	}

}
