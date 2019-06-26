package example;

public class bbb {
	public static void main(String[] args) {
		String s="I love you!";
		String s1="";
		String s2="";
		System.out.println(s);
		for(int i=0;i<s.length();i++){
			s1+=((char)(s.charAt(i)+3));
		}
        System.out.println(s1);
        for(int i=0;i<s1.length();i++){
			s2+=((char)(s1.charAt(i)-3));
		}
        System.out.println(s2);
	}

}
