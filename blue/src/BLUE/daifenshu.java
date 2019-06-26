package BLUE;

import java.util.HashSet;

public class daifenshu {

	public static void main(String[] args) {
		//check(3+"",714+"",69258+"");
		int a=1,b,c=1,d;
		String al,bl,cl,dl;
		while(a<1000){
			b=100-a;
			c=1;
			al=a+"";
			bl=b+"";
			for(;;c++){
				d=b*c;
				cl=c+"";
				dl=d+"";
				if((dl.length())>(9-al.length()-cl.length())){
					a++;
					break;
				}
				else if((dl.length())<(9-al.length()-cl.length())){
					continue;
				}
				else{
					check(al,cl,dl);
				}
					
			}
		}

	}
	public static void check(String a,String c,String d){
		HashSet hs=new HashSet();
		String all=a+c+d;
		if(all.contains("0")||all.length()!=9)
			return;
		for(int i=0;i<all.length();i++){
			hs.add(all.charAt(i));
		}
		if(hs.size()==9){
			System.out.println(a+" "+c+" "+d);
		}
		
	}

}
