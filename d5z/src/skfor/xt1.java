package skfor;

import java.util.Scanner;

public class xt1 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		double a;
		while(true){
			System.out.print("����ɼ�  ");
			a=s.nextDouble();
			if(a==-10000)
				break;
			if(a>60)
				System.out.println("�ϸ�");
			else
				System.out.println("���ϸ�");
		}
		System.out.print("����");

	}

}
