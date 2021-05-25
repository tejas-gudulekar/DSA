/*
Implementation of binary search tree using recursion
*/

class node{
	node left;
	node right;
	int data;
	
	node(int data){
		this.data = data;
	}
}

public class BinarySearchTree{
	node root;
	
	void insert(int data) {
		root = insertRec(root,data);
	}
	
	node insertRec(node root, int data){
		if(root==null) {
			root = new node(data);
			return root;
		}
		
		if(data < root.data) {
			root.left = insertRec(root.left, data);
		}
		
		if(data > root.data) {
			root.right = insertRec(root.right, data);
		}
		
		return root;
	}
	
	
	boolean containsKey(int data, node root) {
		if(root == null) {
			return false;
		}
		
		if(root.data == data) {
			return true;
		}
		else if(data < root.data) {
			return containsKey(data, root.left);
		}
		else {
			return containsKey(data, root.right);
		}
		
	}
	
	int max(node root) {
		if(root.right != null) {
			return max(root.right);
		}
		else {
			return root.data;
		}
		
	}
	
	void inOrder(node root) {
		if(root==null) return;
		
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	node remove(node root, int data) {
		if(root == null) return null;
		
		if(data < root.data) {
			root.left = remove(root.left, data);
		}
		else if( data > root.data) {
			root.right = remove(root.right, data);
		}
		else {
			if(root.left != null && root.right != null) {
				int lmax = max(root.left);
				root.data = lmax;
				root.left = remove(root.left, lmax);
				return root;
				
			}
			else if(root.left != null) {
				return root.left;
			}
			else if(root.right != null) {
				return root.right;
			}
			else {
				return null;
			}
		}
		return root;
		
	}
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insert(50);
		bst.insert(25);
		bst.insert(75);
		bst.insert(10);
		bst.insert(40);
		bst.insert(60);
		bst.insert(90);
		bst.insert(5);
		bst.insert(30);
		bst.insert(45);
		bst.insert(70);
		bst.insert(80);
		bst.insert(95);
		bst.insert(43);
	
		bst.remove(bst.root, 75);
		bst.inOrder(bst.root);
		
	}
	
	
}
