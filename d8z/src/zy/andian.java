package zy;

public class andian {
	public static void main(String[] args) {
		int zu[][] = {
				{ 1, 2, 3, 4, 5 },// 7 9 6 5 7
				{ 2, 3, 4, 5, 6 }, 
				{ 3, 4, 5, 6, 7 },
				{ 5, 6, 7, 8, 9 },
				{ 1, 11, 6, 5, 8} };
		int maxrow = 0, maxcol = 0,  col = 0;
		for (int j = 0; j < zu.length; j++) {
			col = 0;maxrow = 0;maxcol = 0;
			for (int k = 0; k < zu.length; k++) {
				if (maxrow <= zu[j][k]){
					maxrow = zu[j][k];
				     col = k;
				}
			}
			for (int k = 0; k < zu.length; k++) {
				if (maxcol <= zu[k][col])
					maxcol = zu[k][col];

			}
			if (maxcol == maxrow)
				System.out.println("ÔÚ" + (j + 1) + "ÐÐ" + (col + 1) + "ÁÐ");

		}
	}

}
