import java.util.Scanner;

public class d1t {
	public static void main(String[] args) {
		int a, b, c;
		Scanner shu = new Scanner(System.in);
		System.out.println("请分别输入三个整数");
		a = shu.nextInt();
		b = shu.nextInt();
		c = shu.nextInt();
		if (a <= b) {
			if (b <= c) {
				System.out.println(a+"<"+b+"<"+c);
			} else if (a <= c) {
				System.out.println(a+"<"+c+"<"+b);
			} else {
				System.out.println(c+"<"+a+"<"+b);
			}
		} else if (b >= c) {
			System.out.println(c+"<"+b+"<"+a);
		} else if (a >= c) {
			System.out.println(b+"<"+c+"<"+a);

		} else {
			System.out.println(b+"<"+a+"<"+c);
		}
	}

}
