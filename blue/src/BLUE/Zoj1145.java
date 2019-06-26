package BLUE;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoj1145 {
	static int result;
	static int pos=0;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String text=scan.nextLine();
		 result=Integer.parseInt(text.substring(0, text.indexOf("=")));
		String[] zu=text.substring(text.indexOf("=")+1).split(" ");
		int[] dengshi=getDeng(zu); //18=7 (5 3) 2
		cal(0,dengshi);
		
	}
	public static void cal(int ceng,int[] deng){
		if(ceng==deng.length){
			pos=0;
			if(compute(deng)==result){
				print(deng);
			}
			return;
		}
		if(deng[ceng]>0||deng[ceng]==-1||deng[ceng]==-2){
			cal(ceng+1,deng);
		}
		else{
			for(int i=-3;i>=-5;i--){
				deng[ceng]=i;
				cal(ceng+1,deng);
			}
			
		}
		
		
	}

	public static void print(int[] deng) {
		System.out.print(result+"=");
		for(int i=0;i<deng.length;i++){
			switch(deng[i]){
			case -1: System.out.print("(");break;
			case -2: System.out.print(")");break;
			case -3: System.out.print("*");break;
			case -4: System.out.print("+");break;
			case -5: System.out.print("-");break;
			default:System.out.print(deng[i]);
			}
			
		}
		
	}
	public static int compute(int[] deng){//¼ÆËãËã·¨
		
		int sum=backet(deng);
		while(pos<deng.length&&(deng[pos]==-3||deng[pos]==-4||deng[pos]==-5)){
			int operation=deng[pos++];
			int temp=backet(deng);
			switch(operation){
			case -3: sum*=temp;  break;
			case -4: sum+=temp;  break;
			case -5: sum-=temp;  break;
			}
			
		}
		return sum;
	}
	public static int backet(int[] deng){
		int sum;
		if(deng[pos]==-1){
			pos++;
			sum=compute(deng);
			pos++;
		}
		else
			sum=deng[pos++];
		return sum;
	}
	
	public static int[] getDeng(String[] zu) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<zu.length;i++){
			String temp=zu[i];
			if(temp.charAt(0)=='('){
				al.add(-1);
				al.add(Integer.parseInt(temp.substring(1)));
			}
			else if(temp.charAt(temp.length()-1)==')'){
				al.add(Integer.parseInt(temp.substring(0,temp.length()-1)));
				al.add(-2);
				
			}
			else{
				al.add(Integer.parseInt(temp));
			}
			al.add(-6);	
			
		}
		int[] deng=new int[al.size()-1];
		for(int i=0;i<al.size()-1;i++){
			deng[i]=al.get(i);
		}
		return deng;
	}

}
