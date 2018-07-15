package leetcode.amazon;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	/*
	 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum ts = new TwoSum();
		int nums[] = {1,2,3,4,5};
		int target = 9;
		int[] res = ts.twoSum(nums, target);
		System.out.println(res[0]+" "+res[1]);
	}
	
	public int[] twoSum(int[] nums, int target) {
		int result[] = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(target - nums[i])){
				result[1] = i+1;
				result[0] = map.get(target-nums[i]);
				return result;
			}
			map.put(nums[i], i+1);
		}
		return result;
	}

}
