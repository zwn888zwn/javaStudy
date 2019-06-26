package zy;

public class d3t {
	public static void main(String[] args) {
		double sum = 0;
		double i = 1, k = 211111,p=1;
		while (i <= k) {
			sum +=  (1.0/ (2 * i - 1) - 1 / (2 * i + 1));
			i+=2;
			p++;
			if (p % 10000 == 0)
				System.out.println("¦ÐµÄÖµ" + 4 * sum);
		}

	}

}
