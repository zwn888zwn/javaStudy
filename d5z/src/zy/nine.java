package zy;

public class nine {
	public static void main(String[] args) {
		int i = 1, a = 1;
		for (; a <= i;) {
			System.out.print(i + "*" + a + "=" + (a * i) + " ");
			if (a == i) {
				System.out.println();
				a = 0;
				i++;
			}

			if (i > 9)
				break;
			a++;
		}

	}

}
