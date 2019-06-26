package $5;

import java.util.Scanner;

public class tanjiujuzheng {

	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("ENter SIZE:");
		int size=scan.nextInt();
		int[][] zu=new int[size][size];
		for(int i=0;i<zu.length;i++)
			for(int k=0;k<zu.length;k++)
				zu[i][k]=scan.nextInt();	
		checkColumn(zu);
		checkRow(zu);
		checkDia(zu);
		checkSubDia(zu);
	}
	public static void checkColumn(int[][] zu){
		boolean hasCol=false;
		for(int i=0;i<zu.length;i++){
			boolean columnSame=true;
			for(int k=0;k<zu.length;k++){
				if(zu[0][i]!=zu[k][i]){
					columnSame=false;
					break;
				}
			}
			if(columnSame){
				System.out.println("all "+zu[0][i]+" on column "+i);
				hasCol=true;
			}
		}
		if(!hasCol){
			System.out.println("NO SAME NUMBERS ON A COLUMN");
		}
	}
	public static void checkRow(int[][] zu){
		boolean hasCol=false;
		for(int i=0;i<zu.length;i++){
			boolean columnSame=true;
			for(int k=0;k<zu.length;k++){
				if(zu[i][0]!=zu[i][k]){
					columnSame=false;
					break;
				}
			}
			if(columnSame){
				System.out.println("all "+zu[i][0]+" on row "+i);
				hasCol=true;
			}
		}
		if(!hasCol){
			System.out.println("NO SAME NUMBERS ON A Row");
		}
	}
	public static void checkDia(int[][] zu){
		boolean columnSame=true;
		for(int i=0;i<zu.length;i++){
			if(zu[0][0]!=zu[i][i]){
				columnSame=false;
				break;
			}
		}
		if(columnSame){
			System.out.println("all same number "+zu[0][0] +" on major diagonal" );
		}
		else{
			System.out.println("NO SAME NUMBER ON MAJOR DIAGONAL");
		}
	}
	public static void checkSubDia(int[][] zu){
		boolean columnSame=true;
		for(int i=0;i<zu.length;i++){
			if(zu[0][zu.length-1]!=zu[i][zu.length-1-i]){
				columnSame=false;
				break;
			}
		}
		if(columnSame){
			System.out.println("all same number "+zu[0][0] +" on sub diagonal" );
		}
		else{
			System.out.println("NO SAME NUMBER ON sub DIAGONAL");
		}
	}

}
