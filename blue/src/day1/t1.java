package day1;

import java.util.Scanner;

public class t1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[][] zu=new int[3][n];
		for(int i=0;i<n;i++){
			zu[0][i]=scan.nextInt();
		}
		paixu(zu);
		int m=scan.nextInt();
		for(int i=0;i<m;i++){
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();
			print(a,b,c,zu);
			
			
		}

	}
	public static void paixu(int[][] zu){
		int num=1;
		int max=-99999999;
		int p=0;
		while(p!=-1){
			p=-1;
			max=-99999999;
		for(int i=0;i<zu[0].length;i++){
			if(zu[2][i]==0&&zu[0][i]>max){
				max=zu[0][i];
				p=i;
			}
			
		}
		if(p!=-1){
		zu[1][p]=num;
		zu[2][p]=-1;
		num++;
		}
		}
		
	}
	public static void print(int a,int b,int c,int[][] zu){
		int p=-1;
		int max=-999999999;
		for(int i=a-1;i<b;i++){
			if(zu[0][i]>max){
				max=zu[0][i];
				p=zu[1][i];
			}
		}
		for(int i=a-1;i<b;i++){
			if(zu[1][i]==p+c-1){
				System.out.println(zu[0][i]);
				break;
			}
		}
		
	}

}
