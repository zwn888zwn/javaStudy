package BLUE;
import java.applet.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.*;
import javax.swing.*;

public class Java_2 extends Applet {
private String strCaption;
public void init()
{
    strCaption="";
    //************Found*****************
    strCaption=this.getParameter("Caption") ;

    //����һ����ť
    Button btnDisp=new Button("��ʾ����");
    this.add(btnDisp) ;

    //�¼�����
    btnDisp.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
           //***************Found*****************
           JOptionPane.showMessageDialog(null,"����Caption��ֵΪ:"+strCaption) ;
        }
     }) ;
}
}