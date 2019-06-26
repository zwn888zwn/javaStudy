package bfs;

import java.util.Scanner;

public class ZOJ1103 {
	static int n;
/*	3 1 2 3
	r b r
	b b b
	r b r
	2 1 2 2
y g
g y*/
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		 n=scan.nextInt();
		int[] position=new int[3];
		for(int i=0;i<3;i++)
			position[i]=scan.nextInt()-1;
		String[][] map=new String[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				map[i][j]=scan.next();
		int[] used=new int[51*51*51];
		int[] queue=new int[51*51*51];
		int[] bu=new int[51*51*51];
		int ans=0;
		int begin=0;
		int end=0;
		queue[0]=encode(position);
		while(begin<=end){
			if(used[queue[begin]]==0){
				used[queue[begin]]=1;
				int nowBu=bu[queue[begin]];
				int[] temp=decode(queue[begin]);
				for(int i=0;i<temp.length;i++){
					for(int k=0;k<n;k++){
						if(i==0&&i!=k&&map[temp[0]][k].equals(map[temp[1]][temp[2]])){
							int p=temp[0];
							temp[0]=k;
							if(temp[0]==temp[1]&&temp[0]==temp[2]){
								ans=nowBu+1;
							}
							int now=encode(temp);
							if(used[now]!=1){
								bu[now]=nowBu+1;
								queue[++end]=now;
							}
							temp[0]=p;
						}
						if(i==1&&i!=k&&map[temp[1]][k].equals(map[temp[0]][temp[2]])){
							int p=temp[1];
							temp[1]=k;
							if(temp[0]==temp[1]&&temp[0]==temp[2]){
								ans=nowBu+1;
							}
							int now=encode(temp);
							if(used[now]!=1){
								bu[now]=nowBu+1;
								queue[++end]=now;
							}
							temp[1]=p;
						}
						if(i==2&&i!=k&&map[temp[2]][k].equals(map[temp[1]][temp[0]])){
							int p=temp[2];
							temp[2]=k;
							if(temp[0]==temp[1]&&temp[0]==temp[2]){
								ans=nowBu+1;
							}
							int now=encode(temp);
							if(used[now]!=1){
								bu[now]=nowBu+1;
								queue[++end]=now;
							}
							temp[2]=p;
						}
					
					}
				}
				if(ans!=0)
					break;
				
			}
			begin++;
			
			
			
		}
		System.out.println(ans);
		
		
		
	}
	public static int encode(int[] arr){
		return ((arr[0]*50)+arr[1])*50+arr[2];
	}
	public static int[] decode(int num){
		int[] arr=new int[3];
		arr[2]=num%50;
		num/=50;
		arr[1]=num%50;
		num/=50;
		arr[0]=num;
		return arr;
	}
	

}
