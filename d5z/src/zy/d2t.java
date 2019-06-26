package zy;

public class d2t {
	public static void main(String[] args) {
		double a = 1, b = 3;
		double sum = 0;
		while (a <= 97 && b <= 99) {
			sum += (a / b);
			a += 2;
			b += 2;
		}
		System.out.println("计算结果为"+sum);
	}

}
