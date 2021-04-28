/*
Impelementing circular queue using array
Note: The element remains present in the array after dequeue but with the help of front and rear we cannot access it after dequeue
*/

public class CircularQueue{
	int front = -1;
	int rear = -1;
	int[] queue;
	int n;
	
	CircularQueue(int n){
		queue = new int[n];
		this.n = n;
	}
	
	void enqueue(int e) {
		//check if queue is full
		if((rear==n-1 && front==0) || rear == front-1) {
			System.out.println("Queue is full");
		}
		//Check if it is empty
		else if(front==-1 && rear==-1) {
			front++;
			rear++;
			queue[rear] = e;
		}
		//Check if rear is pointing to last and queue is not full
		else if(rear==n-1 && front!=0) {
			rear=0;
			queue[rear] = e;
		}
		//Else follow normal
		else {
			rear++;
			queue[rear] = e;
		}
	}
	
	int dequeue() {
		int data;
		//If queue is empty
		if(front==-1 && rear==-1) {
			return -1;
		}
		//Else if it has only one element
		else if(front==rear) {
			data = queue[front];
			front = -1;
			rear = -1;
			return data;
		}
		//If front is at n-1, then take front to 0
		else if(front==n-1) {
			data = queue[front];
			front = 0;
			return data;
		}
		//Else normal condition
		else {
			data = queue[front];
			front++;
			return data;
		}
	}
	
	void print() {
		if(front==-1) {
			System.out.println("queue is empty");
		}
		else if(front<=rear) {
			for(int i=front;i<=rear;i++) {
				System.out.print(queue[i] + " ");
			}
		}
		else {
			//front > rear
			for(int i=front;i<n;i++) {
				System.out.print(queue[i] + " ");
			}
			
			for(int i=0;i<=rear;i++) {
				System.out.print(queue[i] + " ");
			}
		}
	}
	public static void main(String[] args) {
		CircularQueue q = new CircularQueue(5);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.dequeue();
		q.enqueue(6);
		q.dequeue();
		q.enqueue(7);
		q.enqueue(0);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.print();
	}
}
