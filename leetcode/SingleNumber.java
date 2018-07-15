package leetcode;

import java.util.Arrays;

/*
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleNumber sn = new SingleNumber();
		int nums[] = {4,2,1,2,1};
		int c = sn.singleNumber(nums);
		System.out.println(c);

	}
	
	 public int singleNumber(int[] nums) {
		 int result = 0;
		    for (int i = 0; i<nums.length; i++)
		    {
				result ^=nums[i];
		    }
			return result;
	    }

}
