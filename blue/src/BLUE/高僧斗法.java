package BLUE;

import java.util.Scanner;

public class ¸ßÉ®¶··¨ {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[] zu=scan.nextLine().split(" ");
		int[] zu1=new int[Integer.parseInt(zu[zu.length-1])+1];
		for(int i=0;i<zu.length;i++){
			zu1[Integer.parseInt(zu[i])]=1;
		}
		for(int i=1;i<zu1.length-1;i++){
			if(zu1[i]!=1){
				continue;
			}
			for(int j=i+1;j<zu1.length;j++){
				if(zu1[j]==1){
					break;
				}
				zu1[i]=0;
				zu1[j]=1;
				if(fix(zu1)){
					System.out.println(i+" "+j);
				}
				zu1[i]=1;
				zu1[j]=0;
			}
		}

	}
	public static boolean fix(int[] zu1){
		for(int i=1;i<zu1.length-1;i++){
			if(zu1[i]!=1){
				continue;
			}
			for(int j=i+1;j<zu1.length;j++){
				if(zu1[j]==1){
					break;
				}
				zu1[i]=0;
				zu1[j]=1;
				if(fix(zu1)==false){
					return true;
				}
				zu1[i]=1;
				zu1[j]=0;

			}
		}
		
		return false;
		
	}

}
