package BLUE;

import java.util.Stack;

public class hanluota {

	public static void main(String[] args) {
		int count=0;
		Stack<Integer> s1=new Stack<Integer>();
		Stack<Integer> s2=new Stack<Integer>();
		Stack<Integer> s3=new Stack<Integer>();
		for(int i=3;i>0;i--){
			s1.push(i);
		}
		while(s2.size()!=3||s3.size()!=3){
			count++;
			if(yidong(s1,s2))
				continue;
			if(yidong(s1,s3))
				continue;
			if(yidong(s2,s1))
				continue;
			if(yidong(s2,s3))
				continue;
			if(yidong(s3,s1))
				continue;
			if(yidong(s3,s2))
				continue;
		}
		System.out.println(count);

	}
	public static boolean yidong(Stack<Integer> s1,Stack<Integer> s2){
		if(s2.size()==0||s1.peek().intValue()<s2.peek().intValue()){
			s2.push(s1.pop());
			return true;
		}
		return false;
	}


}
