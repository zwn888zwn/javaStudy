package dp;

import java.util.Scanner;

public class ZOJ1227 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[][] candie=new int[n][4];
		for(int i=0;i<n;i++){
			candie[i][0]=scan.nextInt();
			candie[i][1]=scan.nextInt();
			candie[i][2]=scan.nextInt();
			candie[i][3]=scan.nextInt();
		}
		int[][][][] max=new int[n][n][n][n];
		
	}

}
