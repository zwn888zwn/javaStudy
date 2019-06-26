import java.util.Scanner;

public class d2t {
	public static void main(String[] args) {
		Scanner shu = new Scanner(System.in);
		int month, year, a ;
		System.out.println("请输入月份");
		month = shu.nextInt();
		System.out.println("请输入年份");
		year = shu.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			a = 31;	System.out.println(year + "年" + month + "月有" + a + "天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			a = 30;
			System.out.println(year + "年" + month + "月有" + a + "天");
			break;
		case 2:
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				a = 29;
			} else
				a = 28;
			System.out.println(year + "年" + month + "月有" + a + "天");
			break;
		default:
			System.out.println("非法命令");
			break;
		}

	}

}
