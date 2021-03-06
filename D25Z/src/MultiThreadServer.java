


import javax.swing.*;

import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.Date;

public class MultiThreadServer extends JFrame {
	private JTextArea jta = new JTextArea();

	public MultiThreadServer() {
		this.add(jta, BorderLayout.CENTER);
		jta.setEditable(false);
		this.setTitle("服务器");
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		ServerSocket server;
		try {
			server = new ServerSocket(5555);
			jta.append("Server start at"+new Date()+"\r\n");
			Socket socket=server.accept();
			while(true)
			new Thread(new HandleClient(socket)).start();
		
		
		

		
	}catch(Exception e){
		e.printStackTrace();
	}}
	class HandleClient implements Runnable{
		Socket socket;
		HandleClient(Socket socket){
			this.socket=socket;
		}
		@Override
		public void run() {
			try{
			DataInputStream in=new DataInputStream(socket.getInputStream());
			DataOutputStream out=new DataOutputStream(socket.getOutputStream());
			while(true){
			double r=in.readDouble();
			double area=r*r*Math.PI;
			jta.append("半径是 "+r);
			jta.append("面积是 "+area+"\r\n");
			out.writeDouble(area);
			out.flush();
			}}catch(Exception e){
				e.printStackTrace();
			}
		} 
			
		}
		
	
	public static void main(String[] args) {

		new MultiThreadServer();

	}

}
