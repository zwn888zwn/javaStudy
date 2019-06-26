package $5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		HashMap result=new HashMap();
		String lineText;
		BufferedReader reader=null;
		try{
			File sourceFile =new File("h:\\txx1.txt");
			reader=new BufferedReader(new FileReader(sourceFile));
			while((lineText=reader.readLine())!=null){
				if(!"".equals(lineText.trim())){
					int index=lineText.indexOf("	");
					result.put(lineText.substring(0,index).trim(),lineText.substring(index).trim());
				}
			}
		}catch(FileNotFoundException e){
			throw new RuntimeException(e);
		}finally{
			if(reader!=null)
			{
				try{
					reader.close();
				}catch(IOException e){
					throw new RuntimeException(e);
				}
			}
		}
		
		
	Vector<String> result2=new Vector<String>();
	HashMap result3=new HashMap();//jieguo
		String lineText2;
		BufferedReader reader2=null;
		try{
			File sourceFile2 =new File("h:\\tx2.txt");
			reader2=new BufferedReader(new FileReader(sourceFile2));
			while((lineText2=reader2.readLine())!=null){
				if(!"".equals(lineText2.trim())){
					result2.add(lineText2.trim());
				}
			}
		}catch(FileNotFoundException e){
			throw new RuntimeException(e);
		}finally{
			if(reader2!=null)
			{
				try{
					reader2.close();
				}catch(IOException e){
					throw new RuntimeException(e);
				}
			}
		}
		Set set=result.entrySet();
		Iterator ite=set.iterator();
		while(ite.hasNext()){
			Map.Entry me=(Map.Entry)ite.next();
			for(int k=0;k<result2.size();k++){
				if(me.getValue().equals(result2.elementAt(k))){
					result3.put(me.getKey(),me.getValue());
					break;
				}
			}
		}
		try{
			Set set3=result3.entrySet();
			Iterator ite3=set3.iterator();
			File file=new File("h:\\1.txt");
			FileWriter fw=new FileWriter(file);
			while(ite3.hasNext()){
				Map.Entry me3=(Map.Entry)ite3.next();
				fw.write(me3.getKey()+"	");
				fw.write(me3.getValue()+"\r\n");
			}
			fw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
