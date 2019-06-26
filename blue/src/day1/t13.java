package day1;

import java.util.Scanner;

public class t13 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String[] zu=s.split(" ");
		int[] arr=new int[zu.length];
		for(int i=0;i<zu.length;i++)
			arr[i]=Integer.parseInt(zu[i]);
		int[] dp=new int[zu.length];
		dp[0]=1;
		int len=1;
	    for(int i=0; i<zu.length; i++){
	        dp[i] = 1;
	        for(int j=0; j<i; j++)
	            if(arr[j]>=arr[i] && dp[j]+1>dp[i])
	                dp[i] = dp[j] + 1;
	        if(dp[i]>len) len = dp[i];
	    }
		System.out.println(len);
	}

}
