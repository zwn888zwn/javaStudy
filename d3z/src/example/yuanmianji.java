package example;

import javax.swing.JOptionPane;

public class yuanmianji {
	public static void main(String[] args) {
		String s1=JOptionPane.showInputDialog("输入圆的半径");
		double r=Double.parseDouble(s1);
		double s=(int)Math.round(r*r*Math.PI*100)/100.0;
		
		JOptionPane.showMessageDialog(null, "圆的面积为"+s);
	}

}
