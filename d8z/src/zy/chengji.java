package zy;


import java.util.Scanner;

public class chengji {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[][] zu=new int[5][2];
        String[] min=new String[5];
        int fen,k=0;
        String xm;
        System.out.println("请输入成绩和姓名");
        while(true){
        	fen=s.nextInt();
        	if(fen==-1)
        		break;
        	zu[k][0]=fen;
        	zu[k][1]=k;
        	xm=s.next();
        	min[k]=xm;
        	k++;
        }
        for(int j=1;j<zu.length;j++){
 		   for(int i=j;i<zu.length;i++)
 			if(zu[j-1][0]<zu[i][0]){
 				int a;
 				a=zu[j-1][0];
 				zu[j-1][0]=zu[i][0];
 				zu[i][0]=a;
 			}
 		}
        for(int j=0;j<k ;j++){
        	System.out.println("成绩为"+zu[j][0]+"姓名为"+min[zu[j][1]]);
        }
	}

}
