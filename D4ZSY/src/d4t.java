import java.util.Scanner;


public class d4t {
	public static void main(String[] args) {
		int a=(int)(Math.random()*10);
		int b=(int)(Math.random()*10);
		Scanner shu=new Scanner(System.in);
		System.out.println("������"+a+"��"+b+"�ĺ�");
		int c=shu.nextInt();
		if(a+b==c)
	    	System.out.println("ture");
		else
			System.out.println("false");
	}

}
