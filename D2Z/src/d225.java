import java.util.Scanner;


public class d225 {
	public static void main(String[] args) {
     double jine ,nianl,nians,jiazhi,a,b;
     Scanner xx =new Scanner(System.in);
    System.out.println("请依次输入：资金额，年利率，年数。（输完一个回车）");
         jine = xx.nextDouble();
        nianl = xx.nextDouble();
        nians = xx.nextDouble();
        a=(1+nianl/12.0);
        b=nians*12;
        jiazhi=Math.pow(a,b)*jine;
        System.out.println("投资价值"+jiazhi);
     
	}

}
