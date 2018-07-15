package leetcode;

public class AddArrayElementsToK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddArrayElementsToK aatk = new AddArrayElementsToK();
		int arr[] = {1,2,3,4,5};
		aatk.addArrayElements(arr, 9);

	}
	
	public void addArrayElements(int[] arr, int k){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j] == k){
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}

}
