package sy;

import java.util.Arrays;
import java.util.Scanner;

public class caipiao {
	public static void main(String[] args) {
		int[] userChoice=new int[7];
		int a,fuhe=0;
		String jieguo="";
		int[] result=new int[7];
		Scanner s=new Scanner(System.in);
		System.out.print("������7������");
		for(int k=0;k<7;k++){
	        int shu=s.nextInt();
			if(shu>=1&&shu<=32)
	        userChoice[k]=shu;
			else{
				k--;
			System.out.println("���ķ�Χ������������");
			}
			
		}
        for(int j=0;j<7;j++){
        	 a=(int)(Math.random()*32)+1;
        	for(int p=0;p<j;p++){
        		if(a==result[p]){
        			j--;
        			break;
        		}
        	}
        	result[j]=a;
        }
        for(int x=0;x<7;x++){
        	for(int y=0;y<7;y++)
        		if(userChoice[x]==result[y]){
        			fuhe++;
        			break;
        		}
        			
        }
        switch(fuhe){
        case 1:
        case 2:  jieguo="�Բ�����û���н�";break;
        case 3:  jieguo="��ϲ�������ĵȽ����������20Ԫ�ֽ� ";break; 
        case 4:  jieguo="��ϲ���������Ƚ����������100Ԫ�ֽ� ";break;
        case 5:  jieguo="��ϲ�����˶��Ƚ����������1000Ԫ�ֽ� ";break;
        case 6:  jieguo="��ϲ������һ�Ƚ����������1���ֽ� ";break;
        case 7:  jieguo="��ϲ�������صȽ����������20���ֽ�";break;
        }
        System.out.println("����Ͷע������\n"+Arrays.toString(userChoice));
        System.out.println("����������\n"+Arrays.toString(result)+"\n"+jieguo);
        
	}

}
