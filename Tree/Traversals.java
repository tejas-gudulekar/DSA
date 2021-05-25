/*
-> Level Order Traversals

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
public class Traversals{
	node root;
	
	 void levelOrder(node root) {
		 if(root == null) {
				System.out.println("reached here");
				return;
			}
		
		Queue<node> queue = new LinkedList<node>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			node currentNode = queue.poll();
			System.out.print(currentNode.data + " ");
			
			if(currentNode.left!=null) {
				queue.add(currentNode.left);
			}
			
			if(currentNode.right != null) {
				queue.add(currentNode.right);
			}
			
		}
	}
	public static void main(String[] args) {
		
		Traversals tree = new Traversals();
		
        tree.root = new node(1);
        tree.root.left = new node(2);
        tree.root.right = new node(3);
        tree.root.left.left = new node(4);
        tree.root.left.right = new node(5);
		
		tree.levelOrder(tree.root);
	
		
		
	}
	
}
