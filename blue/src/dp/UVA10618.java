package dp;

import java.util.Scanner;

public class UVA10618 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String str=scan.nextLine();
		int[] step=new int[str.length()];//0buong 1 shang 2 xia 3 zuo 4you 
		for(int i=0;i<str.length();i++){
			switch(str.charAt(i)){
			case '.': step[i]=0;break;
			case 'U': step[i]=1;break;
			case 'D': step[i]=2;break;
			case 'L': step[i]=3;break;
			default : step[i]=4;break;
			}
		}
		int[][][][] dp=new int[str.length()][4][4][3];
		int[] cost={3,7,5};
		for(int i=0;i<str.length();i++){
			for(int a=1;a<=4;a++){
				for(int b=1;b<=4;b++){
					if(a==b||(a==4&&b==3))
						continue;
					for(int s=0;s<3;s++){
						if(s==1){
							int min=dp[i-1][step[i-1]][b][1];
							if(step[i-1]==b)
							for(int temp=1;temp<=4;temp++)
								if(temp!=step[i-1]&&!(temp==4&&step[i-1]==3))
									min=Math.min(min, dp[i-1][temp][step[i-1]][2]+
											
											
											);
							 dp[i][a][b][s]=min;
						}
						else if(s==2){
							dp[i-1][step[i-1]][?][1] //step[i-1]==a
							dp[i-1][a][step[i-1]][2]
							
						}
						else{

						}
				}
			}
		}

	}

}
