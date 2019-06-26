package example;

public class textRandom {
	public static void main(String[] args) {
		char c=(char)(int)(Math.random()*('z'-'a'+1)+'a');
		System.out.println(c);
	}

}
