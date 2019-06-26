package BLUE;

public class LouTi {

	public static void main(String[] args) {
		pailie(6,"");

	}
	public static void pailie(int ceng,String s){
		if(ceng<0)
			return;
		if(ceng==0){
			System.out.println(s);
			return;
		}
		for(int i=1;i<=3;i++){
			pailie(ceng-i,s+i);
		}
	}

}
