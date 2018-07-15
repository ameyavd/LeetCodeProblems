package leetcode.amazon;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKList {
	
	/**
	 * Definition for singly-linked list.*/
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode mergeKLists(ListNode[] lists) {
		 if(lists == null || lists.length == 0) return null;
		 
		 ListNode head = new ListNode(0);
		 ListNode tail = head;
		 
		 PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>(){
			 @Override
			 public int compare(ListNode o1, ListNode o2){
				 if(o1.val < o2.val)
					 return -1;
				 if(o1.val == o2.val)
					 return 0;
				 else
					 return 1;
			 }
		 });
		 
		 for(ListNode node : lists){
			 queue.add(node);
		 }
		 
		 while(!queue.isEmpty()){
			 tail.next= queue.poll();
			 tail = tail.next;
			 
			 if(tail.next != null){
				 queue.add(tail.next);
			 }
		 }
		 
		 
		 return head.next;
		 
	}

}
