package BLUE;

import java.util.Scanner;

public class Lift_and_Throw {
	static int[][] man;
	static int[] stat;
	static int[] move;
	static int[] hold;
	static int max=0;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		man=new int[3][4];
		stat=new int[3];
		move=new int[3];
		hold=new int[3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				man[i][j]=scan.nextInt();
			}
			stat[i]=1;  //stat 状态 1移动2扔3不能举和移动  
		}
		dfs(0);
		System.out.println(max);

	}
/*	9 3 3
	4 3 1
	2 3 3*/
	public static void dfs(int ceng){
		if(!(stat[0]==3&&stat[1]==3&&stat[2]==3)){
		max=Math.max(max, Math.max(man[0][0]+man[0][stat[0]], Math.max(man[1][0]+man[1][stat[1]], man[2][0]+man[2][stat[2]])));
		int a=man[0][stat[0]];
		int b=man[1][stat[1]];
		int c=man[2][stat[2]];
		for(int i=a*-1;i<=a;i++){
			for(int j=b*-1;j<=b;j++){
				for(int k=c*-1;k<=c;k++){
					if(i==0&&j==0&&k==0)
						continue;
					if(stat[0]==2&&stat[1]==2){
						if(i==0){
							int temp=man[0][0];
							man[0][0]=man[0][0]+j;
							if(move[0]==0)
								stat[0]=1;
							dfs(ceng+1);
							stat[0]=2;
							man[0][0]=temp;
						}
						if(j==0){
							int temp=man[1][0];
							man[1][0]=man[1][0]+i;
							if(move[1]==0)
								stat[1]=1;
							dfs(ceng+1);
							stat[1]=2;
							man[1][0]=temp;
						}
					}
					if(stat[0]==2&&stat[2]==2){
						if(i==0){
							int temp=man[0][0];
							man[0][0]=man[0][0]+k;
							if(move[0]==0)
								stat[0]=1;
							dfs(ceng+1);
							stat[0]=2;
							man[0][0]=temp;
						}
						if(k==0){
							int temp=man[2][0];
							man[2][0]=man[2][0]+i;
							if(move[2]==0)
								stat[2]=1;
							dfs(ceng+1);
							stat[2]=2;
							man[2][0]=temp;
						}
					}
					if(stat[2]==2&&stat[1]==2){
						if(k==0){
							int temp=man[2][0];
							man[0][0]=man[2][0]+j;
							if(move[2]==0)
								stat[2]=1;
							dfs(ceng+1);
								stat[2]=2;
							man[2][0]=temp;
						}
						if(j==0){
							int temp=man[1][0];
							man[1][0]=man[1][0]+k;
							if(move[1]==0)
								stat[1]=1;
							dfs(ceng+1);
							stat[1]=1;
							man[1][0]=temp;
						}
					}
					if(i!=0){
						if(stat[0]==1)
							move[0]=1;
						stat[0]=3;
						if(stat[0]==2&&move[0]==0&&(stat[1]!=2||stat[2]!=2))
							stat[0]=1;
					}
					if(j!=0){
						if(stat[1]==1)
							move[1]=1;
						stat[1]=3;
						if(stat[1]==2&&move[1]==0&&(stat[0]!=2||stat[2]!=2))
							stat[1]=1;
					}
					if(k!=0){
						if(stat[2]==1)
							move[2]=1;
						stat[2]=3;
						if(stat[2]==2&&move[2]==0&&(stat[1]!=2||stat[0]!=2))
							stat[2]=1;
					}
					
					if(Math.abs(man[0][0]+i-j-man[1][0])<=1&&!(hold[0]==1&&hold[1]==1)){
						int p=man[0][0];
						int st1=stat[1];
						int st2=stat[0];
						if(hold[1]==0){
						man[0][0]=man[1][0];
						stat[1]=3;
						stat[0]=2;
						hold[1]=1;
						dfs(ceng+1);
						hold[1]=0;
						man[0][0]=p;
						stat[1]=st1;
						stat[0]=st2;
						}
						if(hold[0]==0){
						int p1=man[1][0];
						man[1][0]=man[0][0];
						stat[1]=2;
						stat[0]=3;
						hold[0]=1;
						dfs(ceng+1);
						hold[0]=0;
						man[0][0]=p1;
						stat[1]=st2;
						stat[0]=st1;
						}
					}
					if(Math.abs(man[0][0]+i-k-man[2][0])<=1&&!(hold[0]==1&&hold[2]==1)){
						int p=man[0][0];
						int st1=stat[2];
						int st2=stat[0];
						if(hold[1]==0){
						man[0][0]=man[2][0];
						stat[2]=3;
						stat[0]=2;
						hold[1]=1;
						dfs(ceng+1);
						hold[1]=0;
						man[0][0]=p;
						stat[2]=st1;
						stat[0]=st2;
						}
						if(hold[0]==0){
						int p1=man[2][0];
						man[2][0]=man[0][0];
						stat[2]=2;
						stat[0]=3;
						hold[0]=1;
						dfs(ceng+1);
						hold[0]=0;
						man[0][0]=p1;
						stat[2]=st2;
						stat[0]=st1;
						}
					}
					if(Math.abs(man[1][0]+j-k-man[2][0])<=1&&!(hold[2]==1&&hold[1]==1)){
						int p=man[1][0];
						int st1=stat[2];
						int st2=stat[1];
						int p1=man[2][0];
						if(hold[2]==0){
						man[1][0]=man[2][0];
						stat[2]=3;
						stat[1]=2;
						hold[2]=1;
						dfs(ceng+1);
						hold[2]=0;
						man[1][0]=p;
						stat[2]=st1;
						stat[1]=st2;
						}
						if(hold[1]==0){
						man[2][0]=man[1][0];
						stat[2]=2;
						stat[1]=3;
						hold[1]=1;
						dfs(ceng+1);
						hold[1]=0;
						man[1][0]=p1;
						stat[2]=st2;
						stat[1]=st1;
						}
					}
					
				}
				
			}
		}
	}
	}
}
