package BLUE;

import java.util.Scanner;

public class °Ú¶¯ÐòÁÐ {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int k=scan.nextInt();
		int[][] zu=new int[k][k];
		for(int i=0;i<k;i++){
			zu[i][0]=1;
			zu[i][1]=k-1;
		}
		int p=2;
		while(p<k){
		for(int i=1;i<k-1;i++){
			for(int j=i-1;j>=0;j--){
				if(zu[j][p-1]==0){
					continue;
				}
				for(int m=i+1;m<k;m++){
					zu[m][p]++;
				}
			}
			for(int j=i+1;j<k;j++){
				if(zu[j][p-1]==0){
					continue;
				}
				for(int m=i-1;m>=0;m--){
					zu[m][p]++;
				}
			}
			
			
		}
		p++;
		}
		int sum=k*(-1);
		for(int i=0;i<k;i++){
			for(int j=0;j<k;j++){
				sum+=zu[i][j];
			}
		}
		System.out.println(sum);
	}

}
