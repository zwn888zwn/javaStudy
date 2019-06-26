package day1;

import java.util.Scanner;

public class t3 {
	static int num=0;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int k=scan.nextInt();
		int l=scan.nextInt();
		int[][] dp=new int[5][5];
		int sum=0;
		for(int i = 0; i<k; i++)  
	        dp[1][i] = 1;  
	    for(int i = 2; i<=l; i++)  
	        for(int j = 0; j<k; j++)  
	            for(int x = 0; x<k; x++)  
	                if(x!=j-1&&x!=j+1)//根据题意，本位的数字与前面的数字是不能相邻的  
	                {  
	                    dp[i][j]+=dp[i-1][x];  
	                    dp[i][j]%=1000000007;  
	                }  
	    for(int i = 1; i<k; i++)  
	    {  
	        sum+=dp[l][i];  
	        sum%=1000000007;  
	    }  
	    System.out.println(sum);

	}
	
}
