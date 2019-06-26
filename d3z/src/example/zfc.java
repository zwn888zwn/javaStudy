package example;

import java.util.Scanner;

public class zfc {


	public static void main(String[] args) {
		String s1="welcome to Java";
		String s2=new String("welcome to Java");
		char[] charArray = {'h','i'};
		String s3=new String(charArray);
		int[] a=new int[5];
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(charArray);
		System.out.println(s3);
		Scanner input=new Scanner(System.in);
		System.out.println("ÊäÈë×Ö·û´®");
		String s4=input.next();
		String s5=input.nextLine();
		System.out.println(s4);
		System.out.println(s5);

	}

}
