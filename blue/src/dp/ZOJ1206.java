package dp;

import java.util.Scanner;

public class ZOJ1206 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		int[] num=new int[m];
		int[] cost=new int[m];
		int[][] min=new int[m][(int)Math.ceil(n/3.0)];
		int[][] len=new int[m][(int)Math.ceil(n/3.0)];
		for(int i=0;i<m;i++){
			num[i]=scan.nextInt();
			cost[i]=scan.nextInt();
			
		}
		for(int i=0;i<m;i++){
			min[i][0]=cost[i];
			len[i][0]=3;
		}
		for(int ceng=1;ceng<min[0].length;ceng++){
			for(int end=0;end<m;end++){//½áÎ²
				for(int beg=0;beg<m;beg++){//¿ªÍ· 123 456
					if(min[end][ceng]<min[beg][ceng-1]+cost[end]){
					min[end][ceng]=min[beg][ceng-1]+cost[end];
					len[end][ceng]=len[beg][ceng-1]+3;
					if((num[beg]/100)==(num[end]%100%10)){
						len[end][ceng]--;
						if(((num[end]-num[end]/100*100)/10)==((num[beg]-num[beg]/100*100)/10)){
							len[end][ceng]--;
						}
					}
					
					}
				}
				
			}
		}
		
		int max=-999999;
		int xT=-1;
		int yT=-1;
		int lenT=-1;
		for(int y=min[0].length-1;y>=0;y--){
			for(int x=m-1;x>=0;x--){
				if(min[x][y]>max&&len[x][y]<=n){
					max=min[x][y];
					xT=x;
					yT=y;
					lenT=len[x][y];
				}
				if(min[x][y]==max&&len[x][y]<=n&&len[x][y]<=lenT){
					if(len[x][y]!=lenT){
						xT=x;
						yT=y;
						lenT=len[x][y];
					}
					else{
						if(cost[x]<cost[xT]){
							xT=x;
							yT=y;
							lenT=len[x][y];
						}
						
					}
					
				}
			}
		}
		String s="";
		int costT=min[xT][yT];
		while(costT>0){
			s=s+num[xT];
			costT-=cost[xT];
			yT--;
			if(yT==-1){
				break;
			}
			
			for(int i=0;i<m;i++){
				if(min[i][yT]==costT){
					s=s.substring(0, s.length()+(len[xT][yT+1]-len[i][yT])-3);
					xT=i;
					break;
				}
				
			}
			
		}
		while(s.length()<n){
			s="0"+s;
		}
		System.out.println(s);
	}

}

