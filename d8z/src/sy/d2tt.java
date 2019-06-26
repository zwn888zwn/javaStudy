package sy;

import java.util.Scanner;
//读入一个整数N，输出杨辉三角形的前N行
public class d2tt {
	public static void main(String[] args) {
		int hang,row,col;
		System.out.println("输入N的值");
		Scanner s = new Scanner(System.in);
		hang = s.nextInt();
         int[][] yanghui=new int[hang][hang];
         for(row=0;row<yanghui.length;row++ ){
        	 yanghui[row][0]=1;
        	 yanghui[row][row]=1;
        	 for(col=1;col<=row-1;col++){
        		 yanghui[row][col]=yanghui[row-1][col]+yanghui[row-1][col-1];
        	 }
         }
        for(int i=0;i<yanghui.length;i++){
        	for(int k=0;k<=i;k++){
        		System.out.print(yanghui[i][k]+" ");
        	}
        	System.out.println();
        }
	}

}
