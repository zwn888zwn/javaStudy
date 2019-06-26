package sy5;

public class d1tt {
	public static void main(String[] args) {
		int i, j = 0;
		for (i = 100; i <= 200; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}
				if (j > i / 2) {
					System.out.print(i + " ");
					break;
				}

			}

		}

	}

}
