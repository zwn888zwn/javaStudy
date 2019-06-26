package BLUE;

import java.util.Scanner;

public class ´«Ö½Ìõ {
	static int[][] valids;
	static int count=0;
	public static void main(String[] args) {
		int m,n;
		Scanner scan=new Scanner(System.in);
		m=scan.nextInt();
		n=scan.nextInt();
		int[][] save=new int[m][n];
		int[][] saveClone=new int[m][n];
		valids=new int[m][n];
		for(int i=0;i<m;i++){
			for(int k=0;k<n;k++){
				int num=scan.nextInt();
				save[i][k]=num;
				saveClone[i][k]=num;
			}
		}
		int max1=findMax(save,valids);
		int max2=findMax(saveClone,valids);
		System.out.println(max1+max2);

		
	}
	public static int findMax(int[][] zu,int[][] valid ){
		int[][] jilu=new int[zu.length][zu[0].length];
		for(int i=0;i<zu.length;i++){
			for(int k=0;k<zu[0].length;k++){
				if(i==0&&k==0||valid[i][k]==-1){
					continue;
				}
				int left=0,up=0;
				if(i-1>=0&&valid[i-1][k]!=-1){
					up=zu[i-1][k]+zu[i][k];
				}
				if(k-1>=0&&valid[i][k-1]!=-1){
					left=zu[i][k-1]+zu[i][k];
				}
				if(left>up){
					zu[i][k]=left;
					jilu[i][k]=-1;
				}
				else{
					zu[i][k]=up;
					jilu[i][k]=1;
				}
					
			}
		}
		if(count==0){
		clear(jilu);
		count++;
		}
		return (zu[zu.length-1][zu[0].length-1]);
			
	}
	public static void clear(int[][] zu){
		int m=zu.length-1;
		int n=zu[0].length-1;
		int[][] valid=new int[zu.length][zu[0].length];
		while(true){
			if(m==0&&n==0){
				break;
			}
			if(zu[m][n]==-1){
				n=n-1;
				valid[m][n]=-1;
			}
			else{
				m=m-1;
				valid[m][n]=-1;
			}
		}
		valids=valid;
		valids[0][0]=0;
	}
}
