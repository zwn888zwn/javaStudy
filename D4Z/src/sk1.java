import java.util.Scanner;

public class sk1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year, yu;
		System.out.println("�����빫�����");
		year = scan.nextInt();
		yu = year % 12;
		switch (yu) {
		case 0:	System.out.println("��");
		break;
		case 1:	System.out.println("��");
		break;
		case 2:	System.out.println("��");
		break;
		case 3:	System.out.println("��");
		break;
		case 4:	System.out.println("��");
		break;
		case 5:	System.out.println("ţ");
		break;
		case 6:	System.out.println("��");
		break;
		case 7:	System.out.println("��");
		break;
		case 8:	System.out.println("��");
		break;
		case 9:System.out.println("��");
		break;
		case 10:System.out.println("��");
		break;
		case 11:System.out.println("��");
		break;
		default:
			System.out.println("�ⲻ���ܵ�");
			break;
		}

	}

}
