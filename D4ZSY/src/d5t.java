import java.util.Scanner;


public class d5t {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double shui = 0,gongzi;
		System.out.println("�������������Ա𡢹��š��»������ʡ����𡢲���");
		String x=scan.next();
		String y=scan.next();
		int gh=scan.nextInt();
		double yuejiben=scan.nextInt();
		double jiang=scan.nextDouble();
		double butie=scan.nextDouble();
        gongzi=yuejiben+jiang+butie;
        if (gongzi>13000)
			shui=gongzi*0.2;
		 if(13000>gongzi&&gongzi>10000)
			shui=1500*0.05+2500*0.075+2500*0.12+(gongzi-10000)*0.18;
		 if(10000>gongzi&&gongzi>7500)
			shui=1500*0.05+2500*0.075+(gongzi-7500)*0.12;
		 if(7500>gongzi&&gongzi>5000)
			shui=1500*0.05+(gongzi-5000)*0.075;
		 if(5000>gongzi&&gongzi>3500)
			shui=(gongzi-3500)*0.05;
		 if(gongzi>0)  
			shui=0;
		System.out.println("����"+x+"\n�Ա�"+y+"����"+gh+"Ӧ��нˮ"+gongzi+"ʵ��нˮ"+(gongzi-shui));
		 
			
		}
	}


