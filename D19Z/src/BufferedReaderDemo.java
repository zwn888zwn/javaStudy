import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException  {
		BufferedReader br=null;
		String s="";
		int index,count=0;
		double sum=0,avg=0;
		try{
			br=new BufferedReader(new FileReader("c:\\b.txt"));
			while((s=br.readLine())!=null){
				System.out.println(s);
				index=s.lastIndexOf(" ");
				sum+=Integer.parseInt(s.substring(index).trim());
				count++;
			}
			System.out.println("Æ½¾ù·Ö"+(sum/count));
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			br.close();
		}
	}

}
