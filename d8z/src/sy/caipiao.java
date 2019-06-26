package sy;

import java.util.Arrays;
import java.util.Scanner;

public class caipiao {
	public static void main(String[] args) {
		int[] userChoice=new int[7];
		int a,fuhe=0;
		String jieguo="";
		int[] result=new int[7];
		Scanner s=new Scanner(System.in);
		System.out.print("请输入7个整数");
		for(int k=0;k<7;k++){
	        int shu=s.nextInt();
			if(shu>=1&&shu<=32)
	        userChoice[k]=shu;
			else{
				k--;
			System.out.println("数的范围有误重新输入");
			}
			
		}
        for(int j=0;j<7;j++){
        	 a=(int)(Math.random()*32)+1;
        	for(int p=0;p<j;p++){
        		if(a==result[p]){
        			j--;
        			break;
        		}
        	}
        	result[j]=a;
        }
        for(int x=0;x<7;x++){
        	for(int y=0;y<7;y++)
        		if(userChoice[x]==result[y]){
        			fuhe++;
        			break;
        		}
        			
        }
        switch(fuhe){
        case 1:
        case 2:  jieguo="对不起你没有中奖";break;
        case 3:  jieguo="恭喜您中了四等奖，您将获得20元现金！ ";break; 
        case 4:  jieguo="恭喜您中了三等奖，您将获得100元现金！ ";break;
        case 5:  jieguo="恭喜您中了二等奖，您将获得1000元现金！ ";break;
        case 6:  jieguo="恭喜您中了一等奖，您将获得1万现金！ ";break;
        case 7:  jieguo="恭喜您中了特等奖，您将获得20万现金";break;
        }
        System.out.println("您的投注号码是\n"+Arrays.toString(userChoice));
        System.out.println("开奖号码是\n"+Arrays.toString(result)+"\n"+jieguo);
        
	}

}
