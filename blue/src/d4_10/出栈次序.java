package d4_10;

public class ��ջ���� {
	static int count=0;
	public static void main(String[] args) {
		stack(16,0);
		System.out.println(count);

	}
	public static void stack(int left,int save){//leftû��  save�ѳ�

		if(left>=0&&(left+save<=16)){
			if(left==0&&save==16)
				count++;
		stack(left-1,save); //��
		stack(left,save+1); //��
		}
	}

}
