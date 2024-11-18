package RealCodes;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
	private listnode head;
	private listnode tail;
	private int length;
	  public class listnode{
		  int data;
		  listnode previous;
		  listnode next;
		  public listnode(int data) {
			  this.data = data;
		  }
		  
	  }
	  public void DisplayForward() {
		  listnode temp = head;
		  if(head == null)return;
		  while(temp != null) {
             System.out.print(temp.data+"-->"); 
			  temp = temp.next;
		  }
		  System.out.println("null"); 
	  }
	  public void DisplayBackward() {
		  listnode temp = tail;
		  if(tail == null)return;
		  while(temp != null) {
             System.out.print(temp.data+"-->"); 
			  temp = temp.previous;
		  }
		  System.out.println("null"); 
	  }
	  public void InsertBeggining(int num) {
		  listnode newnode = new listnode(num);
		  if(IsEmpty()) {tail = newnode;}
		  else {head.previous = newnode;
		  newnode.next = head;}
		  head = newnode;
		  length++;
	  }
	  public void InsertEnding(int num) {
		  listnode newnode = new listnode(num);
		  if(IsEmpty()) {head = newnode;}
		  else {tail.next = newnode;
		   newnode.previous = tail;}
		   tail = newnode;
		  length++;
	  }
	  public void DeleteFirst() {
		  length--;
		  if(IsEmpty()) {throw new NoSuchElementException();}
		  listnode temp = head;
		  if(head ==tail)tail = null;
		  else head.next.previous = null;
		  head = head.next;
		  temp.next = null;	  
	  }
	  public void DeleteLast() {
		  length--;
		  if(IsEmpty())throw new NoSuchElementException();
		  listnode temp = tail;
		  if(head ==tail)head = null;
		  else tail.previous.next = null;
		  tail = tail.next;
		  temp.previous = null;
	  }
	  public boolean IsEmpty() {return length == 0;}
	  public int length() {return length;}
         public static void main(String []args) {
        	 DoublyLinkedList dll = new DoublyLinkedList();
        	 dll.InsertBeggining(10);
        	 dll.InsertBeggining(20);
        	 dll.InsertBeggining(30);
        	 dll.InsertEnding(40);
        	 dll.InsertEnding(50);
        	 dll.InsertEnding(60);
        	 dll.DisplayForward();
        	// dll.DisplayBackward();
        	 dll.DeleteFirst();
        	 dll.DeleteLast();
        	 dll.DisplayForward();
          }
}
