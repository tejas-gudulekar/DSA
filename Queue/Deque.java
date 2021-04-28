/*
 * Impelemnting deque using circular Array
 * Deque is a special queue which allows insertion and deletion from both end
*/



public class Deque{
	int front = -1;
	int rear = -1;
	int n;
	int[] deque;
	
	Deque(int n){
		this.n = n;
		deque = new int[n];
	}
	
	boolean isFull() {
		if((front==0 && rear==n-1) || rear == front-1) {
			return true;
		}
		return false;
	}
	
	boolean isEmpty() {
		if(front==-1) {
			return true;
		}
		return false;
	}
	
	void addRear(int e) {
		if(isFull()) {
			System.out.println("Queue is fulll");
		}
		//No element
		else if(isEmpty()){
			front = 0;
			rear = 0;
			deque[rear] = e;
		}
		//If rear is pointing to rear-1 
		else if(rear==n-1 && front!=0) {
			rear = 0;
			deque[rear] = e;
		}
		else {
			rear++;
			deque[rear] = e;
		}
	}
	
	void addFront(int e) {
		if(isFull()) {
			System.out.println("Queue is Full");
		}
		else if(isEmpty()) {
			front = 0;
			rear = 0;
			deque[front] = e;
		}
		else if(front == 0 && rear != n-1) {
			front = n-1;
			deque[front] = e;
		}
		else {
			front--;
			deque[front] = e;
		}
	}
	
	int removeFront() {
		int data;
		if(isEmpty()) {
			return -1;
		}
		else if(front==rear) {
			data = deque[front];
			front = -1;
			rear = -1;
			return data;
		}
		else if(front == n-1) {
			data = deque[front];
			front = 0;
			return data;
		}
		else {
			data = deque[front];
			front++;
			return data;
		}
	}
	
	int removeRear() {
		int data;
		if(isEmpty()) {
			return -1;
		}
		else if(front==rear) {
			data = deque[rear];
			front = -1;
			rear = -1;
			return data;
		}
		else if(rear==0) {
			data = deque[rear];
			rear = n-1;
			return data;
		}
		else {
			data = deque[rear];
			rear--;
			return data;
		}
	}
	
	void print() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else if(front<=rear) {
			for(int i=front;i<=rear;i++) {
				System.out.print(deque[i] + " ");
			}
		}
		else {
			for(int i=front;i<n;i++) {
				System.out.print(deque[i] + " ");
			}
			
			for(int i=0;i<=rear;i++) {
				System.out.print(deque[i] + " ");
			}
			
		}
	}
	public static void main(String[] args) {
		Deque d = new Deque(5);
	
		//Testing addFront
//		d.addFront(0);
//		d.addFront(1);
//		d.addFront(2);
//		d.addFront(3);
//		d.addFront(4);
//		d.addFront(5);
		
		
		//Testing addRear
//		d.addRear(0);
//		d.addRear(1);
//		d.addRear(2);
//		d.addRear(3);
//		d.addRear(4);
//		d.addRear(5);
//		d.removeFront();
//		d.addRear(5);
//		d.print();
		
		//Testing removeFront
//		d.removeFront();
//		d.addFront(0);
//		d.addFront(1);
//		d.addFront(2);
//		d.removeFront();
//		d.print();
		
		//Testing removeRear;
		d.removeRear();
		d.addRear(0);
		d.addFront(1);
		d.addFront(2);
		d.addFront(3);
		d.removeRear();
		d.removeRear();
		d.print();
		}
}
