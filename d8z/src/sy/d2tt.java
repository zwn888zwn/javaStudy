package sy;

import java.util.Scanner;
//����һ������N�������������ε�ǰN��
public class d2tt {
	public static void main(String[] args) {
		int hang,row,col;
		System.out.println("����N��ֵ");
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
