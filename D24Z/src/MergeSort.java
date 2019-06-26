
public class MergeSort {

	public static void main(String[] args) {
		int[] list={2,3,2,5,6,1,-2,10};
		mergeSort(list);
		for(int i=0;i<list.length;i++){
			System.out.print(list[i]+" ");
		}

	}
	public static void mergeSort(int[] list){
		if(list.length>1){
			int[] fistHalf=new int[list.length/2];
			System.arraycopy(list, 0,fistHalf, 0, list.length/2);
			mergeSort(fistHalf);
			
			int secondHalfLength=list.length-list.length/2;
			int[] secondHalf=new int[secondHalfLength];
			System.arraycopy(list, list.length/2, secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf);
		}
	}

}
