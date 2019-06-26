package day1;

public class t20 {
	static class tree{
		String p;
		tree left;
		tree right;
	}

	public static void main(String[] args) {
		 String mid="BDCAEHGKF";
		 String last="DCBHKGFEA";//ABCDEFGHK
		 tree t=new tree();
			bianli(mid ,last,t);
			qianxu(t);
		
	}
	public static void qianxu(tree root){
		if(root!=null){
			System.out.print(root.p);
			qianxu(root.left);
			qianxu(root.right);	
		}

	}
	
		
	public static void bianli(String mid,String last,tree t){
		if(mid.equals(last)){
			t.p=mid;
			return;
		}
		int index=mid.indexOf(last.charAt(last.length()-1));
		if(last.length()>1)
		t.p=last.charAt(last.length()-1)+"";
		if(mid.length()>0){
			t.left=new tree();
		bianli(mid.substring(0,index),last.substring(0,index),t.left);
		}
		if(last.length()>0){
			t.right=new tree();
		bianli(mid.substring(index+1, mid.length()),last.substring(index,last.length()-1),t.right);
		}

}
}