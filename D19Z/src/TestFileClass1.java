import java.io.*;
import java.util.Date;
public class TestFileClass1 {

	public static void main(String[] args) {
		File file=new File("c:/a.dat");
		System.out.println(file.length());
		System.out.println(file.canRead());
		System.out.println(file.isHidden());
		System.out.println(file.canWrite());
		System.out.println(file.exists());
		System.out.println(new Date(file.lastModified()).toString());
		//System.out.println(file.renameTo(new File("c:/a.dat")));

	}

}
