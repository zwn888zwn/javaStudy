package shangke;

public class juzheng1 {
	public static void main(String[] args) {
	 int[][] a={{1,2,3,4},
				{2,3,4,5},
				{3,4,5,6},
				{4,5,6,7},
				{5,6,7,8}};
	 int[][] b={{1,3,5},
				{2,4,6},
				{3,6,9},
				{4,8,2}};
		int[][] c=new int[a.length][b[0].length];
		int sum=0;
		for(int row=0;row<c.length;row++){
			for(int col=0;col<c[0].length ;col++){
				for(int k=0;k<4;k++){
				c[row][col]+=a[row][k]*b[k][col];
				}
			}
		}
		for(int x=0;x<c.length;x++){
			   for(int j=0;j<c[x].length;j++){
				   System.out.printf("%4d",c[x][j]);
			   }
			   System.out.println();
	}

}
}
