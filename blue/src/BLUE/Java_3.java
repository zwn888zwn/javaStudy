package BLUE;
//*********Found********
import java.awt.*;
import java.awt.event.*;

public class Java_3 implements ActionListener,WindowListener
{
    Frame f;
    Button be,bw,bs,bn,bc;
    public void create()
    {
        f=new Frame("Exit test");
     //*********Found********
        be=new Button("East");
        bw=new Button("West");
        bs=new Button("South");
        bn=new Button("North");
        bc=new Button("Exit");
        f.add(be,"East");
        f.add(bw,"West");
     //*********Found********
        f.add(bs,"South");
        f.add(bn,"North");
        f.add(bc,"Center");
        bc.addActionListener(this); //Ϊ��ťע�������
        f.addWindowListener(this); //Ϊ��ťע�������
        f.setSize(200,200);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        Java_3 fa=new Java_3();
        fa.create();
    }
    public void actionPerformed(ActionEvent e)
    {
     //*********Found********
        System.exit(0); //�رմ��ڲ�ʹ������������
    }; 
    public void windowOpened(WindowEvent e){}
    public void windowClosing(WindowEvent e)
    {
     //*********Found********
    	System.exit(0); //�رմ��ڲ�ʹ������������
    };
    public void windowClosed(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}   
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
}
