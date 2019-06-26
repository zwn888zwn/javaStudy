package homework;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class kh16_12 extends JFrame{
	kh16_12(){
	add(new jpkh16_12());
		
		
	
	}
	public static void main(String[] args) {
		kh16_12 se=new kh16_12();
		se.setSize(200,300);
		se.setTitle("aaaaaaaa");
		se.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		se.setVisible(true);
		se.setLocationRelativeTo(null);

	}

}
class jpkh16_12 extends JPanel{
	 private Image offScreenImage;
	int du;
	jpkh16_12(){
		 du=0;
		Timer timer=new Timer(100,new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				repaint();
				
			}
			
		});
		timer.start();
	}
	
	protected void paintComponent(Graphics g){
		int xCenter=this.getWidth()/2;
		int yCenter=this.getHeight()/2;
		int radius=(int)(Math.min(this.getWidth(), this.getHeight())*0.4);
	
		if(du>85)
			du=0;
		du+=30;
		super.paintComponents(g);
		if (this.offScreenImage == null)//双缓冲技术
        {
            this.offScreenImage = this.createImage(getWidth(), getHeight());
        }
        Graphics gOffScreen = offScreenImage.getGraphics();
        gOffScreen.clearRect(0, 0, getWidth(), getHeight());//清除原来图像
        gOffScreen.fillArc(xCenter-radius,yCenter-radius, radius*2, radius*2, du+0, 30);
        gOffScreen.fillArc(xCenter-radius,yCenter-radius, radius*2, radius*2, du+90, 30);
        gOffScreen.fillArc(xCenter-radius,yCenter-radius, radius*2, radius*2, du+180, 30);
        gOffScreen.fillArc(xCenter-radius,yCenter-radius, radius*2, radius*2, du+270, 30);
		g.drawImage(offScreenImage, 0, 0, null);
	}
}