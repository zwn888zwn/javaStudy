package lab;

import java.util.Scanner;

public class sy1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("������һ���ļ�·��");
		String add=s.next();
		int lujin=add.lastIndexOf("/");
		int min=add.lastIndexOf(".");
		System.out.println("�ļ�·����"+add.substring(0,lujin));
		System.out.println("�ļ�����"+add.substring(lujin+1,min));
		System.out.println("�ļ���չ����"+add.substring(min+1));

	}

}
