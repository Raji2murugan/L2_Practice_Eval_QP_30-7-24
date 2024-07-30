package Evaluation2;

//Time: 3.05 PM

public class target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {3,5,6,7,8};
		int target=9;
		int i;
		for(i=0;i<arr.length;i++) {
			if(arr[i]>=target) {
				break;
			}
		}
		System.out.println(target+" index is : "+i);

	}

}
