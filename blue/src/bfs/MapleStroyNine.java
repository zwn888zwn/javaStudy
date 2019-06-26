package bfs;

import java.util.Scanner;

public class MapleStroyNine {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int now=scan.nextInt();
		int[] save=new int[876543210];
		int[] last=new int[876543210];
		int[] queue=new int[876543210];
		int begin=0,end=0;
		int[][] four={{0,0,1,-1},{-1,1,0,0}};
		queue[0]=now;
		save[now]=1;
		last[now]=-1;
		while(begin<=end){
			String temp=queue[begin++]+"";
			if(save.length<9)
				temp="0"+temp;
			int p=temp.charAt('0');
			for(int i=0;i<4;i++){
				int x=p/3+four[0][p];
				int y=p%3+four[1][p];
				if(x>=0&&x<3&&y>=0&&y<3){
					char[] temps=temp.toCharArray();
					char a=temps[p];
					temps[p]=temps[x*3+y];
					temps[x*3+y]=a;
					int id=0;
					for(int j=0;j<9;j++)
						id=(id+temps[j]-'0')*10;
					if(id==1234567890){
						int father=last[id];
						while(father!=-1){
							System.out.println(father);
							id=father;
							father=last[id];
						}
						return;
					}
					if(save[id]!=0){
						last[id]=queue[begin-1];
						save[id]=1;
						queue[++end]=id;
					}
				}
			}
			
			
		}

	}

}
