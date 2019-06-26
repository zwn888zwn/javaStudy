package example;

public class GenericStack {
	static int size=1;
	int[] stack;
	GenericStack(){
		stack=new int[12];
	}
	public int getSize(){
		return size;
	}
	public void push(int i){
		if(size%12==0){
			createArray(int[] a);
		}
		if(stack[size-1]==(Integer)null){
			stack[size-1]=i;
			size++;
		}
	}
	public int  peek(){
		return stack[size-1];
	}
	public int pop(){
		int t = 0;
		if(stack[size-1]!=(Integer)null){
			t=stack[size-1];
			stack[size-1]=(Integer) null;
			size--;
		}	
		return t;
		
	}

}
