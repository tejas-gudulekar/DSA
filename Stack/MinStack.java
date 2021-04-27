/*
It is a special stack which returns the minimum value within the stack in O(1) time and space
*/

public class MinStack{
	int min;
	int top=-1;
	int[] arr;
	
	MinStack(int n){
		arr = new int[n];
	}
	
	void push(int x) {
		if(top==arr.length-1) {
			System.out.println("Stack Overflow");
		}
		else if(top==-1) {
			top++;
			arr[top] = x;
			min = x;
			return;
		}
		else {
			if(x<min) {
				top++;
				arr[top] = 2*x-min;
				min = x;
			}
			else {
				top++;
				arr[top] = x;
			}
			
		}
	}
	
	void pop() {
		if(top==-1) {
			System.out.println("Stack underflow");
			return;
		}
		else {
			int y = arr[top];
			if(y<min) {
				min = 2 * min - y;
				top--;
			}
			else {
				top--;
			}
		}
	}
	
	int getMin() {
		return min;
	}
	
	public static void main(String[] args) {
		MinStack s = new MinStack(5);
		s.push(2);
		s.push(5);
		s.push(1);
		s.push(10);
		s.push(0);
		s.pop();
		s.pop();
		s.pop();
		
		System.out.println(s.getMin());
	}
	
}
