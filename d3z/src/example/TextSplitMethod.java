package example;

import java.util.Scanner;

public class TextSplitMethod {
	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
		 System.out.println("请输入一个日期(YYYY-MM-DD)");
		 String date=input.next();
         String[] part=date.split("-");
         System.out.println(part[0]+"年"+part[1]+"月"+part[2]+"日");
	}

}
