/*
Stack using linkedlist
*/

class node{
	int data;
	node next;
	node(int data){
		this.data = data;
	}
}

public class Stack{
	node top;
	int pos=-1;
	int length;
	
	Stack(int length){
		this.length = length;
	}
	
	void push(int data) {
		if(pos==length-1)
		{
			System.out.println("Stack Overflow");
			return;
		}
		
		node newNode = new node(data);
		newNode.next = top;
		top = newNode;
		pos++;
	}
	
	int pop() {
		if(pos==-1) {
			System.out.println("Stack underflow");
			return -1;
		}
		int data = top.data;
		top = top.next;
		pos--;
		return data;
	}
	
	int peek() {
		if(pos==-1) {
			System.out.println("Empty Stack");
			return -1;
		}
		
		return top.data;
	}
	
	int search(int data) {
		node tempNode = top;
		int i = 0;
		while(tempNode.next!=null && tempNode.data!=data) {
			tempNode = tempNode.next;
			i++;
		}
		
		if(tempNode.data == data) {
			return i;
		}
		
		return -1;
	}
	
	void print() {
		node tempNode = top;
		while(tempNode!=null) {
			System.out.print(tempNode.data + " ");
			tempNode = tempNode.next;
		}
	}
	public static void main(String[] args) {
		Stack s = new Stack(5);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
//		s.pop();
//		s.pop();
//		s.pop();
//		s.pop();
//		
//		int p = s.peek();
//		System.out.print(p);
//		
//		s.pop();
//		s.pop();
		//s.print();
		System.out.println(s.search(1));
	}
}
