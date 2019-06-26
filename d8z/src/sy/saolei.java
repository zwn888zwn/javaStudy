package sy;
import java.util.Arrays;
public class saolei {
	public static void main(String[] args) {
		String[][] lei=new String[18][18];
		for(int q=0;q<lei.length;q++)
		Arrays.fill(lei[q],"0");
		for(int i=1;i<=40;){
		int a=(int)(Math.random()*16)+1;
		int b=(int)(Math.random()*16)+1;
		if(lei[a][b]!="*"){
		lei[a][b]="*";
		i++;
		}
		}
		for(int k=1;k<=16;k++){
			   for(int j=1;j<=16;j++){
				   int p=0;
				   if(lei[k][j]!="*"){			   
						   if(lei[k-1][j]=="*")
							   p++;
						   if(lei[k-1][j-1]=="*")
							   p++;
						   if(lei[k-1][j+1]=="*")
							   p++;
						   if(lei[k][j-1]=="*")
							   p++;
						   if(lei[k][j+1]=="*")
							   p++;
						   if(lei[k+1][j-1]=="*")
							   p++;
						   if(lei[k+1][j]=="*")
							   p++;
						   if(lei[k+1][j+1]=="*")
							   p++;				   
						   lei[k][j]=p+"";	    
				   }
			   }		  
	}
		for(int x=1;x<=16;x++){
			   for(int y=1;y<=16;y++){
				   System.out.print(lei[x][y]+"  ");
			   }
			   System.out.println();
	}
}
}
