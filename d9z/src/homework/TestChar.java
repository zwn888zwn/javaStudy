package homework;

import java.util.Scanner;

public class TestChar {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String zifu=scan.next();
		tongji(zifu);

	}
	static void tongji(String zifu){
		int Digit=0,Letter=0;
		for(int i=0;i<zifu.length();i++){
			if(Character.isDigit(zifu.charAt(i))){
				Digit++;
			}
			if(Character.isLetter(zifu.charAt(i))){
				Letter++;
			}
		}
		System.out.printf("有%d个字母，有%d个数字，一共%d个字符", Letter,Digit,zifu.length());
		
	}

}
