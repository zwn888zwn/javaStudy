package $5;

public class A {
  public static void main(String[] args){
	  String s="<font color=\"blue\"></font>";
	  StringBuffer sb=new StringBuffer(s);
	 System.out.println(s.length());
	 System.out.println(s.indexOf("\"", 1));
  }
  public static String checkZhushi(String s){
		StringBuffer bf=new StringBuffer(s);
		int h1=0,h2=0;
		for(int i=0;i<bf.length();i++){
			if(bf.charAt(i)=='/'){
				if((bf.length()-(i+1)>0)&&bf.charAt(i+1)=='/'){
					bf.replace(i, bf.length(), "<font color=\"green\">"+bf.substring(i)+"</font>");
					return bf.toString();
				}
			}

			if((i==bf.length()-1)&&(bf.charAt(i)>=97&&bf.charAt(i)<=122)){
				h2=i;
			}
			if(isZiFu(bf.charAt(i))){
				if((bf.length()-(i+1)>0)&&bf.charAt(i+1)>=97&&bf.charAt(i+1)<=122){
				h1=i+1;
				}
			}
			if(bf.charAt(i)>=97&&bf.charAt(i)<=122){
				if((bf.length()-(i+1)>0)&&isZiFu(bf.charAt(i+1))){
				h2=i+1;
				}
			}
			if(h1<h2){
				bf.replace(h1, h2, "<font color=\"red\">"+bf.substring(h1,h2)+"</font>");
				h1=h2+25;
				i+=25;
			}
		}
		return bf.toString();
		
		
	}public static boolean isZiFu(char c){
		boolean f=false;
		switch(c){
		case ' ' :;
		case '	' :;
		case ')' :;
		case '=' : f=true ;break;
		}
			
		return f;
	}
}
