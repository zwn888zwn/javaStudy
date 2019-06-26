package BLUE;

import java.util.Scanner;
import java.util.Vector;

public class Question2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String s1=disposeString(s);
		System.out.println(s1);
		
		

	}
	public static String disposeString(String s){
		Vector<Character> sourse = new Vector<Character>();
		for(int i=0;i<s.length();i++){
			sourse.add(s.charAt(i));
		}
		for(int k=0;k<sourse.size()-1;k++){
			if(sourse.elementAt(0)>='a'&&sourse.elementAt(0)<='z'){
				char save=sourse.elementAt(0);
				sourse.remove(0);
				sourse.add(0,(char)(save-32));
			}	
			
		if(sourse.elementAt(k)==' '){
			if(sourse.elementAt(k+1)==' '){
				sourse.remove(k+1);
				k--;
			}
			if(sourse.elementAt(k+1)>='a'&&sourse.elementAt(k+1)<='z'){
				char save=sourse.elementAt(k+1);
				sourse.remove(k+1);
				sourse.add(k+1,(char)(save-32));
			}			
		}
		if(sourse.elementAt(k)>='a'&&sourse.elementAt(k)<='z'||sourse.elementAt(k)>='A'&&sourse.elementAt(k)<='Z'){
			if(sourse.elementAt(k+1)>='1'&&sourse.elementAt(k+1)<='9'){
				sourse.add(k+1, '_'); 
				k++;
			}
		}
		if(sourse.elementAt(k)>='1'&&sourse.elementAt(k)<='9'){
			if(sourse.elementAt(k+1)>='a'&&sourse.elementAt(k+1)<='z'){
				sourse.add(k+1, '_');
				k++;
			}
		}
		}
		return sourse.toString();
	}

}
