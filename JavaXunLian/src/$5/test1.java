package $5;

public class test1 {


	static int a[]={1,2,3};
	static int b[]=new int[3];
	static int k=0;
	public static void main(String[] args) {
			getPowerSet(1,a,b);

	}
	public static void getPowerSet(int i,int a[],int b[]){
			int x;
			if(i>3){
				for(int j=0;j<k;j++)
					System.out.print(b[j]);
				System.out.println();
			}
			else{
				x=a[i-1];
				b[k++]=x;
				//遍历左子树
				getPowerSet(i+1,a,b); 
				k--;
				//遍历右子树
				getPowerSet(i+1,a,b);
			}
		}
	   

}
