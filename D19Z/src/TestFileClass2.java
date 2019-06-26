import java.io.*;
public class TestFileClass2 {

	public static void main(String[] args) {
		File file=new File("c:/");
		String[] aaa=file.list();
		for(String i : aaa){
			System.out.println(i);
		}
	}

}
