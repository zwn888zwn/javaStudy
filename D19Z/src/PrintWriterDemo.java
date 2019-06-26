import java.io.IOException;
import java.io.PrintWriter;


public class PrintWriterDemo {

	public static void main(String[] args) {
		PrintWriter pw=null;
		try{
			pw=new PrintWriter("c:\\b.txt");
			for(int i=1;i<=5;i++){
				int j;
				for( j=9-i*2;j>0;j-=2){
					pw.print(" ");
				}
				for(int k=9-j;k<=9;k+=2){
					pw.print("*");
				}
				pw.println();
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			pw.close();
		}

	}

}
