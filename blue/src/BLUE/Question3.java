package BLUE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Question3 {

	public static long count = 0;

	public static List<Vector<Character>> filteredNonRedundantResults;

	private static boolean isfilter(Vector<Character> result) {

		int a = (result.elementAt(0) - '0') * 10 + (result.elementAt(1) - '0');

		int b = (result.elementAt(2) - '0') * 10 + (result.elementAt(3) - '0');

		int c = (result.elementAt(4) - '0') * 10 + (result.elementAt(5) - '0');

		int

		d = (result.elementAt(6) - '0') * 100 + (result.elementAt(7) - '0')
				* 10 + (result.elementAt(8) - '0');

		if (a * b == c * d) {

			return true;

		}

		return false;

	}

	public static void print(Vector<Character> vector) {

		System.out.printf("%c%c x %c%c = %c%c x %c%c%c", vector.elementAt(0),
				vector.elementAt(1), vector.elementAt(2), vector.elementAt(3),
				vector.elementAt(4), vector.elementAt(5), vector.elementAt(6),
				vector.elementAt(7), vector.elementAt(8));

	}

	private static void fullPermutation(Vector<Character> sourse,Vector<Character> result) {

		if (sourse.size() == 0 && isfilter(result)) {

			boolean exit = false;

			for (int i = 0; i < filteredNonRedundantResults.size(); i++) {

				int ra = (result.elementAt(0) - '0') * 10
						+ (result.elementAt(1) - '0');

				int rb = (result.elementAt(2) - '0') * 10
						+ (result.elementAt(3) - '0');

				int

				fa = (filteredNonRedundantResults.get(i).elementAt(0) - '0')
						* 10
						+ (filteredNonRedundantResults.get(i).elementAt(1) - '0');

				int

				fb = (filteredNonRedundantResults.get(i).elementAt(2) - '0')
						* 10
						+ (filteredNonRedundantResults.get(i).elementAt(3) - '0');

				if (ra == fb && rb == fa) {

					exit = true;

					break;

				}

			}

			if (exit == false) {

				filteredNonRedundantResults.add(new Vector<Character>(result));

			}
			return;

		}

		for (int i = 0; i < sourse.size(); i++) {

			result.add(sourse.elementAt(i));

			sourse.remove(i);

			fullPermutation(sourse, result);

			sourse.add(i, result.elementAt(result.size() - 1));

			result.remove(result.size() - 1);

		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = 9;

		Vector<Character> sourse = new Vector<Character>();

		Vector<Character> result = new Vector<Character>();

		for (int i = 1; i <= n; i++) {

			sourse.add((char) ('0' + i));

		}

		Question3.filteredNonRedundantResults = new ArrayList<Vector<Character>>();

		Question3.fullPermutation(sourse, result);

		for (int i = 0; i < Question3.filteredNonRedundantResults.size(); i++) {

			Question3.print(Question3.filteredNonRedundantResults.get(i));

			System.out.println();

		}

	}

}