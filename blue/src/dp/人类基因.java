package dp;

import java.util.Scanner;

public class 人类基因 {

	public static void main(String[] args) {
		int[][] score={{5,-1,-2,-1,-3},{-1,5,-3,-2,-4},{-2,-3,5,-2,-2},{-1,-2,-2,5,-1},{-3,-4,-2,-1,0}};
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		String s2=scan.next();
		int [][]zu=new int[s1.length()+1][s2.length()+1];
		for(int i=1;i<s2.length();i++){
			zu[0][i]=zu[0][i-1]+score[4][getnum(s2,i-1)];
		}
		for(int i=1;i<s1.length();i++){
			zu[i][0]=zu[i-1][0]+score[getnum(s1,i-1)][4];
		}
		for(int i=1;i<=s1.length();i++){
			for(int k=1;k<=s2.length();k++){
				int sum1=zu[i-1][k-1]+score[getnum(s1, i-1)][getnum(s2, k-1)];
				int sum2=zu[i-1][k]+score[getnum(s1, i-1)][4];
				int sum3=zu[i][k-1]+score[4][getnum(s2, k-1)];
				zu[i][k]=Math.max(sum1, Math.max(sum2, sum3));	
			}
		}
		System.out.println(zu[zu.length-1][zu[0].length-1]);
	}
	public static int getnum(String s,int num){
		int nums=0;
		char c=s.charAt(num);
		switch(c){
		case 'A': nums=0;break;
		case 'C': nums=1;break;
		case 'G': nums=2;break;
		case 'T': nums=3;break;
		
		}
		return nums;
	}

}
