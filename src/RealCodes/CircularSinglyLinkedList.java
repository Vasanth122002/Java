package RealCodes;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
	private listnode last;
	private int length;
	public class listnode{
		private int data;
		private listnode next;
		public listnode(int data) {this.data = data;}
	}
	public void Display() {
		if(last == null)return;
		listnode first = last.next;
		while(first != last) {
			System.out.print(first.data+"-->");
			first = first.next;
		}
		System.out.println(first.data+" ");
	}
	public void InsertBeginning(int num) {
		listnode temp = new listnode(num);
		if(last == null)last =temp;
		else temp.next = last.next;
		last.next = temp;
		length++;
	}
	public void InsertEnd(int num) {
		length++;
		listnode temp = new listnode(num);
		if(last == null) {last = temp;last.next = last;}
		else {temp.next = last.next;last.next = temp;last = temp;}
	}
	public void RemoveFirst() {
		if(IsEmpty())throw new NoSuchElementException("CircularSinglyLinkedList is empty ");
		listnode temp = last.next;
		if(last.next == last)last = null;
		else last.next = temp.next;
		temp.next = null;
		length--;
		
	}
	public int length() {return length;}
	public boolean IsEmpty() {return length == 0;}
	public CircularSinglyLinkedList() {
		length =0;
		last = null;
	}
       public static void main(String args[]) {
    	   CircularSinglyLinkedList cll = new  CircularSinglyLinkedList();
        	cll.InsertBeginning(15);
        	cll.InsertBeginning(14);
        	cll.InsertBeginning(11);
        	cll.InsertEnd(20);
        	cll.InsertEnd(40);
        	cll.InsertEnd(50);
        	cll.Display();
        	cll.RemoveFirst();
        	cll.Display();
        
        }
}
