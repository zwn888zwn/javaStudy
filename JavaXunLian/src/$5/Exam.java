package $5;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.List;

import javax.swing.*;
public class Exam extends JFrame {
	
	static String CORRECTANSWER = null;
	static int SUM_SCORE = 0, SCORE = 0, COUNT_CORRECT = 0;
	static List<Character> useranswer = new ArrayList<Character>();;
	static int JUDGE=0;
	public static void main(String[] args)  throws Exception{
		new Exam();
		File file = new File("C:/Users/Administrator/Desktop/19��ϰ/questions.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try{
		fr = new FileReader(file);
		br = new BufferedReader(fr);
		String s = null;
		while ((s = br.readLine()) != null) {
			String[] a = s.split("\t");
			inti(a);//��ʼ��������
			while (jbt01.getActionCommand() != "����") {
				Thread.sleep(100);// Ҳ���Ե����������ȵĹ���
				//System.out.println("˯�ߡ����ȴ�����");//���Գ���||
				continue;
			}
		}
		}
		catch(Exception e){
			
		}
		finally{
		if(br!=null){
		try {
			br.close();
		} catch (IOException e) {
			System.out.println("�������ر�ʧ�ܣ�");
		}
		}
		try {
			fr.close();
		} catch (IOException e) {
			System.out.println("�ַ����ر�ʧ�ܣ�");
		}
		}

		jbt01.setEnabled(false);//�ر�"��һ�ⰴť�Ĳ���"
	
	}

private	static void inti(String[] a) {
		COUNT_CORRECT = 0;
		SCORE = 0;
		
		jbt01.setActionCommand("������");
		label.setText("��" + a[0] + "��");
		area.setText(a[1]);
		cb01.setText(a[2]);
		cb02.setText(a[3]);
		cb03.setText(a[4]);
		cb04.setText(a[5]);
		CORRECTANSWER = a[6];
	}

	public static void checkAnswer() {
		jbt01.setActionCommand("����");
		for (int i = 0; i < useranswer.size(); i++) {
			JUDGE=0;
			for (int j = 0; j <CORRECTANSWER.length(); j++) {
				if (CORRECTANSWER.charAt(j) == useranswer.get(i)){
					COUNT_CORRECT++;
				    JUDGE++;
				}
				
			}
			if(JUDGE==0)
				break;
			
		}
		
		 if (JUDGE!=0&&useranswer.size()<=CORRECTANSWER.length()&&COUNT_CORRECT == CORRECTANSWER.length()) {
			SCORE += 5;
			SUM_SCORE += 5;
		}

		 else if(JUDGE!=0&&COUNT_CORRECT >0 && COUNT_CORRECT<CORRECTANSWER.length()){
			System.out.println(JUDGE);
			 System.out.println(useranswer);
			System.out.println(CORRECTANSWER);
			 SCORE += 2;
			SUM_SCORE += 2;
		}
		JOptionPane.showMessageDialog(null, "����÷�:" + SCORE);
		JUDGE=0;
	}

	Exam() {
		super("ʵ��");
		setBounds(450, 200, 400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(5, 5));
		JPanel disPane = new JPanel();
		disPane.setLayout(new BorderLayout(5, 5));
		label = new JLabel();
		area = new JTextArea(9, 100);
		area.setLineWrap(true);// �Զ�����
		area.setEditable(false);// ֻ���ļ�
		disPane.add(label, BorderLayout.NORTH);
		disPane.add(area);
		contentPane.add(disPane, BorderLayout.NORTH);
		JPanel boxPane = new JPanel();
		boxPane.setLayout(new GridLayout(4, 1));
		cb01 = new JCheckBox();
		cb01.setActionCommand("A");
		cb01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cb01.isSelected()) {
					useranswer.add('A');
				} else {
					useranswer.remove('A');
				}
			}
		});
		cb02 = new JCheckBox();
		cb02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cb02.isSelected()) {
					useranswer.add('B');
				} else {
					
					useranswer.remove('B');
				}
			}
		});
		cb03 = new JCheckBox();
		
		cb03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cb03.isSelected()) {
					useranswer.add('C');
				} else {
					
					useranswer.remove('C');
				}
			}
		});
		cb04 = new JCheckBox();
		cb04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cb04.isSelected()) {
					useranswer.add('D');
				} else {
					useranswer.remove('D');
				}
			}
		});
		boxPane.add(cb01);
		boxPane.add(cb02);
		boxPane.add(cb03);
		boxPane.add(cb04);
		JPanel jbtPane = new JPanel();
		jbt01 = new JButton("��һ��");
		jbt01.setActionCommand("����");
		jbt01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cb01.setSelected(false);
				cb02.setSelected(false);
				cb03.setSelected(false);
				cb04.setSelected(false);
				checkAnswer();
				useranswer.clear();
				

			}
		});
		jbt02  = new JButton("�ύ");
		jbt02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jbt02.setEnabled(false);
				jbt01.setEnabled(false);
				JOptionPane.showMessageDialog(null, "���Խ���\n�ۼƵ÷�:" + SUM_SCORE+"\n20����Զ��˳�");
			    try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					System.out.println("�ж��쳣��");
				}
			    System.exit(0);
			}
		});
		jbtPane.add(jbt01);
		jbtPane.add(jbt02);
		JPanel pane = new JPanel();
		pane.setLayout(new BorderLayout(5, 5));
		pane.add(boxPane);
		pane.add(jbtPane, BorderLayout.SOUTH);
		contentPane.add(pane);
		setContentPane(contentPane);
	}
	
	private JButton jbt02=null;
	private static JButton jbt01 = null;
	private static JLabel label = null;
	private static JTextArea area = null;
	private static JCheckBox cb01 = null;
	private static JCheckBox cb02 = null;
	private static JCheckBox cb03 = null;
	private static JCheckBox cb04 = null;
	
}
