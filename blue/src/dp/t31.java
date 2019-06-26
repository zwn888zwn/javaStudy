package dp;

import java.util.Scanner;

public class t31 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int [][] zu=new int[2][m];
		for(int i=0;i<m;i++){
			zu[0][i]=scan.nextInt();
			zu[1][i]=scan.nextInt();
		}
		int[][] dp=new int[m+1][n+1];
		for(int i=1;i<=m;i++){
			for(int k=0;k<=n;k++){
				if(k-zu[0][i-1]>=0)
				dp[i][k]=Math.max(dp[i-1][k], dp[i-1][k-zu[0][i-1]]+zu[0][i-1]*zu[1][i-1]);
				else
				dp[i][k]=dp[i-1][k];
			}
		}
		System.out.println(dp[m][n]);

	}

}
