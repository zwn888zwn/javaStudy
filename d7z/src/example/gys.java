package example;

import java.util.Scanner;

public class gys {
	public static void main(String[] args) {
		 Scanner s=new Scanner (System.in);
		 System.out.println("请输入2个整数");
         int x=s.nextInt();
         int y=s.nextInt();
         int Max=MaxGYS(x,y);;
         System.out.println("最大公约数为"+Max);
	}
	public static int MaxGYS(int x,int y){
    	int max=0;
		for(int i=1;i<=x;i++){
    		if(x%i==0&&y%i==0)
    			max=i;
    	}
    	return max;
    }

}
