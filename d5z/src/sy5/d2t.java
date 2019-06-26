package sy5;

public class d2t {
	public static void main(String[] args) {
		int a , b ,c;
		System.out.println("¹«¼¦ " + "Ä¸¼¦ " + "Ð¡¼¦ ");
		for (a = 0; a <= 20; a++) {
			for (b = 0; b <= 34; b++) {
				for (c = 0; c <= 300; c++) {
					if (a + b + c != 100)
						continue;
					if (5 * a + 3 * b + c / 3 == 100)
						if (c % 3 == 0)
							System.out.println("  " + a + "  " + b + "   " + c);
				}

			}

		}
	}
}