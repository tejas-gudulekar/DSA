
import java.util.Scanner;

class StackUsingArray{
	int[] stackArray;
	int top;
	int n;
	StackUsingArray(int n){
		this.n = n;
		stackArray = new int[n];
		top = -1;
	}
	
	void peek() {
		if(top == -1) {
			System.out.println("No elements in the stack");
			return;
		}
		System.out.println("Peek Element: " + stackArray[top]);
	}
	
	void push(int data) {
		if(top == n-1) {
			System.out.println("Stack OverFlow!!");
			return;
		}
		top++;
		stackArray[top] = data;
	}
	
	void pop() {
		if(top==-1) {
			System.out.println("Stack underflow!!");
			return;
		}
		System.out.println("Item popped: " + stackArray[top]);
		top--;
	}
	
	void print() {
		if(top==-1) {
			System.out.println("Empty stack!!");
			return;
		}
		
		for(int i = top;i>=0;i--) {
			System.out.print(stackArray[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("Enter stack size: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		StackUsingArray stack = new StackUsingArray(n);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.pop();
		stack.print();
	}
}
