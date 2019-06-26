package $5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Cacu extends JFrame{
	JTextField Jinvest,JYearRate,Jyear,Jfuture;
	JLabel lb1,lb2,lb3;
	JButton but=new JButton("计算");
	JMenuBar jmb;
	JMenu jm;
	JMenuItem jmi,jexit;
	public Cacu(){
		this.setJMenuBar(jmb=new JMenuBar() );
		jmb.add(jm=new JMenu("选项"));
		jm.add(jmi=new JMenuItem("计算"));
		jm.add(jexit=new JMenuItem("退出"));
		this.setLayout(new FlowLayout());
		add(lb1=new JLabel("金额"));
		add(Jinvest=new JTextField(5));
		add(lb2=new JLabel("年利率"));
		add(JYearRate=new JTextField(5));
		add(lb3=new JLabel("年数"));
		add(Jyear=new JTextField(5));
		add(but);
		Jfuture=new JTextField(10);
		Jfuture.setEditable(false);
		add(Jfuture);
		jexit.addActionListener((e) ->{
				System.exit(0);
			
		});
		but.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				double futureVa=Double.parseDouble(Jinvest.getText())* Math.pow((1.0+Double.parseDouble(JYearRate.getText())/12/100), Double.parseDouble(Jyear.getText())*12) ;
				int money=(int)(futureVa*10000);
				futureVa=money/10000.0;
				Jfuture.setText(futureVa+"");
			}
			
		});
		jmi.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				double futureVa= Double.parseDouble(Jinvest.getText())*Math.pow((1.0+Double.parseDouble(JYearRate.getText())/12), Double.parseDouble(Jyear.getText())*12) ;
				int money=(int)(futureVa*10000);
				futureVa=money/10000.0;
				Jfuture.setText(futureVa+"");
			}
			
		});
	}
	public static void main(String[] args) {
		Cacu ca=new Cacu();
		ca.pack();
		ca.setVisible(true);
		ca.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ca.setResizable(false);
		

	}

}
