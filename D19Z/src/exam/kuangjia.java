package exam;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
public class kuangjia extends JFrame{
	int num=0;
	int score=0;
	String ANSWER;
	JLabel Jtihao;
	JTextArea Jtimu;
	ArrayList<String> alltimu;
	Vector<String> correctAnswer=new Vector<String>();
	Vector<String> userAnswers=new Vector<String>();
	JCheckBox AnswerA=new JCheckBox("JCheckBox");
	JCheckBox AnswerB=new JCheckBox("JCheckBox");
	JCheckBox AnswerC=new JCheckBox("JCheckBox");
	JCheckBox AnswerD=new JCheckBox("JCheckBox");
	JButton jb1=new JButton("下一题");
	JButton jb2=new JButton("交卷");
	public kuangjia(){
		ReadTiMu readtimu=new ReadTiMu();
		alltimu=readtimu.getAllTimu();
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		JPanel jp3=new JPanel();
		jp1.setLayout(new BorderLayout());
		jp2.setLayout(new GridLayout(4,1));
		Jtihao=new JLabel();
		Jtimu=new JTextArea(5,5);
		setAllString(num,alltimu);
		//timu.setEnabled(false);
		jp1.add(Jtihao,BorderLayout.NORTH);
		jp1.add(Jtimu,BorderLayout.CENTER);
		jp2.add(AnswerA);
		jp2.add(AnswerB);
		jp2.add(AnswerC);
		jp2.add(AnswerD);
		jp3.add(jb1);
		jp3.add(jb2);
		add(jp1,BorderLayout.NORTH);
		add(jp2,BorderLayout.CENTER);
		add(jp3,BorderLayout.SOUTH);
		jb1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(num<alltimu.size()-1){
				getUserNowAnswer();
				num++;
				setAllString(num,alltimu);
					if(num==alltimu.size()-1)
						jb1.setEnabled(false);
				}
				clearAllSelected();
			}	
		});
		jb2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				getUserNowAnswer();
				check(correctAnswer,userAnswers);
				JOptionPane.showMessageDialog(null, "您的得分为"+score);
				jb2.setEnabled(false);
				test();
			}	
		});
	}
	
	
	public static void main(String[] args) {
		kuangjia kj=new kuangjia();
		kj.setTitle("答题测试");
		kj.setSize(400,280);
		kj.setResizable(false);
		kj.setLocationRelativeTo(null);
		kj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		kj.setVisible(true);
	}
	public void setAllString(int tihao,ArrayList<String> timu){
		String[] timuhuancun=timu.get(tihao).split("	");
		 ANSWER=timuhuancun[6];
			Jtihao.setText("第"+timuhuancun[0]+"题");
			Jtimu.setText(timuhuancun[1]);
			AnswerA.setText(timuhuancun[2]);
			AnswerB.setText(timuhuancun[3]);
			AnswerC.setText(timuhuancun[4]);
			AnswerD.setText(timuhuancun[5]);
			correctAnswer.add(ANSWER);
	}
	public void getUserNowAnswer(){
		String userAnswer="";
		if(AnswerA.isSelected())
			userAnswer+="A";
		if(AnswerB.isSelected())
			userAnswer+="B";
		if(AnswerC.isSelected())
			userAnswer+="C";
		if(AnswerD.isSelected())
			userAnswer+="D";
		userAnswers.add(userAnswer);
	}
	public void check(Vector<String> correctAnswer,Vector<String> userAnswers){
		for(int i=0;i<userAnswers.size();i++){
			if(userAnswers.get(i).length()==0||userAnswers.get(i).length()>correctAnswer.get(i).length())
				continue;
			else if(userAnswers.get(i).equals(correctAnswer.get(i))){
				score+=5;
			}else{
				if( check2fen(correctAnswer.get(i),userAnswers.get(i)))
					score+=2;
			}
		}
		
	}
	public boolean check2fen(String correct,String user){	
		int count=0;
		for(int i=0;i<user.length();i++){
			for(int j=0;j<correct.length();j++){
				if((user.charAt(i))==(correct.charAt(j))){
					count++;
					break;
				}
					
			}
		}
		if(count==user.length())
			return true;
		else
			return false;
	}
	public void clearAllSelected(){
		AnswerA.setSelected(false);
		AnswerB.setSelected(false);
		AnswerC.setSelected(false);
		AnswerD.setSelected(false);
	}
	public void test(){
		for(String s:correctAnswer)
			System.out.print(s+",");
		System.out.println();
		for(String s:userAnswers)
			System.out.print(s+",");
	}

}
