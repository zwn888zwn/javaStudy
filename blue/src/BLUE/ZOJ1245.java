package BLUE;

import java.util.Scanner;

public class ZOJ1245 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int p=1;
		int max=-1;
		for(int i=1;i<n;i++){
			p+=2;
		}
		String[][] zu=new String [n][p];
		for(int i=0;i<n;i++){
			for(int k=0;k<p;k++){
				zu[i][k]=scan.next();
			}
			p-=2;
		}
/*		4
		# - # - # - -
		# - - - #
		# # -
		-
		4
		# - # - # - -
		# - # - #
		# # -
		-
*/
		p=zu[0].length;
		for(int i=0;i<n-1;i++){
			for(int j=1;j<p;j+=2){
				if(zu[i][j].equals("-")){
					max=Math.max(updfs(i,j,zu), max);
				}
				 
			}
			p-=2;
		}
		//down loop
		p=0;
		int q=1;
		for(int i=1;i<=max;i++){
			p+=q;
			q+=2;
		}
		System.out.println(p);
		
		
	}

	public static int updfs(int x,int y,String[][] zu) {
		if(y-2>=0&&x+1<zu.length){
			int left=0;
			int mid=0;
			int right=0;
			if(zu[x+1][y-2]!=null&&zu[x+1][y-2].equals("-")){
				left=updfs(x+1,y-2,zu);
			}
			if(zu[x+1][y-1]!=null&&zu[x+1][y-1].equals("-")){
				mid=1;
			}
			if(zu[x+1][y]!=null&&zu[x+1][y].equals("-")){
				right=updfs(x+1,y,zu);
			}
			int min=Math.min(left, Math.min(mid, right));
			return min+1;
		
		}
		else
			return 1;
		
	}
	//public static int downdfs(int x,int y,String[][] zu) {}

}
