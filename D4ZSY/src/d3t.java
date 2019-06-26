import java.util.Scanner;


public class d3t {
	public static void main(String[] args) {
	Scanner shu =new Scanner(System.in);
	System.out.println("请输入三角形的三个边");
	double a ,b ,c;
	a=shu.nextDouble();
	b=shu.nextDouble();
	c=shu.nextDouble();
	if(a+b>c&&a+c>b&&b+c>a)
		System.out.println("三角形的周长为"+(a+b+c));
	else
		System.out.println("输出无效");

	}

}
