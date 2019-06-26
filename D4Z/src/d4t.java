import java.util.Scanner;

public class d4t {
	public static void main(String[] args) {
		Scanner shu = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int a = shu.nextInt();
		System.out.print("Is " + a + " divisible by 5 and 6 ?");
		if (a % 5 == 0 && a % 6 == 0)
			System.out.println("ture");
		else
			System.out.println("false");
		System.out.print("Is " + a + " divisible by 5 or 6 ?");
		if (a % 5 == 0 || a % 6 == 0)
			System.out.println("ture");
		else
			System.out.println("false");
		System.out.print("Is " + a + " divisible by 5 or 6 ,but not both ?");
		if (a % 5 == 0 ^ a % 6 == 0)
			System.out.println("ture");
		else
			System.out.println("false");
	}

}
