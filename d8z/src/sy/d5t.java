package sy;

import java.util.Arrays;
import java.util.Scanner;

public class d5t {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("输入一个数");
		int a = s.nextInt();
		boolean[] zu = new boolean[a];
		Arrays.fill(zu, true);
		for (int i = 1; i <= a; i++) {
			for (int j = 2; j < i ; j++) {
				if (i % j == 0) {
					zu[i - 1] = false;
					break;
				}
			}
		}
		for (int j = 1; j < zu.length; j++)
			if (zu[j])
				System.out.print(j + 1 + " ");
	}
}