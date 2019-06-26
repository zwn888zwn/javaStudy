package day1;

import java.util.Scanner;

public class t17 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		String s=scan.next().trim();
		int[][] dp=new int[k+1][n+1];
		dp[0][1]=s.charAt(0)-'0';
		for(int i=1;i<n;i++){
			dp[0][i+1]=dp[0][i]*10+(s.charAt(i)-'0');
		}
		for(int i=1;i<=k;i++){ //乘号数
			for(int j=i+1;j<=n;j++){  //前J个数
				
				for(int o=i;o<j;o++){    //计算乘积
					int temp=0;
				for(int p=o;p<j;p++){
					temp=temp*10+(s.charAt(p)-'0');
				}
				dp[i][j]=Math.max(dp[i][j], dp[i-1][o]*temp);
				}
				
			}
			
		}
		System.out.println(dp[dp.length-1][dp[0].length-1]);

	}

}
