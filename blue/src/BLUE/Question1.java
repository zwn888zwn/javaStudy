package BLUE;

import java.util.Scanner;

import java.util.Vector;

public class Question1 {

	public static long count = 0;

	private void fullPermutation(Vector<Character> sourse,
			Vector<Character> result) {



		if (sourse.size() == 0) { //sourse.size() == 0

			for (int i = 0; i < result.size(); i++) {

				System.out.print(result.elementAt(i));

			}

			System.out.print("\n");

			count++;

			return;

		}

		for (int i = 0; i < sourse.size(); i++) {
			Vector<Character> tsourse = new Vector<Character>(sourse);

			Vector<Character> tresult = new Vector<Character>(result);

			tresult.add(sourse.elementAt(i));

			tsourse.remove(i);

			new Question1().fullPermutation(tsourse, tresult);
			//sourse.add(i, result.elementAt(result.size() - 1));

			//result.remove(result.size() - 1);

		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		Vector<Character> sourse = new Vector<Character>();

		Vector<Character> result = new Vector<Character>();

		for (int i = 0; i < n; i++) {

			sourse.add((char) ('A' + i));

		}

		new Question1().fullPermutation(sourse, result);

		System.out.println(Question1.count);
	}

}