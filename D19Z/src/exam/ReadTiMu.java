package exam;
import java.io.*;
import java.util.ArrayList;
public class ReadTiMu {
	private ArrayList<String> alltimu=new ArrayList<String>();
	BufferedReader bf;
	public ReadTiMu(){
		File file=new File("C:/Users/Administrator/Desktop/19��ϰ/questions.txt");
		try{
			String line;	
			bf=new BufferedReader(new FileReader(file));
			while((line=bf.readLine())!=null){
				alltimu.add(line);
				
			}
		}catch(Exception e){
			System.out.println("�ļ���ȡʧ��");
			e.printStackTrace();
		}finally{
			try{
			bf.close();
			}catch(Exception e){
				System.out.println("�رճ���");
				e.printStackTrace();
			}
		}
	}
	public ArrayList<String> getAllTimu(){
		return this.alltimu;
	}


}
