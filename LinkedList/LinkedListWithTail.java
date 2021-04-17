public class LinkedListWithTail{
	node head;
	node tail;
	int length;
	
	class node{
		int data;
		node next;
		
		node(int data){
			this.data = data;
		}
	}
	
	void append(int data) {
		node newNode = new node(data);
		if(length == 0) {
			head = newNode;
			tail = newNode;
			length++;
			return;
		}
		
		tail.next = newNode;
		tail=newNode;
		length++;
	}
	
	void prepend(int data) {
		node newNode = new node(data);
		if(length == 0) {
			head = newNode;
			tail = newNode;
			length++;
			return;
		}
		
		newNode.next = head;
		head = newNode;
		length++;
	}
	
	void insert(int position, int data) {
		if(position<0 || position > length) {
			System.out.println("Invalid Index");
			return;
		}
		else if(position == 0) {
			prepend(data);
			return;
		}
		else if(position == length) {
			append(data);
			return;
		}
		else {
			node tempNode = head;
			node newNode = new node(data);
			for(int i=1;i<position;i++) {
				tempNode = tempNode.next;
			}
			
			newNode.next = tempNode.next;
			tempNode.next = newNode;
		}
	}
	
	void delete(int position) {
		if(position == 0 && length == 1) {
			head = null;
			tail = null;
			length--;
			return;
		}
		else if(position==0) {
			head = head.next;
			length--;
			return;
		}
		else if(position == length-1) {
			node tempNode = head;
			for(int i=1;i<position;i++) {
				tempNode = tempNode.next;
			}
			tail = tempNode;
			tail.next = null;
			length--;
			return;
		}
		else {
			node tempNode = head;
			for(int i=1;i<position;i++) {
				tempNode = tempNode.next;
			}
			
			tempNode.next = tempNode.next.next;
			length--;
			return;
			
		}
	}
	
	
	void print() {
		if(length == 0) {
			System.out.println("No node in the linkedlist");
			return;
		}
		
		node tempNode = head;
		while(tempNode!=null) {
			System.out.print(tempNode.data + " ");
			tempNode = tempNode.next;
		}
		System.out.println();
	}
	
	LinkedList reverseList() {
		LinkedList newList = new LinkedList();
		node tempNode = this.head;
		while(tempNode!=null) {
			newList.prepend(tempNode.data);
			tempNode = tempNode.next;
		}
		return newList;
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.append(1);
		list.append(3);
		list.prepend(13);
		list.insert(2, 12);
		list.delete(1);
		list.print();
		LinkedList revList = list.reverseList();
		revList.print();
  }
}
