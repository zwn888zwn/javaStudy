import java.util.Scanner;

public class d3z {
	public static void main(String[] args) {
		Scanner shu = new Scanner(System.in);
		int a = (int) (Math.random() * 100 + 1);
		int b = (int) (Math.random() * 100 + 1);
		System.out.println("请输入" + a + "减" + b + "的差");
		int c = shu.nextInt();
		if (a - b == c)
			System.out.println("结果正确");
		else
			System.out.println("结果错误");

	}

}
