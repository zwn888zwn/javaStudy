package day1;

import java.util.Scanner;

public class t4 {
	static int[] mark;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a,b,c;
		int n=scan.nextInt();
		int m=scan.nextInt();
		int[][] zu=new int[n][n];
		int[] save=new int[n];
		mark=new int[n];
		for(int i=0;i<zu.length;i++){
			for(int j=0;j<zu.length;j++){
				zu[i][j]=Integer.MAX_VALUE;
			}
		}
		for(int i=0;i<m;i++){
			a=scan.nextInt();
			b=scan.nextInt();
			c=scan.nextInt();
			zu[a-1][b-1]=c;
		}

		for(int i=0;i<save.length;i++){
				save[i]=Integer.MAX_VALUE;
		}
		dfs(0,0,zu,save);
		for(int i=1;i<save.length;i++)
			System.out.println(save[i]);

	}
	public static void dfs(int begin,int cost,int[][] zu,int[] save){
		for(int i=0;i<zu.length;i++){
			if(zu[begin][i]>2047483000||mark[begin]==-1)
				continue;
			mark[begin]=-1;
			if(save[i]>(zu[begin][i]+cost)){
				save[i]=zu[begin][i]+cost;
			}
			dfs(i,cost+zu[begin][i],zu,save);
		}
		
	}

}
