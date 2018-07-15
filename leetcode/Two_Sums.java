package leetcode;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

public class Two_Sums {

	public static void main(String[] args) {
		
		Two_Sums ts = new Two_Sums();
		int nums[] = {2, 7, 11, 15};
		int target = 9;
		int num[] = ts.twoSum(nums, target);
		System.out.println(num[0]+" "+num[1]);

	} 
	
	public int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		for(int i=0; i< nums.length-1; i++){
			for(int j=i+1; j<nums.length; j++){
				if(nums[i]+nums[j] == target){
					res[0]=i;
					res[1]=j;
				}
			}
		}
		return res;
        
    }
	
	

}
