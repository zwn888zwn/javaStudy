package sy;

import java.util.Arrays;
//����0-9֮���100���������������ʾÿһ�������ֵĴ���
public class d1t {
	public static void main(String[] args) {
		int[] a = new int[10];
		int count;
		for (int i = 0; i <= 100; i++) {
			count = (int) (Math.random() * 10);
			a[count]++;
		}
		System.out.println("�����ĳ��ִ���");
		for (int k = 0; k <10; k++)
			System.out.println("  " + k+"������ "+a[k]+"��");
		//System.out.println();
		//System.out.println(Arrays.toString(a));
	}

}
