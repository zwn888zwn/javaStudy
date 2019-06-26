package skfor;
public class xt6 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2*i-1; k++) {
				System.out.print("*");
			}
			for (int t = 1; t <= 4-i; t++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 3; i >= 1; i--) {
			for (int j = 1; j <= 4-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
			}
			
		}
	}
