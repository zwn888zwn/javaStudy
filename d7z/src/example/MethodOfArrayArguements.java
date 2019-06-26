package example;

import java.util.Arrays;

public class MethodOfArrayArguements {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		PrintArray(a);
		int[] b={1,2,3};
		PrintArray(b);

	}
	public static int max(int[] arr){
		Arrays.sort(arr);
	 return arr[arr.length-1];
	}

	public static void PrintArray(int[] arr) {
		int p = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			p++;
			if (p % 10 == 0)
				System.out.println();
		}
	}

}
