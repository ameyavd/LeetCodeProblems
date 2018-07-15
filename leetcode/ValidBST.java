package leetcode;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
Example 1:

Input:
    2
   / \
  1   3
Output: true
Example 2:

    5
   / \
  1   4
     / \
    3   6
Output: false
Explanation: The input is: [5,1,4,null,null,3,6]. The root node's value
             is 5 but its right child's value is 4.
 */

public class ValidBST {
	
	static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidBST  vb = new ValidBST();
		TreeNode root = new TreeNode(0);
		vb.isValidBST(root);

	}
	
	 public boolean isValidBST(TreeNode root) {
	     List<Integer> al = new ArrayList<Integer>();
	     al = inorder(root);
		 return isSorted(al);
	    }
	 
	 public List<Integer> inorder(TreeNode root){
		 if(root == null) return new ArrayList<>();
		 List<Integer> al = new ArrayList<>();
		 al.addAll(inorder(root.left));
		 al.add(root.val);
		 al.addAll(inorder(root.right));
		 return al;
	 }
	 
	 public boolean isSorted(List<Integer> al){
		 for(int i=0; i<al.size(); i++){
			 if(al.get(i) <= al.get(i-1)){
				 return false;
			 }
		 }
		 return true;
	 }
	
	

}
