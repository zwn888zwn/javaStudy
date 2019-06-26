package shangke;

import java.util.Arrays;

public class textArraysFill {
	public static void main(String[] args) {
		boolean[] f=new boolean[10];
		System.out.println(Arrays.toString(f));
		Arrays.fill(f, true);
		System.out.println(Arrays.toString(f));

	}

}
