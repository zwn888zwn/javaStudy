package sy5;

public class d4t {
	public static void main(String[] args) {
		System.out.println("   \t\t\t\t¾Å ¾Å ³Ë ·¨ ±í");
		for (int i = 1; i <= 9; i++)
			System.out.print("\t" + i);
		System.out.println();
		for (int k = 1; k <= 77; k++)
			System.out.print("-");
		System.out.println();
		for (int x = 1; x <= 9; x++) {
			System.out.print(x + "|\t");
			for (int y = 1; y <= 9; y++)
				System.out.print((x * y) + "\t");
			System.out.println();
		}
	}

}
