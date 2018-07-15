package leetcode.amazon;

import java.util.HashMap;

public class DeepCopyOfLinkedList {

	/**
	 * Definition for singly-linked list with a random pointer.
	 */
	class RandomListNode {
		int label;
		RandomListNode next, random;

		RandomListNode(int x) {
			this.label = x;
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public RandomListNode copyRandomList(RandomListNode head) {
		RandomListNode curr = head;
		HashMap<Integer, Integer> map = new HashMap<>();
		while (curr != null) {
			if (curr.random != null)
				map.put(curr.label, curr.random.label);
			else
				map.put(curr.label, -1);

			curr = curr.next;
		}

		RandomListNode newHead = new RandomListNode(head.label);
		curr = newHead;
		RandomListNode node;
		while (curr != null) {
			if(map.get(curr.label) != -1){
			node = new RandomListNode(map.get(curr.label));
			curr.next=node;
			curr=curr.next;
			} else {
			node = new RandomListNode(map.get(curr.label));
			curr.next = null;
			}
		}

		return newHead;
	}

}
