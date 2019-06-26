import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriterDemo {

	public static void main(String[] args) {
		FileWriter bw = null;
		File file=null;
		try{
			 file=new File("c:\\zwn.txt");
			 bw=new FileWriter(file,true);
			bw.write("JAVA\r\n");
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(bw!=null){
				try{
					bw.close();
				}catch(IOException e){
					throw new RuntimeException(e);
				}
			}
		}

	}

}
