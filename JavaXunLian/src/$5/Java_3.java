package $5;
//Java_3.java: 用BitSet完成Eratosthenes筛网算法找1至1023之间的素数.
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Java_3 extends JFrame {
   public Java_3(){
      super( "BitSets" );
      final BitSet sieve = new BitSet( 1024 );
      Container c = getContentPane();
      final JLabel status = new JLabel();
      c.add( status, BorderLayout.SOUTH );
      JPanel inputPanel = new JPanel();
      inputPanel.add( new JLabel( "从1 至 1023" +
                                  "输入值:" ) );
      final JTextField input = new JTextField( 10 );
      input.addActionListener(
         new ActionListener() {
            public void actionPerformed( ActionEvent e ){
               int val = Integer.parseInt( input.getText() );
               if ( sieve.get( val ) )
                  status.setText( val + " 是一个素数 " );
               else
                  status.setText( val +
                                  " 不是一个素数 " );
            }
         }
      );
      inputPanel.add( input );
      c.add( inputPanel, BorderLayout.NORTH );
      JTextArea primes = new JTextArea();
      ScrollPane p = new ScrollPane();
     //*********Found********
      p.add( primes );
      c.add( p, BorderLayout.CENTER );
      //从1 至 1023设置所有位
      int size = sieve.size();
      for ( int i = 1; i < size; i++ )
         sieve.set( i );
      //执行Eratosthenes筛网算法
      int finalBit = ( int ) Math.sqrt( sieve.size() );
      for ( int i = 2; i < finalBit; i++ ) 
         if ( sieve.get( i ) ) 
            for ( int j = 2 * i; j < size; j += i ) 
               sieve.clear( j );
      int counter = 0;
      for ( int i = 1; i < size; i++ )
         if ( sieve.get( i ) ) {
            primes.append( String.valueOf( i ) );
            primes.append( ++counter % 7 == 0 ? "\n" : "\t" );
         }
      setSize( 300, 250 );
      show();
   }

   public static void main( String args[] ){
      Java_3 app = new Java_3();
     //*********Found********
      app.super(
         new WindowAdapter() {
            public void windowClosing( WindowEvent e ){
               System.exit( 0 );
            }
         }
      );
   }
}

