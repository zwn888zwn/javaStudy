package shangke;

public class feibonaji {
	public static void main(String[] args) {
		int[] f=new int[20];
		f[0]=1;f[1]=1;
        for(int i=0;i<=17;i++)
        	f[i+2]=f[i]+f[i+1];
        for(int x=0;x<f.length;x++){	
          System.out.print(x+" ");
          if((x+1)%8==0)
        	  System.out.println();
        }
	} 

}
