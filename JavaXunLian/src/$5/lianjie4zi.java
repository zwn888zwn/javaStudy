package $5;

import java.util.Scanner;

public class lianjie4zi {

	public static void main(String[] args) {
		String[][] zu=new String[6][7];
		Scanner scan=new Scanner(System.in);
/*		String[][] zu={{null,null,null,null,null,null,null},
					   {null,null,null,null,null,null,null},
					   {null,null,null,null,null,null,null},
					   {null,null,null,null,"R",null,null},
					   {null,null,"R","R","R","R",null},
					   {null,null,null,null,null,null,"R"},};*/
		boolean RY=true;
		while(true){
			System.out.print("输入X Y :");
			int x=scan.nextInt();
			int y=scan.nextInt();
			if(zu[x][y]==null){
				if(RY){
					zu[x][y]="R";
					RY=!RY;
				}
				else{
					zu[x][y]="Y";
					RY=!RY;
				}
				for(int i=1;i<=4;i++){
					if(check(x,y,zu,i)==4){
						System.out.println(zu[x][y]+" is Win");
						print(zu);
						return;
					}
				}
				print(zu);
			}
			else{
				System.out.println("输入有误");
			}
			
		}
	}
	public static void print(String[][] zu){
		for(int i=0;i<zu.length;i++){
			for(int k=0;k<zu[i].length;k++){
				if(zu[i][k]==null)
					System.out.print("| ");
				else
					System.out.print("|"+zu[i][k]);
			}
			System.out.println("|");
		}
	}
	public static int check(int x,int y,String[][] zu,int direct){
	  if((x>=0&&x<zu.length)&&(y>=0&&y<zu[0].length)){
		switch(direct){
			case 1: return 1+check(x,y-1,zu,4,zu[x][y])+check(x,y+1,zu,6,zu[x][y]) ;//row
			case 2: return 1+check(x-1,y,zu,8,zu[x][y])+check(x+1,y,zu,2,zu[x][y]) ; //col
			case 3: return 1+check(x-1,y-1,zu,7,zu[x][y])+check(x+1,y+1,zu,3,zu[x][y]) ;//major diagonal
			case 4: return 1+check(x+1,y-1,zu,1,zu[x][y])+check(x-1,y+1,zu,9,zu[x][y]) ;//sub diagonal
		}
		}
		else{
			return 0;
		}
	return 0;
	}
	public static int check(int x,int y,String[][] zu,int direct,String key){
		  if((x>=0&&x<zu.length)&&(y>=0&&y<zu[0].length)&&!(zu[x][y]==null)){
			if(zu[x][y].equals(key))
			switch(direct){
				case 1:return 1+check(x+1,y-1,zu,1,key) ;
				case 2:  return 1+check(x+1,y,zu,2,key);//789              
				case 3:return 1+check(x+1,y+1,zu,3,key);//4 6
				case 4: return 1+check(x,y-1,zu,4,key) ;//123  方向
				case 9:return 1+check(x-1,y+1,zu,9,key);
				case 6:return 1+check(x,y+1,zu,6,key);
				case 7: return 1+check(x-1,y-1,zu,7,key);
				case 8: return 1+check(x-1,y,zu,8,key);
			}
			}
			else{
				return 0;
			}
		return 0;
		}

}
