package leetcode.datastructure;

import java.util.HashSet;
import java.util.Stack;

public class LinkedListImpl {
	
	Node head = null;
	
	static class Node{
		int value;
		Node next;
		
		public Node(int value){
			this.value = value;
			next = null;
		}
	}
	
	public void addNode(Node n){
		
		if(head == null){
			head = n;
			return;
		} 
		Node node = head;
		while(node.next != null){
				node = node.next;
			}	
		node.next = n;
		
	}
	
	public void printList(){
		Node node = head;
		while(node != null){
			System.out.print(node.value+" ");
			node = node.next;
		}
	}
	
	public void addAtPosition(int pos, Node n){
		if(head == null){
			head = n;
		}
		if(pos == 0){
			n.next = head;
			head = n;
		} if(pos == 1){
			n.next = head.next;
			head.next = n;
		} if(pos > 1){
			int count = 0;
			Node node = head;
			Node prev = null;
			while(node.next != null){
				prev = node;
				node = node.next;
				count++;
				
				if(count == pos){
					n.next = prev.next;
					prev.next = n;
				}
			}
		}
	}
	
	public void displayMiddleofLinkedList(){
		if(head == null){
			return;
		} 
		int count = 1;
		Node n = head;
		while(n.next != null){
			n = n.next;
			count++;
		}
		
		if(count <= 2 ){
			System.out.println("Cannot have a middle element in LinkedList");
		} 
		n = head;
		if(count > 2 && count%2 ==0){
			
			int counter = 0;
			int secondmiddle = count/2;
			int firstmiddle = count/2 - 1;
			while(n.next != null){
				n = n.next;
				counter++;
				if(counter == firstmiddle){
					System.out.println("Firstmiddle"+n.value);
					System.out.println("Second middle"+n.next.value);
					
				}
			}
		} 
		
		if(count > 2 && count%2 == 1){
			int counter = 1;
			while(n.next != null){
				n = n.next;
				counter++;
				if(counter == (count/2 + 1)){
					System.out.println("Middle element"+n.value);
				}
			}
		}
	}
	
	public void displayMiddleUsingPointers(){
		if(head == null){
			return;
		}
		Node slowP = head;
		Node fastP = head;
		while(fastP.next != null && fastP.next.next != null){
			slowP = slowP.next;
			fastP = fastP.next.next;
		}
		System.out.println("Middle:"+slowP.value);
	}
	
	public void deleteElementAtPos(int pos){
		if(head == null){
			return;
		} 
		Node n = head;
		Node prev = null;
		int counter=0;
		while(n.next != null){
			prev = n;
			n = n.next;
			counter++;
			if(pos == counter){
				prev.next = n.next;
				n.next = null;
			}
		}
	}
	
	public void reverseLinkedList(){
		
		Node current = head, next = null, prev = null;
		Node n = head;
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		head = prev;
	}
	
public void reverseLinkedListUsingStack(){
		
		Stack<Integer> st = new Stack<>();
		Node current = head;
		while(current!=null){
			st.push(current.value);
			current = current.next;
		}
		Node newHead = new Node(st.pop());
		Node cur = newHead;
		Node node;
		while(!st.isEmpty()){
			node = new Node(st.pop());
			cur.next = node;
			cur = cur.next;
			
		}
		head = newHead;
		printList();
	}
	
	public void removeDuplicateElements(){
		
		HashSet<Integer> hs = new HashSet<>();
		
		Node n = head, prev = null;
		while(n != null){
			int nval = n.value;
			if(hs.contains(nval)){
				prev.next = n.next;
			} else {
				hs.add(nval);
				prev = n;
			}
			n = n.next;
		}
	}
	
	public Node mergeList(Node l1, Node l2){
		Node temphead = new Node(0);
		Node n = head;
		
		while(l1 != null || l2 != null){
			if(l2!=null && l2!= null){
				if(l1.value < l2.value){
					temphead.next = l1;
					l1 = l1.next;
				}  else {
					temphead.next = l2;
					l2=l2.next;
				}
				temphead = temphead.next;
			} else if(l1==null){
				temphead.next = l2;
				break;
			} else if(l2 == null){
				temphead.next = l1;
				break;
			}
		}
		
		return temphead.next;
		
	}
	
	public void rotateList(int k){
		if(k==0){
			return;
		}
		Node current = head;
		int count=1;
		while(count < k && current != null){
			current = current.next;
			count++;
		}		
		if(current == null){
			return;
		}		
		Node kthNode = current;
		while(current.next != null){
			current = current.next;
			current.next = head;
			head = kthNode.next;
			kthNode.next = null;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListImpl ll = new LinkedListImpl();
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node nd = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		ll.head = n1;	
		ll.addNode(n2);
		ll.addNode(n4);
		ll.addNode(n5);
		ll.addNode(nd);
		ll.printList();
		
	/*	ll.addAtPosition(2, n3);
		System.out.println();
		ll.printList();
		System.out.println();
		ll.displayMiddleofLinkedList();
		ll.displayMiddleUsingPointers();
	//	ll.deleteElementAtPos(3);
	//	ll.printList();
		System.out.println();
		//ll.reverseLinkedList();
		//ll.printList();
		
		ll.removeDuplicateElements();
		ll.printList();
		System.out.println("Rotate");
		ll.rotateList(3);
		ll.printList();*/
		
		System.out.println("Reverse using stack");
		ll.reverseLinkedListUsingStack();
		ll.printList();

	}

}
