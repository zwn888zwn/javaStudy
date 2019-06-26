package $5;

import java.util.Scanner;
import java.util.Stack;





public class Point{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int cou=scan.nextInt();
		Stack<Integer> sta=new Stack<Integer>();
		for(int i=0;i<cou;i++){
			sta.push(scan.nextInt());
		}
		int maxC=1,current,tongji=0,tongjiN = 0;
		current=sta.pop();
		while(!sta.isEmpty()){
			if(tongji<=maxC){
				tongji=maxC;
				tongjiN=current;
			}
			if(sta.peek()==current){
				maxC++;
				sta.pop();
			}else{
				if(tongji<=maxC){
					tongji=maxC;
					tongjiN=current;
				}
				current=sta.pop();
				maxC=1;
			}
			
		}
		if(tongji<=maxC){
			tongji=maxC;
			tongjiN=current;
		}
		System.out.println(tongjiN);
	}
}


