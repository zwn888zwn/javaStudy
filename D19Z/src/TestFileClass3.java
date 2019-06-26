import java.io.*;
import java.util.Scanner;
public class TestFileClass3 {

	public static void main(String[] args) {
		File file=new File("c:/new.txt");
		if(file.exists())
			System.out.println("exists");
		else
			try{
				if(file.createNewFile())
					System.out.println("Created");
				else
					System.out.println("Created error");
			}catch(Exception e){
				e.printStackTrace();
			}
		System.out.println("ÊÇ·ñÉ¾³ýY/N");
		Scanner scan=new Scanner(System.in);
		boolean delete=false;
		if(scan.next().equals("Y"))
			delete=true;
		if(scan.next().equals("N"))
			delete=false;
		if(delete){
			try{
				if(file.delete())
					System.out.println("ok");
				else
					System.out.println("false");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
