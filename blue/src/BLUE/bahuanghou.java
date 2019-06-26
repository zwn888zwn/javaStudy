package BLUE;

public class bahuanghou {
	public static void main(String[] args) {
/*		String[][] zu={{"q",null,null,null,null,null,null,null},
						{"q","q",null,null,null,null,null,null},
						{"q",null,null,null,null,null,null,null},
						{"q",null,null,null,null,null,null,null},
						{null,null,null,null,null,null,null,null},
						{"q",null,null,null,null,null,null,null},
						{"q",null,null,null,null,null,null,null},
						{null,null,null,"q",null,null,null,null}};*/
		String[][] zu=new String[8][8];
		fill(zu,0);

	}
	public static void fill(String[][] zu,int hang){
		if(hang==8){
			print(zu);
			return ;
		}
		for(int lie=0;lie<8;lie++){
			zu[hang][lie]="Q";
			if(check(hang,lie,zu)){
				//if(!fill(zu,hang+1))
				fill(zu,hang+1);
				zu[hang][lie]=null;
			}
			else{
				zu[hang][lie]=null;
			}
		}
	//	return false;
	}
	public static void clear(String[][] zu,int hang){
		for(int i=0;i<8;i++){
			zu[hang][i]=null;
		}
	}
	public static boolean check(int x,int y,String[][] zu){
		//check hang
		for(int i=0;i<zu.length;i++){
			if(i==x)
			continue;
			if(zu[i][y]!=null)
				return false;
		}//检查列
		for(int i=0;i<zu.length;i++){
			if(i==y)
			continue;
			if(zu[x][i]!=null)
				return false;
		}
		return (checkDuijiao(x,y,zu,true,4)&&checkDuijiao(x,y,zu,true,3)&&checkDuijiao(x,y,zu,true,2)&&checkDuijiao(x,y,zu,true,1));
	}													//方位 1 2 3 4 左上 右上 左下 右下
	public static boolean checkDuijiao(int x,int y,String[][] zu,boolean ISfirst,int fangwei){
		boolean bo=true;
		if(((x>=0&&x<8)&&(y>=0&&y<8))){
			if((zu[x][y]!=null)&&!ISfirst)
				bo= false;
			switch(fangwei){
			case 1:return checkDuijiao(x-1,y-1,zu,false,1)&&bo;
			case 2:return checkDuijiao(x-1,y+1,zu,false,2)&&bo;
			case 3:return checkDuijiao(x+1,y-1,zu,false,3)&&bo;
			case 4:return checkDuijiao(x+1,y+1,zu,false,4)&&bo;
			default: break;
			}
			return bo;
//			return checkDuijiao(x-1,y+1,zu,false,1)&&checkDuijiao(x+1,y+1,zu,false,2)&&checkDuijiao(x-1,y-1,zu,false,3)&&checkDuijiao(x+1,y-1,zu,false,4);
		}
		else
			return bo;
		
	}
	public static void print(String[][] zu){
		for(int i=0;i<8;i++){
			for(int k=0;k<8;k++){
				if(zu[i][k]==null)
					System.out.print("0 ");
				else
					System.out.print("1 ");
			}
			System.out.println();
		}
		System.out.println("-----------------");
	}

}
