package leetcode.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTree {
	
	Node root;
	
	static class Node{
		Node left;
		Node right;
		int key;
		String value;
		
		public Node(int key, String value){
			this.key = key;
			this.value = value;
		}
	}
	
	public void addNode(Node n){
		if(root == null){
			root = n;
		}else {
			Node current = root;
			while (current != null) {
			if(n.key < current.key){
				if(current.left == null){
					current.left = n;
					return;
				} else {
					current = current.left;
				}
			} else if(current.key < n.key){
				if(current.right == null){
					current.right = n;
					return;
				} else {
					current = current.right;
				}
			}
			}
		}
	}
	
	public void inOrderTraversal(Node n){
		if(n != null){
			inOrderTraversal(n.left);
			System.out.println(n.key);
			inOrderTraversal(n.right);
		}
	}
	
	public void preOrder(Node n){
		if(n != null){
			System.out.println(n.key);
			preOrder(n.left);
			preOrder(n.right);
			
		}
	}
	
	public void postOrder(Node n){
		if(n!=null){
			postOrder(n.left);
			postOrder(n.right);
			System.out.println(n.key);
		}
	}
	
	public void printAllLeafNode(Node n){
		if(n == null){
			return;
		}
		if(n.left == null && n.right == null){
			System.out.print(n.key+" ");
		}
		printAllLeafNode(n.left);
		printAllLeafNode(n.right);
	}
	
	public int findMaxElement(Node n) {
		int n_key,left,right,max = Integer.MIN_VALUE;
		if(n != null){
			n_key = n.key;
			left = findMaxElement(n.left);
			right = findMaxElement(n.right);
			
			if(left > right){
				max = left;
			} else {
				max = right;
			}
			
			if(n_key > max){
				max = n_key;
			}
		}
		
		return max;
	}

	public int findLeftMostElement(Node n){
		int left = 0;
		//if(n != null){
		while(n!=null){
			if(n.left == null && n.right == null){
				left = n.key;
			}
			n = n.left;
		}
		return left;
	}
	
	public int findRightMostElement(Node n){
		int right=0;
		while(n!=null){
			if(n.left == null && n.right == null){
				right = n.key;
			}
			n = n.right;
		}
		return right;
	}
	
	public Node searchElement(Node n, int skey){
		if(n == null || n.key == skey){
			return n;
		} 
		
		if(n.key > skey){
			return searchElement(n.left, skey);
		} 
		
		
			return searchElement(n.right, skey);
		
	}
	
	public int SizeofTree(Node n){
		
		if(n == null){
			return 0;
		} else 
		return SizeofTree(n.left)+1+SizeofTree(n.right);
		
	}
	
	public void printNodesAtGivenLevel(Node n, int level){
		if(n==null){
			return;
		}
		if(level == 1){
			System.out.println(n.value);
		} else if(level >1){
			printNodesAtGivenLevel(n.left, level-1);
			printNodesAtGivenLevel(n.right, level-1);
		}
	}
	
	public int heightOfTree(Node n){
		if(n==null){
			return 0;
		} else {
			int lheight = heightOfTree(n.left);
			int rheight = heightOfTree(n.right);
			
			if(lheight > rheight){
				return lheight+1;
			} else {
				return rheight+1;
						
			}
		} 
		
		//return 0;
	}
	
	
	
	public void printAllNodesinReverse(Node n){
		int height = heightOfTree(n);
		for(int i=height; i>=1; i--){
			printNodesAtGivenLevel(n,i);
		}
		
	}
	public static void main(String[] args) {
		
		Node n1 = new Node(54,"root");
		Node n2 = new Node(64,"ameya");
		Node n3 = new Node(44,"tanmay");
		Node n4 = new Node(89,"Vilas");
		Node n5 = new Node(78,"Vasudha");
		Node n6 = new Node(11,"CSUF");
		Node n7 = new Node(22,"Fullerton");
		
		
		BinaryTree bt = new BinaryTree();
		bt.addNode(n1);
		bt.addNode(n2);
		bt.addNode(n3);
		bt.addNode(n4);
		bt.addNode(n5);
		bt.addNode(n6);
		bt.addNode(n7);
		
		bt.preOrder(n1);
		/*bt.inOrderTraversal(n1);
		bt.postOrder(n1);*/

		bt.printAllLeafNode(n1);
		int max = bt.findMaxElement(n1);
		System.out.println("max element ="+max);
		
		int left = bt.findLeftMostElement(n1);
		System.out.println("Leftmost element is"+left);
		
		int right = bt.findRightMostElement(n1);
		System.out.println("Rightmost element is:"+right);
		
		Node search = bt.searchElement(n1,11);
		System.out.println("Search value is:"+search.value);
		
		int size = bt.SizeofTree(n1);
		System.out.println("Size of tree:"+size);
		
		System.out.println("Printing nodes level 3");
		bt.printNodesAtGivenLevel(n1, 2);
		
		int height = bt.heightOfTree(n1);
		System.out.println("Height of tree:"+height);
		
		//bt.printAllNodesinReverse(n1);
		
		bt.postOrder(n1);
		
		
	}

}
