


public class Queue{
	node front;
	node rear;
	int lenght;
	
	class node{
		node next;
		int data;
		
		node(int data){
			this.data = data;
		}
	}
	
	void enqueue(int data) {
		node newNode = new node(data);
		
		if(lenght == 0) {
			front = newNode;
			rear = newNode;
			lenght++;
			return;
		}
		
		rear.next = newNode;
		rear = newNode;
		lenght++;
	}
	
	void dequeue() {
		if(lenght==0) {
			System.out.println("Queue is empty");
			return;
		}
		else if(lenght==1) {
			System.out.println("Dequeue Element: " + front.data);
			front=null;
			rear=null;
			lenght--;
			return;
		}
		System.out.println("Dequeue Element: " + front.data);
		front = front.next;
		lenght--;
	}
	
	void peek() {
		if(lenght==0) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.println("Peek Element: " + front.data);
	}
	
	void print() {
		if(lenght == 0) {
			System.out.println("Queue is empty");
			return;
		}
		node tempNode = front;
		while(tempNode!=null) {
			System.out.print(tempNode.data + " ");
			tempNode = tempNode.next;
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(5);
		queue.enqueue(7);
		queue.enqueue(9);
		queue.peek();		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		System.out.print(queue.lenght);
		queue.print();
		System.out.println(queue.front + " " + queue.rear);
	}
}
