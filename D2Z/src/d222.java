import java.util.Scanner;

public class d222 {
	static Scanner hehe = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("请输入三个整数，每输一个数按一下回车");
		int a, b, c;
		a = hehe.nextInt();
		b = hehe.nextInt();
		c = hehe.nextInt();
		double d = (a + b + c) / 3.0;
		System.out.print("输出的结果是：" + d);

	}
}