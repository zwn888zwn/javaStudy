package BLUE;

import java.util.Scanner;

public class shuzisanjiao {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int ceng=scan.nextInt();
		int[][] zu=new int[ceng][ceng];
		for(int i=0;i<ceng;i++){
			for(int k=0;k<(i+1);k++){
				zu[i][k]=scan.nextInt();
			}
		}
		System.out.println(getmax(zu));
	}
	public static int getMax(int[][] zu,int ceng ,int num){
		if(ceng==zu.length)
			return 0;
		return Math.max(getMax(zu,ceng+1,num), getMax(zu,ceng+1,num+1))+zu[ceng][num];
	}
	public static int getmax(int[][] zu){
		for(int i=zu.length-1;i>0;i--){
			for(int k=0;k<i;k++){
				zu[i-1][k]=(Math.max(zu[i][k], zu[i][k+1])+zu[i-1][k]);
			}
		}
		return zu[0][0];
		
	}

}
