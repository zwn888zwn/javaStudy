package fuxi;
import java.util.Scanner;


public class fuxi3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" ‰»În");
		int n=s.nextInt();
        int i=1 ;
        long ji=1;
		do{
	    ji*=i;
		i++;
		}while (i<=n);
		
		System.out.println(ji);
	}
	

}
