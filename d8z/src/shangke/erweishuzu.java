package shangke;

public class erweishuzu {
	public static void main(String[] args) {
	   double[][] x=new double[5][7];
	   int[][] a=new int[5][];
	   a[0]=new int[5];
	   a[1]=new int[2];
	   a[2]=new int[3];
	   a[3]=new int[4];
	   a[4]=new int[8];
	   for(int k=0;k<a.length;k++){
		   for(int j=0;j<a[k].length;j++){
			   System.out.print(a[k][j]);
		   }
		   System.out.println();
	   }
	}

}
