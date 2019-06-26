package example;

import java.util.Scanner;

public class aaa {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入密码");
		String s1=s.next();
		System.out.println("请再次输入密码");
        String s2=s.next();
        if(s1.equals(s2)){
        	System.out.println("密码设置成功");
        }else
        	System.out.println("密码设置失败");
        		
        }
	}


