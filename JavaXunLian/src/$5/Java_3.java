package $5;
//Java_3.java: ��BitSet���Eratosthenesɸ���㷨��1��1023֮�������.
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
      inputPanel.add( new JLabel( "��1 �� 1023" +
                                  "����ֵ:" ) );
      final JTextField input = new JTextField( 10 );
      input.addActionListener(
         new ActionListener() {
            public void actionPerformed( ActionEvent e ){
               int val = Integer.parseInt( input.getText() );
               if ( sieve.get( val ) )
                  status.setText( val + " ��һ������ " );
               else
                  status.setText( val +
                                  " ����һ������ " );
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
      //��1 �� 1023��������λ
      int size = sieve.size();
      for ( int i = 1; i < size; i++ )
         sieve.set( i );
      //ִ��Eratosthenesɸ���㷨
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

