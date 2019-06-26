import java.io.File;

import javax.swing.JFileChooser;


public class JFileChoiceDemo {

	public static void main(String[] args) {
		JFileChooser jc=new JFileChooser();
		jc.showOpenDialog(null);
		File file=jc.getSelectedFile();
		if(file!=null){
			System.out.println(file.toString());
		}

	}

}
