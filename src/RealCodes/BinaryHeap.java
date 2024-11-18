package RealCodes;
/*
 binaryheaps are implemented using array
 it is a complete binary tree
 traversing left to right
 
 */
public class BinaryHeap {
private Integer[] heap;
private int n;
public BinaryHeap(int capacity) {
	heap = new Integer[capacity+1];
	n = 0;
}
public boolean IsEmpty() {
	return n == 0;
}
public int size() {
	return n;
}
public void Insert(int x) {
	if(n == heap.length-1) {
		resize(2*heap.length);
	}
	n++;
	heap[n] = x;
	swim(n);
}
private void swim(int k) {
	while(k>1 && heap[k/2] < heap[k]) {
		int temp = heap[k];
		heap[k] = heap[k/2];
		heap[k/2] = temp;
		k = k/2;
	}
}
public void resize(int capacity) {
	Integer[] temp = new Integer[capacity];
	for(int i =0; i<heap.length; i++)temp[i] = heap[i];
	heap = temp;
}
public void PrintMaxHeap() {
	for(int i = 1 ;i <= n ;i++) {
		System.out.print(heap[i]+" ");
	}
	   System.out.println(" ");
}
public int DeleteMaxHeap() {
 int max = heap[1];
 swap(1,n);
 n--;
 sink(1);
heap[n+1] = null;
if(n>0 && n ==(heap.length-1)/4)resize(heap.length/2);
return max;
}
private void sink(int k) {
	while(2*k <= n) {
		int j = 2*k;
		if(j < n && heap[j] < heap[j+1])j++;
		if(heap[k] > heap[j]) break;
		swap(k,j);
		k = j;
	}
	
}
public void swap(int a, int b) {
	int temp = heap[a];
	heap[a] = heap[b];
	heap[b] = temp;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BinaryHeap bh = new BinaryHeap(3);
        bh.Insert(4);
        bh.Insert(5);
        bh.Insert(2);
        bh.Insert(6);
        bh.Insert(1);
        bh.Insert(3);
        System.out.println(bh.size());
        bh.PrintMaxHeap();
        bh.DeleteMaxHeap();
        bh.PrintMaxHeap();
	}

}
