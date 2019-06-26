package example;
import javax.swing.*;
public class TextJO {
	public static void main(String[] args) {
		String m1=JOptionPane.showInputDialog("请输入密码");
		String m2=JOptionPane.showInputDialog("请再次输入密码");
		if(m1.equals(m2))
			JOptionPane.showMessageDialog(null, "密码设置成功");
		else
			JOptionPane.showMessageDialog(null, "密码设置失败","警告",JOptionPane.WARNING_MESSAGE);
	}

}
