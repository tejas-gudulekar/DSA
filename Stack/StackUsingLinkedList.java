


public class StackUsingLinkedList{
	int n;
	node top;
	node head;
	int lenght;
	
	StackUsingLinkedList(int n){
		this.n = n;
	}
	
	class node{
		int data;
		node next;
		
		node(int data){
			this.data = data;
		}
	}
	
	void push(int data) {
		if(lenght== n) {
			System.out.println("Stack Overflow!!");
			return;
		}
		node newNode = new node(data);
		if(lenght == 0) {
			head = newNode;
			top = newNode;
			lenght++;
			return;
		}
		
		top.next = newNode;
		top = newNode;
		lenght++;
	}
	
	void pop() {
		if(lenght == 0) {
			System.out.println("Stack underflow!!");
			return;
		}
		else if(lenght == 1) {
			lenght--;
			System.out.println("Poped item: " + top.data);
			head = null;
			top = null;
			return;
		}
		
		node tempNode = head;
		while(tempNode.next.next!=null) {
			tempNode = tempNode.next;
		}
		System.out.println("Poped item: " + top.data);
		tempNode.next = null;
		top = tempNode;
		lenght--;
	}
	
	void peek() {
		if(lenght ==0) {
			System.out.println("No elements in the stack");
			return;
		}
		
		System.out.println("Peek Element: " +  top.data);
	}
	
	void print() {
		if(lenght ==0) {
			System.out.println("No elements in the stack");
			return;
		}
		
		node tempNode = head;
		while(tempNode != null) {
			System.out.print(tempNode.data + " ");
			tempNode = tempNode.next;
		}
		
	}
	
	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList(5);
		stack.push(5);
		stack.push(3);
		stack.push(2);
		stack.push(8);
		stack.push(7);
		stack.push(9);
		stack.pop();
		stack.print();
		System.out.println();
		System.out.print(stack.lenght);
	}
}
