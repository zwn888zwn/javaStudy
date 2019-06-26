import java.util.Scanner;


public class sk2 {
	public static void main(String[] args) {
	int fen,a;
	Scanner shu=new Scanner(System.in);
	System.out.println("请输入你的分数");
	fen=shu.nextInt();
	a=fen/10;
	char dengdi ;
	switch(a){
	case 10:
	case 9: dengdi='A'; break;
	case 8: dengdi='B'; break;
	case 7: dengdi='C'; break;
	case 6: dengdi='D'; break;
	case 5:
	case 4:
	case 3:
	case 2:
	case 1:
	case 0: dengdi='F'; break;
	default :dengdi=0;break;
	}
	if(dengdi==0)
		System.out.println("输入错误"); 
	else
		System.out.println("你的等第是"+dengdi);

	}

	}


