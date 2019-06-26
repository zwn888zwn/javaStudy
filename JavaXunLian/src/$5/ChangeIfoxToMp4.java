package $5;

import java.io.*;
import java.util.*;

public class ChangeIfoxToMp4 {
	static int success=0;
	static int failed=0;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		File file=new File(scan.nextLine());
		changeName(file);
		System.out.println("success¡G"+success);
		System.out.println("fail¡G"+failed);
	}
	public static void changeName(File pass){
		File[] son=pass.listFiles();
		for(int i=0;i<son.length;i++){
			if(son[i].isDirectory()){
				changeName(son[i]);
			}
			else{
				String name=son[i].getAbsolutePath();
				int index=name.lastIndexOf(".");
				if(name.substring(index+1).equals("ifox")){
					name=name.substring(0, index)+".mp4";
					if(son[i].renameTo(new File(name))){
						success++;
					}
					else
						failed++;
				}
			}
			
		}
		
		
	}

}
