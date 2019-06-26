import java.util.Scanner;

public class d221 {
	public static void main(String[] args) {
		double sheshi, hua;
		Scanner wendu = new Scanner(System.in);
		System.out.println("请输入摄氏温度");
		sheshi = wendu.nextDouble();
		double a=(double)9/5;
		hua = a*sheshi + 32.0 ;
		System.out.println("华氏温度为："+hua);
		
	}
}
