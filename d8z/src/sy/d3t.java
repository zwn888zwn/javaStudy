package sy;

//����һ��Ӣ�ľ��ӣ��ֱ�ͳ�Ƴ���д��ĸ��Сд��ĸ�ĸ���
import java.util.Scanner;
public class d3t {
	public static void main(String[] args) {
	  System.out.println("������һ��Ӣ�ľ���");
		Scanner s=new Scanner(System.in);
	   char zimu;
	   int zimu1,big=0,small=0;	   
	   String juzi=s.nextLine(); //ע�� �Ǿ���
	  for(int i=0;i<juzi.length();i++){
	   zimu=juzi.charAt(i);
       zimu1=(int)zimu;
	   if(zimu1>=97&&zimu1<=(int)('y'+1))
		   small++;
	   if(zimu1>=65&&zimu1<=(int)('Y'+1))
		   big++;
	}
	  System.out.println("Сд��ĸ��"+small+"  ��д��ĸ��"+big);
	}
}
