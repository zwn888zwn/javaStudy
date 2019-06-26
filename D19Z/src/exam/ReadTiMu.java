package exam;
import java.io.*;
import java.util.ArrayList;
public class ReadTiMu {
	private ArrayList<String> alltimu=new ArrayList<String>();
	BufferedReader bf;
	public ReadTiMu(){
		File file=new File("C:/Users/Administrator/Desktop/19练习/questions.txt");
		try{
			String line;	
			bf=new BufferedReader(new FileReader(file));
			while((line=bf.readLine())!=null){
				alltimu.add(line);
				
			}
		}catch(Exception e){
			System.out.println("文件读取失败");
			e.printStackTrace();
		}finally{
			try{
			bf.close();
			}catch(Exception e){
				System.out.println("关闭出错");
				e.printStackTrace();
			}
		}
	}
	public ArrayList<String> getAllTimu(){
		return this.alltimu;
	}


}
