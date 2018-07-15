package leetcode;

import java.util.Arrays;

public class KthLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int findKthLargest(int[] nums, int k) {
	        Arrays.sort(nums);
	        return nums[nums.length - (k)];
	        
	    }

}
