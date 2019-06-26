package BLUE;

public class huangjinfengge {

	public static void main(String[] args) {
		int a=1,b=3,temp;
		while((Math.abs((double)a/b-0.618034))>0.000001){
			temp=a;
			a=b;
			b=b+temp;
		}
		System.out.println(a+"/"+b);

	}

}
