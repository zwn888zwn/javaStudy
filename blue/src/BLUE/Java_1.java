package BLUE;
import java.io.*;
import java.util.ArrayList;

public class Java_1 {
    public static void main(String[ ] args) throws IOException {
    /*	int[] zu={1,2,3};
    	int a=encode(zu);
    	System.out.println(a);
    	zu=decode(a);
    	for(int i=0;i<3;i++)
    		System.out.println(zu[i]);*/
    	System.out.println("hello"== new String("hello"));
    }
	public static int encode(int[] arr){
		return ((arr[0]*50)+arr[1])*50+arr[2];
	}
	public static int[] decode(int num){
		int[] arr=new int[3];
		arr[2]=num%50;
		num/=50;
		arr[1]=num%50;
		num/=50;
		arr[0]=num;
		return arr;
	}
}
