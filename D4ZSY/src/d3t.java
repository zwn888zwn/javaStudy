import java.util.Scanner;


public class d3t {
	public static void main(String[] args) {
	Scanner shu =new Scanner(System.in);
	System.out.println("�����������ε�������");
	double a ,b ,c;
	a=shu.nextDouble();
	b=shu.nextDouble();
	c=shu.nextDouble();
	if(a+b>c&&a+c>b&&b+c>a)
		System.out.println("�����ε��ܳ�Ϊ"+(a+b+c));
	else
		System.out.println("�����Ч");

	}

}
