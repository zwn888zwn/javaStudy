import java.util.Scanner;

public class d3z {
	public static void main(String[] args) {
		Scanner shu = new Scanner(System.in);
		int a = (int) (Math.random() * 100 + 1);
		int b = (int) (Math.random() * 100 + 1);
		System.out.println("������" + a + "��" + b + "�Ĳ�");
		int c = shu.nextInt();
		if (a - b == c)
			System.out.println("�����ȷ");
		else
			System.out.println("�������");

	}

}
