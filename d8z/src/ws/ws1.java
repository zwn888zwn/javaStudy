package ws;

public class ws1 {
	public static void main(String[] args) {
		int[] a = { 5, 2, 5, 6, 6, 1 };
		int[] b = { 5, 5, 5, 6, 6, 1 };
		boolean f = false;
		for (int i = 0; i < a.length; i++) {
			for (int k = i + 1; k < a.length; k++) {
				int x;
				if (a[i] > a[k]) {
					x = a[k];
					a[k] = a[i];
					a[i] = x;
				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int k = i + 1; k < b.length; k++) {
				int x;
				if (b[i] > b[k]) {
					x = b[k];
					b[k] = b[i];
					b[i] = x;
				}
			}
		}
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					f = false;
				}

			}
		} else {
			f = false;
		}
		System.out.println("两个数组元素相同吗？"+f);

	}

}
