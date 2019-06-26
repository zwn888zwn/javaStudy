package skfor;

import java.util.Scanner;

public class xt1 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		double a;
		while(true){
			System.out.print("输入成绩  ");
			a=s.nextDouble();
			if(a==-10000)
				break;
			if(a>60)
				System.out.println("合格");
			else
				System.out.println("不合格");
		}
		System.out.print("结束");

	}

}
