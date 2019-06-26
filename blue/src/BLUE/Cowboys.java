package BLUE;

import java.util.*;

public class Cowboys {
	static int ans=0;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		ArrayList<Integer> need =new  ArrayList<Integer>();
		ArrayList has =new  ArrayList();
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)=='B'){
				if(s.charAt(i+1)=='A'){
					has.add(i);
				}
			}
			else{
				if(s.charAt(i+1)=='B'){
					need.add(i);
				}
			}
		}
		if(s.charAt(s.length()-1)=='B'){
			if(s.charAt(0)=='A'){
				has.add(s.length()-1);
			}
		}
		else{
			if(s.charAt(0)=='B'){
				need.add(s.length()-1);
			}
		}
		int size=has.size();
		for(int i=0;i<size;i++){
			int p=(Integer) has.get(i);
			Node node=new Node(p+1);
			if(need.contains(new Integer(p-1))){
				node.last=p;
			}
			if(need.contains(new Integer(p+1))){
				node.later=p+2;
			}
			has.remove(i);
			has.add(i, node);	
		}
		Node temp=(Node) has.get(has.size()-1);
		if(temp.index==s.length()){
			if(need.get(0)==0){
				temp.later=1;
				has.remove(has.size()-1);
				has.add(temp);
			}
		}
		temp=(Node) has.get(0);
		if(temp.index==1){
			if(need.get(need.size()-1)==s.length()-1){
				temp.last=s.length();
				has.remove(0);
				has.add(0,temp);
			}
		}
/*		for(int i=0;i<has.size();i++){
			Node temps=(Node) has.get(i);
			System.out.println(temps.last);
			System.out.println(temps.later);
		}*/
		fix(need,has,-1);
		System.out.println(ans);
		//System.out.println(need);
	}
	public static void fix(ArrayList<Integer> need,ArrayList<Node> has,int max){
		if(need.size()==0){
			ans++;
		}

		for(int i=0;i<has.size();i++){
			
			ArrayList<Integer> a1 =new  ArrayList<Integer>(need);
			ArrayList<Node> a2 =new  ArrayList<Node>(has);
			Node temp=has.get(i);
			if(temp.index<max){
				continue;
			}
			if(temp.last!=0){
				if(a1.contains(new Integer(temp.last-1)))
				a1.remove(new Integer(temp.last-1));
			}
			if(temp.later!=0){
				if(a1.contains(new Integer(temp.later-1)))
				a1.remove(new Integer(temp.later-1));
			}
			a2.remove(i);
			fix(a1,a2,temp.index);
			
		}
		
		
	}
	static class Node{
		public int index;
		public int last;
		public int later;
		public Node(int i){
			this.index=i;
		}
		
	}

}
