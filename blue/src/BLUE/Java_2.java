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

    //加入一个按钮
    Button btnDisp=new Button("显示参数");
    this.add(btnDisp) ;

    //事件监听
    btnDisp.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
           //***************Found*****************
           JOptionPane.showMessageDialog(null,"参数Caption的值为:"+strCaption) ;
        }
     }) ;
}
}