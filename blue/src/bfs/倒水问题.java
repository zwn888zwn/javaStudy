package bfs;

import java.util.ArrayList;
import java.util.Arrays;

public class 倒水问题 {
	 static public class Nodes {
		ArrayList<Nodes> no=new ArrayList<Nodes>();
		int a;
		int b;
		int c;
		int put;
		int cost;
		Nodes(int a,int b,int c){
			this.a=a;
			this.b=b;
			this.c=c;
		}
		Nodes(int[] zu,int put){
				a=zu[0];
				b=zu[1];
				c=zu[2];
				this.put=put;
			
		}
		Nodes(int[] zu){
			a=zu[0];
			b=zu[1];
			c=zu[2];
		
	}
		public boolean equals(Object o){
			if(!(o instanceof Nodes)) 
				return false;
			else
			{
				Nodes temp=(Nodes)o;
				if(temp.a==this.a&&temp.b==this.b&&temp.c==this.c){
					return true;
				}
				
			}
			return false;
		}


	}
	static int[] max={6,3,1};
	static ArrayList<Nodes> al=new ArrayList<Nodes>();
	public static void main(String[] args) {
		int[] zu={6,0,0};
		addNode(zu);
		//System.out.println(getLimit(al,new Nodes(6,0,0),new Nodes(4,2,0)));
		
		for(int i=0;i<al.size();i++){ //显示图
			Nodes node=al.get(i);
			System.out.println("----------------");
			System.out.println(node.a+","+node.b+","+node.c);
			ArrayList<Nodes> all=al.get(i).no;
			for(int k=0;k<all.size();k++){
				Nodes nodee=all.get(k);
				System.out.println(nodee.a+","+nodee.b+","+nodee.c+","+nodee.put);
			}
			
		}

		

	}
	public static int getLimit(ArrayList<Nodes> maps,Nodes begin,Nodes end){
		ArrayList<Nodes> t=new ArrayList<Nodes>();
		ArrayList<Nodes> map=(ArrayList<Nodes>) maps.clone();
		t.add(begin);
		while(!t.contains(end)){
			int minCost=Integer.MAX_VALUE;
			Nodes minNodes=null;
			for(int i=0;i<t.size();i++){
				Nodes tempNode=t.get(i);
				for(Nodes nodes:t){
					if(map.get(map.indexOf(tempNode)).no.contains(nodes)){
						int index=map.get(map.indexOf(tempNode)).no.indexOf(nodes);
						map.get(map.indexOf(tempNode)).no.remove(index);
					}
				}
				for(Nodes nodes:map.get(map.indexOf(tempNode)).no){
					if(minCost>nodes.put+tempNode.cost){
						minCost=nodes.put+tempNode.cost;
						minNodes=nodes;		
					}
				}
			}
			minNodes.cost=minCost;
			t.add(minNodes);
			
			
		}
		return t.get(t.indexOf(end)).cost;
	}
	public  static void addNode(int[] zu){
		Nodes nodes=new Nodes(zu[0],zu[1],zu[2]);
		if(!al.contains(nodes)){
			al.add(nodes);
		}
		else
			return;
		for(int i=0;i<zu.length;i++){
			for(int k=0;k<zu.length;k++){
				if(i==k)
					continue;
				if(zu[i]+zu[k]>=max[k]){
					int[] zu1=Arrays.copyOf(zu, zu.length);
					zu1[k]=max[k];
					zu1[i]=zu[i]+zu[k]-max[k];
					if(zu[0]==zu1[0]&&zu[1]==zu1[1]&&zu[2]==zu1[2])
						continue;
					if(nodes.no.contains(new Nodes(zu1))){
						return;
					}
					else{
						nodes.no.add(new Nodes(zu1,zu1[k]-zu[k]));
						addNode(zu1);
					}
				}
				else{
					int[] zu1=Arrays.copyOf(zu, zu.length);
					zu1[k]=zu[i]+zu[k];
					zu1[i]=0;
					if(zu[0]==zu1[0]&&zu[1]==zu1[1]&&zu[2]==zu1[2])
						continue;
					if(nodes.no.contains(new Nodes(zu1))){
						return;
					}
					else{
						nodes.no.add(new Nodes(zu1,zu1[k]-zu[k]));
						addNode(zu1);
					}
				
					
				}
					
			}
			
		}
	}
}
