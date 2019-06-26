package BLUE;

import java.util.Scanner;

public class  Ø”Õ ’π∫µ›πÈ {
	static int max=0;
	static int k;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		k=scan.nextInt();
		int[][] data=new int[m][n];
		int[][] cunchu=new int[m-k+1][n-k+1];
		int[][] dian=new int[2][3];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				data[i][j]=scan.nextInt();
			}
		}
		getCunchu(data,k,cunchu);
		getMax(cunchu,dian,0);
		System.out.println(max);
	}
	public static void getCunchu(int[][] data,int k,int[][] cunchu){
		for(int i=0;i<cunchu.length;i++){
			for(int j=0;j<cunchu[0].length;j++){
				int sum=0;
				for(int x=i;x<i+k;x++){
					for(int y=j;y<j+k;y++){
						sum+=data[x][y];
					}
				}
				cunchu[i][j]=sum;
			}
		}
	}
	public static void getMax(int[][] cunchu,int[][] dian,int ceng){
		if(ceng==3){
			if(isValid(dian)){
				max=Math.max(max, calMax(cunchu,dian));
			}
			return;
		}
		for(int i=0;i<cunchu.length;i++){
			for(int j=0;j<cunchu[0].length;j++){
				dian[0][ceng]=i;
				dian[1][ceng]=j;
				getMax(cunchu,dian,ceng+1);
			}
		}	
	}
	private static int calMax(int[][] cunchu,int[][] dian) {
		return cunchu[dian[0][0]][dian[1][0]]+cunchu[dian[0][1]][dian[1][1]]+cunchu[dian[0][2]][dian[1][2]];
	}
	private static boolean isValid(int[][] dian) {
		if(Math.abs(dian[0][0]-dian[0][1])<k&&Math.abs(dian[1][0]-dian[1][1])<k){
			return false;
		}
		if(Math.abs(dian[0][0]-dian[0][2])<k&&Math.abs(dian[1][0]-dian[1][2])<k){
			return false;
		}
		if(Math.abs(dian[0][1]-dian[0][2])<k&&Math.abs(dian[1][1]-dian[1][2])<k){
			return false;
		}
		return true;
	}
	

}
