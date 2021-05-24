/*
Implementation of binary tree , preOrder , postOrder, and inOrder traversal;
*/
import java.util.*;

class node{
	node left;
	node right;
	int data;
	
	node(int data){
		this.data = data;
	}
}

public class BinaryTree{
	static Scanner sc = null;
	
	//create tree in a single time
	static node createTree() {
		node root = null;
		
		System.out.print("Enter data: ");
		int nodeData = sc.nextInt();
		
		if(nodeData == -1) {
			return root;
		}
		
		root = new node(nodeData);
		
		System.out.println("Enter left node of " + nodeData );
		root.left = createTree();
		
		System.out.println("Enter right node of " + nodeData );
		root.right = createTree();
		
		return root;
	}
	
	
	static void inOrder(node root) {
		if(root==null) return;
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	static void preOrder(node root) {
		if(root==null) return;
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	static void postOrder(node root) {
		if(root == null) return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		node root = createTree();
		

		inOrder(root);

		postOrder(root);

		preOrder(root);
		
	}
}

