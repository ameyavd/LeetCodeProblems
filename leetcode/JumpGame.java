package leetcode;

public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,3,1,1,4};
		JumpGame jg = new JumpGame();
		boolean res = jg.canJump(nums);
		System.out.println(res);

	}
	
	 public boolean canJump(int[] nums) {
	        int maxIndex = nums.length-1;
	        int maxJump = nums[0];
	        for(int i=0;i<=maxJump;i++){
	            maxJump = Math.max(maxJump, i+nums[i]);
	            if(maxJump >= maxIndex)
	                return true;
	        }
	        return false;
	    }

}
