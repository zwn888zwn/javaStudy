package sy;

//读入一个英文句子，分别统计出大写字母和小写字母的个数
import java.util.Scanner;
public class d3t {
	public static void main(String[] args) {
	  System.out.println("请输入一个英文句子");
		Scanner s=new Scanner(System.in);
	   char zimu;
	   int zimu1,big=0,small=0;	   
	   String juzi=s.nextLine(); //注意 是句子
	  for(int i=0;i<juzi.length();i++){
	   zimu=juzi.charAt(i);
       zimu1=(int)zimu;
	   if(zimu1>=97&&zimu1<=(int)('y'+1))
		   small++;
	   if(zimu1>=65&&zimu1<=(int)('Y'+1))
		   big++;
	}
	  System.out.println("小写字母有"+small+"  大写字母有"+big);
	}
}
