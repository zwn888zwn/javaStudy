package zy;

public class d1t {
	public static void main(String[] args) {
		double sum = 0, sum1 = 0;
		for (double i = 1; i <= 50000; i++) {
			sum += (1 / i);
		}

		for (double i = 50000; i >= 1; i--) {
			sum1 += (1 / i);
		}
		System.out.println("从左往右算的值是"+sum);
		System.out.println("从右往左算的值是"+sum1);
	}
}
