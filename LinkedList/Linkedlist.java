/*
Implementation of linkedlist with single pointer head
*/

class node{
	int data;
	node next; //initially null
	
	//setting the data by user defined constructor
	node(int data){
		this.data = data;
	}
}


public class Linkedlist{
	node head;
	int length = 0;
	
	 void prepend(int data) {
		node newNode = new node(data);
		
		if(head == null) {
			head = newNode;
			length++;
			return;
		}
		
		newNode.next = head;
		head = newNode;
		length++;
	}
	 
	void append(int data) {
		node newNode = new node(data);
		if(head == null) {
			head = newNode;
			length++;
			return;
		}
		
		node tempNode = head;
		
		while(tempNode.next != null) {
			tempNode= tempNode.next;
		}
		
		tempNode.next = newNode;
		length++;
	}
	
	void print() {
		node tempNode = head;
		
		while(tempNode!=null) {
			System.out.print(tempNode.data + " ");
			tempNode = tempNode.next;
		}
	}
	
	void insert(int pos,int data) {
		if(pos<0 || pos>length) {
			System.out.println("Invalid index");
			return;
		}
		else if(pos==0) {
			prepend(data);
			return;
		}
		else if(pos==length) {
			append(data);
		}
		else {
			node newNode = new node(data);
			node tempNode = head;
			int i=0;
			while(i<pos-1) {
				tempNode = tempNode.next;
				i++;
			}
			
			newNode.next = tempNode.next;
			tempNode.next = newNode;
			length++;
		}
	}
	int delete(int pos) {
		if(pos<0 || pos>length-1) {
			System.out.println("Invalid index");
			return -1;
		}
		else if(pos==0 && length==1) {
			int data = head.data;
			head = null;
			length--;
			return data;
		}
		else if(pos==0) {
			int data = head.data;
			head = head.next;
			length--;
			return data;
		}
		else {
			int i=0;
			node tempNode = head;
			while(i<pos-1) {
				tempNode = tempNode.next;
				i++;
			}
			int data = tempNode.next.data;
			tempNode.next = tempNode.next.next;
			length--;
			return data;
		}
	}
	public static void main(String[] args) {
		Linkedlist list = new Linkedlist();
		
		list.append(0);
		list.append(2);
		list.append(4);
		list.append(6);
		list.prepend(1);
		list.insert(1, 2);
		list.insert(0, 2);
		list.insert(3, 7);
		list.insert(8, 10);
		list.delete(0);
		list.delete(2);
		list.delete(3);
		list.delete(5);
		
		list.print();
		System.out.println("lenght: " + list.length);
		
		
	}
}

