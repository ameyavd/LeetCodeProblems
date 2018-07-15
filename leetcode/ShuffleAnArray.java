package leetcode;

import java.util.Random;

public class ShuffleAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		ShuffleAnArray saa = new ShuffleAnArray();
		saa.shuffleArray(arr);
		
	}
	
	public void shuffleArray(int[] arr){
		Random rnd = new Random();
		for(int i=arr.length-1; i>0;i--){
			int index = rnd.nextInt(i);
			
			int a = arr[index];
			arr[index] = arr[i];
			arr[i] = a;
		}
		
		System.out.println("Randomized Array");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
