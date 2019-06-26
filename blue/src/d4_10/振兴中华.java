package d4_10;

public class ÕñĞËÖĞ»ª {

	public static void main(String[] args) {
		int[][] zu=new int[5][6];
		zu[0][1]=1;
		for(int i=1;i<=4;i++){
			for(int k=1;k<=5;k++){
				zu[i][k]=zu[i][k-1]+zu[i-1][k];
			}
		}
		System.out.println(zu[4][5]);
	}

}
