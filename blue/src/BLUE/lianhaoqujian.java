package BLUE;

public class lianhaoqujian {

	public static void main(String[] args) {
		int a=1,b=1;
		int count=0;
		int k=7;
		while(a<k){

			while(b<=k){

				count++;
				b++; 
				if(b==k){
					a+=1;
					b=a;
					break;
				}
			}
		}
		System.out.println(count);
	}

}
