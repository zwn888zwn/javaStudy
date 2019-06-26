package BLUE;

import java.util.Scanner;
import java.util.Stack;

public class Question4 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++){
			String string=scan.next();
			execelFormat(string);
		}
	}
	public static void execelFormat(String s){
		int x1=s.indexOf("R");
		int x2=s.indexOf("C");
		int hangshu=Integer.parseInt(s.substring(x1+1, x2)),lieshu=Integer.parseInt(s.substring(x2+1));
		Stack<Character> stack=new Stack<Character>();
		while(lieshu>0){
			if(lieshu%26==0){
				stack.push('Z');
				lieshu=lieshu/26-1;
			}
			else{
				stack.push((char)(lieshu%26+'A'-1));
				lieshu/=26;
			}
		}
		while(!stack.empty()){
			System.out.print(stack.pop());		
		}
		System.out.println(hangshu);
		
	}
	

}
