package example;

public class testString2 {
	public static void main(String[] args) {
		String s1="aaaaa";
		String s2="aaaaa";
        String s3=new String("aaaaa");
        String s4=new String("aaaaa");
        System.out.println((s1==s2));
        System.out.println((s3==s2));
        System.out.println((s3==s4));
        
	}

}
