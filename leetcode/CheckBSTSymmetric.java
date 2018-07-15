package leetcode;

import java.util.Stack;

public class CheckBSTSymmetric {
	
	/**
	 * Definition for a binary tree node. */
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 	public boolean isSymmetric(TreeNode root) {
	        return root==null || isSymmetricHelp(root.left,root.right);
	    }
	    
	     public boolean isSymmetricHelp(TreeNode left, TreeNode right) {
	        if(left == null || right == null)
	            return left==right;
	         if(left.val != right.val)
	             return false;
	         return isSymmetricHelp(left.left,right.right) && isSymmetricHelp(left.right, right.left);
	     }
	     
	     public boolean NonRecursiveisSymmetric(TreeNode root){
	    	 if(root == null) return true;
	    	 
	    	 Stack<TreeNode> st = new Stack<>();
	    	 TreeNode left, right;
	    	 if(root.left != null){
	    		 if(root.right==null) return false;
	    		 st.push(root.left);
	    		 st.push(root.right);
	    	 } else if(root.right != null)
	    		 return false;
	    	 
	    	 
		     while(!st.empty()){
		    	 if(st.size()%2!=0) return false;
		    	 right = st.pop();
		    	 left = st.pop();
		    	 if(right.val!=left.val) return false;
		    	 
		    	 if(left.left!=null){
		    		 if(right.right == null) return false;
		    		 st.push(left.left);
		    		 st.push(right.right);
		    	 } else if(right.right !=null)
		    		 return false;
		    	 
		    	 if(left.right!=null){
		    		 if(right.left == null) return false;
		    		 st.push(left.right);
		    		 st.push(right.left);
		    	 } else if(right.left != null){
		    		 return false;
		    	 }
		     }
		     
		     return true;
	     }
	    

}
