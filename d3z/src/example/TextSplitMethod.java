package example;

import java.util.Scanner;

public class TextSplitMethod {
	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
		 System.out.println("������һ������(YYYY-MM-DD)");
		 String date=input.next();
         String[] part=date.split("-");
         System.out.println(part[0]+"��"+part[1]+"��"+part[2]+"��");
	}

}
