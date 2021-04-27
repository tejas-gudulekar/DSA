/*
Implementing Queue using LinkedList
*/
class node{
	node next;
	int data;
	node(int data){
		this.data = data;
	}
}

public class Queue{
	node front;
	node rear;
	
	void enqueue(int data) {
		node newNode = new node(data);
		
		if(front==null) {
			front = newNode;
			rear = newNode;
			return;
		}
		
		rear.next = newNode;
		rear = newNode;
	}
	
	void dequeue() {
		if(front==null) {
			System.out.println("Queue is empty");
		}
		else if(front==rear) {
			front = null;
			rear = null;
		}
		else {
			front = front.next;
		}
	}
	
	void print() {
		if(front==null) {
			System.out.println("Queue is empty");
			return;
		}
		
		node tempNode = front;
		while(tempNode!=null) {
			System.out.print(tempNode.data + " ");
			tempNode = tempNode.next;
		}
	}
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.print();
	}
}
