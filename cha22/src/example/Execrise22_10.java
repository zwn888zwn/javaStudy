package example;


import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.*;


public class Execrise22_10 extends JFrame implements ActionListener{
	static List guanjian= Arrays.asList("public","static");
	static BufferedReader br=null;
	static int  count=0;
	static ArrayList<String> al;
	JButton bt=null;
	JButton bt1=null;
	JFileChooser jfile=new JFileChooser() ;
	static File file=null;
	public Execrise22_10(){
		this.setLayout(new FlowLayout());
		bt=new JButton("选择");
		bt1=new JButton("输出");
		bt.addActionListener(this);
		bt1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				FileWriter bw = null;
				jfile.showSaveDialog(new JPanel());
				File file=jfile.getSelectedFile();
				try{
					 bw=new FileWriter(file);
					for(String s:al){
						bw.write(s+"<br>");
					}
				}catch(IOException e){
					e.printStackTrace();
				}finally{
					if(bw!=null){
						try{
							bw.close();
							JOptionPane.showMessageDialog(null, "保存成功");
						}catch(IOException e){
							throw new RuntimeException(e);
						}
					}
				}

				
			}
			
		});
		add(bt);
		add(bt1);
	}
	public static boolean check(String s){
		for(int i=0;i<guanjian.size();i++){
			if(s.equals(guanjian.get(i))){
				return true;
			}
		}return false;
	}
	public static void main(String[] args)  {
	
		Execrise22_10 ex=new Execrise22_10();
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
				al.add(checkZhushi(s));
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, "转换成功");
	}
	  public static String checkZhushi(String s){
			StringBuffer bf=new StringBuffer(s);
			int h1=0,h2=0;
			for(int i=0;i<bf.length();i++){
				if(bf.charAt(i)=='/'){
					if((bf.length()-(i+1)>0)&&bf.charAt(i+1)=='/'){
						bf.replace(i, bf.length(), "<font color=\"green\">"+bf.substring(i)+"</font>");
						return bf.toString();
					}
				}
				if((i==bf.length()-1)&&(bf.charAt(i)>=97&&bf.charAt(i)<=122)){
					h2=i;
				}
				if(bf.charAt(i)=='\"'){
					int a=i;
					int b=bf.indexOf("\"",i+1)+1;
					bf.replace(a, b, "<font color=\"blue\">"+bf.substring(a,b)+"</font>");
					i+=26;
				}
				if(isZiFu(bf.charAt(i))){
					if((bf.length()-(i+1)>0)&&bf.charAt(i+1)>=97&&bf.charAt(i+1)<=122){
					h1=i+1;
					}
				}
				if(bf.charAt(i)>=97&&bf.charAt(i)<=122){
					if((bf.length()-(i+1)>0)&&isZiFu(bf.charAt(i+1))){
					h2=i+1;
					}
				}
				if((h1<h2)&&check(bf.substring(h1,h2))){
					bf.replace(h1, h2, "<font color=\"red\">"+bf.substring(h1,h2)+"</font>");
					h1=h2+25;
					i+=25;
				}
			}
			return bf.toString();
			
			
		}public static boolean isZiFu(char c){
			boolean f=false;
			switch(c){
			case ' ' :;
			case '	' :;
			case ')' :;
			case '=' : f=true ;break;
			}
				
			return f;
		}
	}

