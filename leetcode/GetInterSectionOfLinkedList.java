package leetcode;

public class GetInterSectionOfLinkedList {
	
	public class ListNode {
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
	
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        if(headA == null || headB == null) return null;
	        ListNode a = headA;
	        ListNode b = headB;
	        while(a != b){
	            if(a == null)
	                a = headB;
	             else 
	              a = a.next;
	            
	            if(b == null)
	                b = headA;
	             else 
	              b = b.next;
	        }  
	               
	        return a;
	    }

}
