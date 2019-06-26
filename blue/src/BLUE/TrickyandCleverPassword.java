package BLUE;

import java.util.Scanner;

public class TrickyandCleverPassword {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int begin=0;
		int last=s.length()-1;
		int bcount=0;
		int count=0;
		boolean isb=false;
		int midb=0;
		int midc=0;
		while(begin<last){
			if(s.charAt(begin)!=s.charAt(last)){
				if(!isb){
					bcount++;
				}
				if(isb){
					last=s.length()-1;
					isb=false;
				}
				begin++;
			}
			else{
				if(!isb){
					isb=true;
				}
				count++;
				begin++;
				last--;
			}
			
		}
		System.out.println(bcount+" "+count);
		System.out.println(midb+" "+midc);

	}
	public static boolean ishuiwen(String s){
		for(int i=0;i<s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(s.length()-1-i)){
				return false;
			}
		}
		return true;
	}

}
