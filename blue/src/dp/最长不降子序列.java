package dp;

import java.util.Scanner;

public class 最长不降子序列 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String[] zu=s.split(" ");
		int[] arr=new int[zu.length];
		for(int i=0;i<zu.length;i++)
			arr[i]=Integer.parseInt(zu[i]);
		int[] dp=new int[zu.length];
		dp[dp.length-1]=1;
		int max=0;
		for(int i=dp.length-2;i>=0;i--){
			boolean no=false;
			for(int k=i+1;k<dp.length;k++){
				if(arr[i]<arr[k]){
					no=true;
					dp[i]=Math.max(dp[k]+1, dp[i]);
					max=Math.max(max, dp[i]);
					}
					
			}
			if(!no)
				dp[i]=1;
			
		}
		System.out.println(max);

	}

}
