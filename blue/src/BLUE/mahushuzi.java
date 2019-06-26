package BLUE;

public class mahushuzi {
	static int num=0;
	public static void main(String[] args) {
		for(int i=11111;i<=99999;i++){
			String s=i+"";
			if(s.contains("0"))
				continue;
			int a=Integer.parseInt(s.substring(0, 2));
			int b=Integer.parseInt(s.substring(2));
			int c=Integer.parseInt(s.substring(0, 1)+s.substring(3,4)+s.substring(1,2));
			int d=Integer.parseInt(s.substring(2,3)+s.substring(4));
			if(a*b==c*d){
				System.out.println(a+"*"+b+"="+c+"*"+d);
				num++;
			}
		}
		System.out.println(num);

	}

}
