import java.io.*;
public class TestFileStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream out =new FileOutputStream("c:/d.dat");
		out.write('a');
		out.write('b');
		out.write('c');
		out.write('d');
		out.write('เล');
		for(int i=0;i<10;i++)
			out.write('0'+i);
		FileInputStream in=new FileInputStream("c:/d.dat");
		int c;
		while( (c=in.read())!=-1)
			System.out.print((char)c);
	}
		
		

}
