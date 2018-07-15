package leetcode;

/*
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */

public class RemoveElementFromArray {
	
	public static void main(String[] args) {
		RemoveElementFromArray rem = new RemoveElementFromArray();
		int nums[] = {3,2,4,8,3,3};
		int val = 3;
		int c = rem.removeElement(nums, nums.length, val);
		System.out.println("cc"+c);
	}
	
	 
	 int removeElement(int A[], int n, int elem) {
		    int begin=0;
		    for(int i=0;i<n;i++) if(A[i]!=elem) A[begin++]=A[i];
		    return begin;
		}
	

}
