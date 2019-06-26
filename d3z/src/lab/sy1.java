package lab;

import java.util.Scanner;

public class sy1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入一个文件路径");
		String add=s.next();
		int lujin=add.lastIndexOf("/");
		int min=add.lastIndexOf(".");
		System.out.println("文件路径："+add.substring(0,lujin));
		System.out.println("文件名："+add.substring(lujin+1,min));
		System.out.println("文件扩展名："+add.substring(min+1));

	}

}
