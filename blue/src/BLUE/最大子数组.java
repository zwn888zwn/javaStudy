package BLUE;

public class 最大子数组 {

	public static void main(String[] args) {
		int[] zu={13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
		Subzu sub=findmax(zu,0,zu.length-1);
		System.out.println(sub.sum);
		System.out.println(sub.low);
		System.out.println(sub.high);
	}
	public static Subzu findmax(int[] zu,int low,int high){
		if(low==high)
			return new Subzu(low,high,zu);
		else{
			int mid = (low+high)/2;
			Subzu leftsub=findmax(zu,low,mid);
			Subzu rightsub=findmax(zu,mid+1,high);
			Subzu crosssub=getCross(zu,low,mid,high);
			if(leftsub.sum>=rightsub.sum&&leftsub.sum>=crosssub.sum)
			return leftsub;
			else if(rightsub.sum>=leftsub.sum&&rightsub.sum>=crosssub.sum){
				return rightsub;
			}
			else
				return crosssub;
		}
		
	}
	public static Subzu getCross(int[] zu,int low,int mid ,int high){
		int leftmax=zu[mid],leftsum=0,left = 0,rightmax=zu[mid+1],right = 0,rightsum=0;
		for(int i=mid;i>=low;i--){
			leftsum+=zu[i];
			if(leftsum>=leftmax){
				leftmax=leftsum;
				left=i;
			}
		}
		for(int i=mid+1;i<=high;i++){
			rightsum+=zu[i];
			if(rightsum>=rightmax){
				rightmax=rightsum;
				right=i;
			}
		}
			return new Subzu(left,right,zu);
	}

}
class Subzu{
	int sum;
	int low;
	int high;
	public Subzu(int low,int high,int[] zu){
		this.low=low;
		this.high=high;
		int sum=0;
		for(int i=low;i<=high;i++)
			sum+=zu[i];
		this.sum=sum;
	}
}
