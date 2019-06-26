package example;

import java.util.*;

public class Execrise22_15 {
	List number = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
/*	static int[][] zu ={{8,3,1,2,9,6,5,7,4},
						{2,4,6,7,5,8,1,9,3},
						{5,7,9,4,1,3,2,8,6},
						{3,6,2,1,4,9,8,5,7},
						{7,8,4,5,3,2,9,6,1},
						{1,9,5,6,8,7,3,4,2},
						{6,5,7,9,2,1,4,3,8},
						{9,1,3,8,7,4,6,2,5},
						{4,2,8,3,6,5,7,9,1}};*/
	static int[][] zu ={{1,2,3,4,5,6,7,8,9},
						{1,2,3,4,5,6,7,8,9},
						{1,2,3,4,5,6,7,8,9},
						{1,2,3,4,5,6,7,8,9},
						{1,2,3,4,5,6,7,8,9},
						{1,2,3,4,5,6,7,8,9},
						{1,2,3,4,5,6,7,8,9},
						{1,2,3,4,5,6,7,8,9},
						{1,2,3,4,5,6,7,8,9}};
	//boolean[][] bzu = new boolean[9][9];

	public static void main(String[] args) {
		/*new Execrise22_15().print(zu);
		System.out.println(checkCollum(zu));
		System.out.println(checkNine(zu));
*/		new Execrise22_15().sort(zu, 0, 0);
	}//p控制行 k控制列
	public static void sort(int[][] zu,int k,int p){
		if(p==zu[0].length){
			//checkCollum(zu)&&checkNine(zu)
			if(CheckSudokuSolution.isValid(zu)){
				print(zu);
			}
			
			return;
		}
		if(k==zu[0].length){
			sort(zu,0,p+1);
		}
		for(int i=k;i<zu.length;i++){
			int temp=zu[p][i];
			zu[p][i]=zu[p][k];
			zu[p][k]=temp;
			sort(zu,k+1,p);
			 temp=zu[p][k];
				zu[p][k]=zu[p][i];
				zu[p][i]=temp;
		}
	}
	public static void print(int[][] zu) {
		for (int i = 0; i < 9; i++) {
			for (int k = 0; k < 9; k++) {

					System.out.print(zu[i][k] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
	}

	public static boolean checkCollum(int[][] zu) {
		HashSet hs = null;
		for(int x=0;x<9;x++){
			hs=new HashSet();
			for(int y=0;y<9;y++){
				hs.add(new Integer(zu[y][x]));
			}
			if(hs.size()!=9)
				return false;
			hs=null;
		}return true;
	}

	public static boolean checkNine(int[][] zu) {
		HashSet hs = null;
		int a = 0, b = 0, x = 3, y = 3;
		for (int j = 0; j < 9; j++) {
			hs=new HashSet();
			if(y>9){
				a+=3;
				x+=3;
				b=0;
				y=3;
			}
			for (int i = a; i < x; i++) {
				for (int k = b; k < y; k++) {
					hs.add(zu[i][k]);
				}
			}if(hs.size()!=9)
				return false;
			hs=null;
			y+=3;
			b+=3;
		}
		return true;
	}

}
