


public class CircularQueue{
	int front;
	int rear;
	int[] array;
	int n;
	
	CircularQueue(int n){
		this.array = new int[n];
		this.n = n;
		front = -1;
		rear = -1;
	}
	
	void enqueue(int data) {
		if((rear==n-1&&front==0) || (rear==front-1)) {
			System.out.println("Queue is full!!");
		}
		else if(front==-1&&rear==-1) {
			front = 0;
			rear = 0;
			array[rear] = data;
		}
		else if(rear==n-1 && front!= 0) {
			rear = 0;
			array[rear] = data;
		}
		else {
			rear++;
			array[rear] = data;
		}
	}
	
	void print() {
		if(front<=rear) {
			for(int i=front;i<=rear;i++) {
				System.out.print(array[i] + " ");
			}
		}
		else {
			for(int i=front;i<n;i++) {
				System.out.print(array[i] + " ");
			}
			for(int i=0;i<front;i++) {
				System.out.print(array[i] + " ");
			}
		}
		
		System.out.println();
	}
	
	void dequeue() {
		if(front==-1 && rear==-1) {
			System.out.println("Queue is empty!!");
		}
		else if(front==rear) {
			System.out.println("Poped element: " + array[front]);
			front = -1;
			rear = -1;
		}
		else if(front==n-1) {
			System.out.println("Poped element: " + array[front]);
			front = 0;
		}
		else {
			System.out.println("Poped element: " + array[front]);
			front++;
		}
	}
	
	public static void main(String[] args) {
		CircularQueue q = new CircularQueue(6);
		q.enqueue(5);
		q.enqueue(7);
		q.enqueue(9);
		q.enqueue(11);
		q.enqueue(13);
		q.enqueue(15);
		q.dequeue();
		q.enqueue(0);
		q.dequeue();
		q.enqueue(3);
		q.print();
		System.out.println("front: " + q.front + " rear: " +  q.rear);
	}
}
