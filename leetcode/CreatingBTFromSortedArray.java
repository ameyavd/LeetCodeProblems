package leetcode;

public class CreatingBTFromSortedArray {
	
	/**
	 * Definition for a binary tree node. */
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 
	
	    public TreeNode sortedArrayToBST(int[] nums) {
	        if(nums.length == 0){
	            return null;
	        }
	        TreeNode head = helper(nums, 0, nums.length-1);
	        return head;
	    }
	    
	    public TreeNode helper (int[] nums, int low, int high){
	        if(low>high)
	            return null;
	        int mid = (low+high)/2;
	        TreeNode node = new TreeNode(nums[mid]);
	        node.left = helper(nums,low,mid-1);
	        node.right = helper(nums,mid+1,high);
	        return node;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
