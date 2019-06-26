package BLUE;

import java.util.ArrayList;
import java.util.Scanner;

public class 传纸条动态规划 {
	static ArrayList al=new ArrayList();
	public static void main(String[] args) {
		int[][][] zu=new int[100][100][100];
		int m,n;
		Scanner scan=new Scanner(System.in);
		m=scan.nextInt();
		n=scan.nextInt();
		int[][] save=new int[m][n];
		for(int i=0;i<m;i++){
			for(int k=0;k<n;k++){
				int num=scan.nextInt();
				save[i][k]=num;
			}
		}
		changeTo(save);
		findMax(al,zu,m);
		System.out.println(zu[m+n-3][0][1]);
	}
	public static void changeTo(int[][] zu){
		for(int i=1;i<zu.length;i++){
			al.add(new ArrayList());
			int m=0;
			for(int k=i;k>=0;k--){
				if(m>=zu[0].length){
					break;
				}
				((ArrayList) al.get(i-1)).add(zu[k][m]);
				m++;
			}
		}
		for(int i=1;i<zu[0].length;i++){
			al.add(new ArrayList());
			int m=zu.length-1;
			for(int k=i;k<zu[0].length;k++){
				if(m<0){
					break;
				}
				((ArrayList) al.get(al.size()-1)).add(zu[m--][k]);
			}
		}
		ArrayList aa=new ArrayList();
		aa.add(0);
		al.add(0, aa);
		//System.out.println(al);
	}
	public static void findMax(ArrayList<ArrayList<Integer>> al,int[][][] valid,int x ){
		for(int i=0;i<al.size()-1;i++){
			for(int j=0;j<al.get(i).size();j++){
				for(int k=0;k<al.get(i).size();k++){
					if(j==k)
						continue;
					int max=0;
					if(i<x){
						if(i-1>=0){
						max=Math.max(max, valid[i-1][j][k]);
						if(j-1>=0&&j-1!=k)
							max=Math.max(max, valid[i-1][j-1][k]);
						if(k-1>=0&&j!=k-1)
							max=Math.max(max, valid[i-1][j][k-1]);
						if(j-1>=0&&k-1>=0)
							max=Math.max(max, valid[i-1][j-1][k-1]);
						}
						valid[i][j][k]=max+al.get(i).get(j)+al.get(i).get(k);
						valid[i][k][j]=valid[i][j][k];
					}
					else{
						if(i-1>=0){
							max=Math.max(max, valid[i-1][j][k]);
							if(j+1!=k)
								max=Math.max(max, valid[i-1][j+1][k]);
							if(j!=k+1)
								max=Math.max(max, valid[i-1][j][k+1]);
								max=Math.max(max, valid[i-1][j+1][k+1]);
							}
							valid[i][j][k]=max+al.get(i).get(j)+al.get(i).get(k);
							valid[i][k][j]=valid[i][j][k];
					}
					
				}
			}

			
		}
	}

}
