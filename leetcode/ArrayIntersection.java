package leetcode;

import java.util.HashSet;

public class ArrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
	
		ArrayIntersection ai = new ArrayIntersection();
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {2,3,8,9};
		ai.arrayIntersection(arr1, arr2);

	}
	
	public void arrayIntersection(int arr1[], int arr2[]){
		HashSet<Integer> hs = new HashSet<>();
		for(int i:arr1){
			if(!hs.contains(i))
				hs.add(i);
		}	
		
		for(int i:arr2){
			if(hs.contains(i))
				System.out.println(i);
		}
		
	}

}
