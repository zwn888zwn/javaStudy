package BLUE;

public class doudouji {
	public static void main(String[] args) {
		int[] zu=new int[7];
		fill("LRLRLRR",zu);
		fill("RRLLLRR",zu);
		fill("LLRLLRR",zu);
		fill("RRLLLLL",zu);
		fill("LRLRRLR",zu);
		for(int x:zu)
			System.out.print(x+" ");
	}
	public static void fill(String str,int[] zu){
		double num; //1看钉子 2看格子
		num=(int)(str.length()/2);
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='L')
				num-=0.5;
			else
				num+=0.5;
		}
		if(str.length()%2==0){
			zu[(int)(num)]++;
		}else{
			zu[(int)(num)-1]++;
		}
	}

}
