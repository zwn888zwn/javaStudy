package dp;

import java.util.Arrays;
import java.util.Scanner;

public class ZOJ1183 {
	static int n;
	static int l;
	static int c;
	static int[] time;
	static int[] minLesson;
	static int[] unSatis;
	
/*	10
	120
	10
	80
	80
	10
	50
	30
	20
	40
	30
	120
	100*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		l = scan.nextInt();
		c = scan.nextInt();
		time = new int[n];
		for (int i = 0; i < n; i++) {
			time[i] = scan.nextInt();
		}
		minLesson = new int[n];
		unSatis =new int[n+1];
		Arrays.fill(minLesson, -1);
		System.out.println(dp(0));
		System.out.println(unSatis[0]);
	}

	public static int dp(int begin) {
		if (begin < n) {
			if (minLesson[begin] != -1) {
				return minLesson[begin];
			}
			int sum =0;
			int now=begin;
			int min=999999999;
			int minS=99999999;
			while (now<n&&sum +time[now]<= l) {
				sum += time[now];
				now++;
				int nowLesson=dp(now)+1;
				int nowS=999999;
				if(nowLesson<min){
					min=nowLesson;	
					nowS=cal(l-sum)+unSatis[now];
				}
				if(nowLesson==min){
					nowS=cal(l-sum)+unSatis[now];
					if(minS>nowS)
					minS=nowS;
				}
			}
			minLesson[begin]=min;
			unSatis[begin]=minS;
			return minLesson[begin];

		}
		else
			return 0;
	}
	public static int cal(int t){
		if(t==0)
			return 0;
		else if(t<=10&&t>=1)
			return c*-1;
		else
			return (t-10)*(t-10);
			
	}

}
