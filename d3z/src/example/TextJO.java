package example;
import javax.swing.*;
public class TextJO {
	public static void main(String[] args) {
		String m1=JOptionPane.showInputDialog("����������");
		String m2=JOptionPane.showInputDialog("���ٴ���������");
		if(m1.equals(m2))
			JOptionPane.showMessageDialog(null, "�������óɹ�");
		else
			JOptionPane.showMessageDialog(null, "��������ʧ��","����",JOptionPane.WARNING_MESSAGE);
	}

}
