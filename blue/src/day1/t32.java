package day1;

import java.util.Scanner;

public class t32 {
	static int s;
	static int t;
	static int w;
	static int count=-1;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 s=scan.nextInt();
		 t=scan.nextInt();
		 w=scan.nextInt();
		String str=scan.next();
		int[][] zu=new int[2][w];
		int[] save=new int[w];
		for(int i=0;i<w;i++){
			zu[0][i]=str.charAt(i)-'a'+1;
		}
		digui(zu,save,0,zu[0][0]-1);
	}
	public static void digui(int[][]zu ,int[] save,int ceng,int last){
		if(ceng==w){
			count++;
			if(count>=1&&count<=5){
			for(int p=0;p<save.length;p++){
				System.out.print((char)(save[p]+'a'-1));
			}
			System.out.println();

			}
			return;
		}
		int i=zu[0][ceng];
		if(zu[1][ceng]==1)
			i=last+1;
		for(;i<=t;i++){
			zu[1][ceng]=1;
			
			if(i<=last)
				continue;
			save[ceng]=i;
			digui( zu,save,ceng+1,i);
		}
	}

}
