package $5;

import java.util.Scanner;

public class DisplayCircle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int r=scan.nextInt();

		boolean[][] zu=new boolean[r*2][r*2];
		for(int y=0;y<r-1;y++){
			int x= r-(int)Math.sqrt(r*r-Math.pow((r-y), 2)) ;
			zu[x][y]=true;
			zu[2*r-x-1][y]=true;
			zu[x][2*r-y-1]=true;
			zu[2*r-x-1][2*r-y-1]=true;
		}
		for(int i=0;i<2*r;i++){
			for(int k=0;k<2*r;k++){
				if(zu[i][k])
					System.out.print("*");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
