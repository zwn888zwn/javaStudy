package $5;

import java.util.Scanner;

public class juzhengX {

	public static void main(String[] args) {
		int h1,h2,l1,l2;
		double[][] d1,d2;
		Scanner s=new Scanner(System.in);
		System.out.println("请输入第一个矩阵的行数和列数");
		h1=s.nextInt();
		l1=s.nextInt();
		System.out.println("请输入第二个矩阵的行数和列数");
		h2=s.nextInt();
		l2=s.nextInt();
		if(l1!=h2){
			System.out.println("无法乘");
		}
	}
	public static void getZU(){
		
	}

}
