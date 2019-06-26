import java.io.*;
public class TestDataFileStream {

	public static void main(String[] args) throws IOException {
		DataOutputStream out = new DataOutputStream(new FileOutputStream("c:/d.dat",true));
		out.writeUTF("∫«∫«");
		out.writeDouble(9.5);
		out.writeUTF("∞°∞°∞°");
		out.writeDouble(2.5);
		out.writeUTF("ﬂ¿ﬂ¿ﬂ¿");
		out.writeDouble(1.5);
		out.close();
		DataInputStream input = new DataInputStream(new FileInputStream("c:/d.dat"));
		try{
		while(true){
			System.out.println(input.readUTF());
			System.out.println(input.readDouble());
		}
		}catch(EOFException e){
			input.close();
			System.out.println("∂¡ÕÍ¡À");
		}
	}
		
		

}
