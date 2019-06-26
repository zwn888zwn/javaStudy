package example;


import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.*;


public class Execrise22_3 extends JFrame implements ActionListener{
	static List guanjian= Arrays.asList("public","static");
	static BufferedReader br=null;
	static int  count=0;
	static ArrayList<String> al;
	JButton bt=null;
	JFileChooser jfile=new JFileChooser() ;
	static File file=null;
	public Execrise22_3(){
		bt=new JButton("选择");
		bt.addActionListener(this);
		add(bt);
	}
	public static void check(String s){
		if(s.trim().length()<=2){
			return;
		}
		for(int i=0;i<guanjian.size();i++){
			if(s.equals(guanjian.get(i))){
				count++;
			}
		}
	}
	public static void main(String[] args)  {
	
		Execrise22_3 ex=new Execrise22_3();
		ex.setVisible(true);
		ex.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ex.setSize(400, 300);;
		
		

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		jfile.showOpenDialog(new JLabel());
		file=jfile.getSelectedFile();
		al=new ArrayList<String>();
		String s;
		try{
			br=new BufferedReader(new FileReader(file));
			while((s=br.readLine())!=null){
				String[] zu=s.split("[ \r\n\t(){}]");
				ArrayList<String> b = new ArrayList<String>(Arrays.asList(zu)) ;
				al.addAll(b);
			}
			for(String p:al){
				check(p);
			}
			System.out.println("关键字数量"+count);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
