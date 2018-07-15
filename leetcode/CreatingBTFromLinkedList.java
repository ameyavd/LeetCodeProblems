package leetcode;


public class CreatingBTFromLinkedList {
	
	/**
	 * Definition for singly-linked list. */
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 
	/**
	 * Definition for a binary tree node.*/
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	public TreeNode sortedListToBST(ListNode head) {
	       if(head == null) return null;
	       return helper( head, null);
	    }
	    
	    
	    public TreeNode helper(ListNode head, ListNode tail){
	       ListNode fast = head, slow = head;
	        if(head == tail) return null;
	        while(fast!=tail && fast.next!=tail){
	            fast = fast.next.next;
	            slow = slow.next;
	        }
	        TreeNode thead = new TreeNode(slow.val);
	        thead.left = helper(head,slow);
	        thead.right = helper(slow.next,tail);
	        return thead;
	    }
	

}
