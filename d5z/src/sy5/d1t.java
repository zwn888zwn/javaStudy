package sy5;

public class d1t {
	public static void main(String[] args) {
		int i, m = 0;
		for (i = 100; i <= 200; i++) {
			boolean f = true;
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					f = false;
					break;
				}
			}
			if (f) {
				System.out.print(i + " ");
				m++;
				if (m % 10 == 0)
					System.out.println();
			}

		}

	}
}
