package leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CheckLinkedListCycle {
	
	class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		         next = null;
		      }
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean hasCycle(ListNode head) {
	        if(head == null) return false;
	        if(head.next == null) return false;
	        List<ListNode> al = new ArrayList<>();
	        
	        while(head != null){
	            al.add(head);
	            head= head.next;
	            if(al.contains(head))
	                return true;
	        }
	        return false;
	        
	    }

}
