/*
MinHeap Implementation using Array
*/

public class MinHeap{
	int[] minHeap = new int[25];
	int size = 0;
	
	//get index
	int getLeftIndex(int parentIndex) { return (2*parentIndex) + 1; };
	int getRightIndex(int parentIndex) { return (2*parentIndex) + 2;};
	int getParentIndex(int childIndex) { return (int) Math.floor((double)(childIndex-1)/2);};
	
	//contains
	boolean hasLeft(int parentIndex) { return getLeftIndex(parentIndex) < size; };
	boolean hasRight(int parentIndex) { return getRightIndex(parentIndex) < size; };
    boolean hasParent(int childIndex) { return getParentIndex(childIndex) >= 0;};
    
    //return value
    int getLeft(int parentIndex) { return minHeap[getLeftIndex(parentIndex)]; };
    int getRight(int parentIndex) { return minHeap[getRightIndex(parentIndex)]; };
    int getParent(int childIndex) { return minHeap[getParentIndex(childIndex)]; };
    
    //swap method
    void swap(int indexOne, int indexTwo) {
    	int temp = minHeap[indexOne];
    	minHeap[indexOne] = minHeap[indexTwo];
    	minHeap[indexTwo] = temp;
    }
    
    void pool() {
    	if(size==0) { return; };
    	
    	minHeap[0] = minHeap[size-1];
    	size--;
    	heapifyDown();
    }
    
 
    void add(int data) {
    	minHeap[size] = data;
    	size++;
    	heapifyUp();
    }
    
    void heapifyUp() {
    	int index = size - 1;
    	while(hasParent(index) && minHeap[index] < getParent(index)) {
    		swap(index,getParentIndex(index));
    		index = getParentIndex(index);
    	}
    }
    
    void heapifyDown() {
    	int index = 0;
    	while(hasLeft(index)) {
    		int smallerChildIndex = getLeftIndex(index);
    		
    		if(hasRight(index) && minHeap[smallerChildIndex] > minHeap[getRightIndex(index)]) {
    			smallerChildIndex = getRightIndex(index);
    		}
    		
    		if( minHeap[index] < minHeap[smallerChildIndex] ) {
    			break;
    		}
    		else {
    			swap(index,smallerChildIndex);
    			index = smallerChildIndex;
    		}
    	}
    }
    
    void print() {
    	for(int i=0;i<size;i++) {
    		System.out.print(minHeap[i] + " ");
    	}
    }
    
    
    public static void main(String[] args) {
		MinHeap min = new MinHeap();
		min.add(2);
		min.add(4);
		min.add(8);
		min.add(9);
		min.add(7);
		min.add(10);
		min.add(9);
		min.add(15);
		min.add(20);
		min.add(13);
		
		min.pool();
		min.pool();
		min.pool();
		min.pool(); 
		min.print();
	
	}
}
