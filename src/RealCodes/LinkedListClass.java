package RealCodes;

import java.util.Iterator;
import java.util.LinkedList;

/*
 contains duplicates. maintain insertion order.no synchronized.
 */
public class LinkedListClass {
class Book{
	int id;
	int price;
	public Book(int id, int price) {
		this.id = id;
		this.price = price;
	}
}
	public static void main(String[] args) {
		// objects to linkedlist
		 LinkedListClass llc = new  LinkedListClass();
		 Book b1 = llc.new Book(1,100);
		 Book b2 = llc.new Book(2,200);
		 Book b3 = llc.new Book(3,300);
		 Book b4 = llc.new Book(4,400);
		 LinkedList<Book> llo = new LinkedList();
		llo.add(b1);
		llo.add(b2);
		llo.add(b3);
		llo.add(b4);
		System.out.println("Book class to LinkedList...");
		for(Book bb : llo)System.out.println("Book Id is : "+bb.id+" Book Price is : "+bb.price);
		
		LinkedList<String> ll = new LinkedList();
		System.out.println("Initial list of elements "+ll);
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		System.out.println("After list of elements "+ll);
		ll.add(1, "Gaurav");
		System.out.println("After Adding specific(1) position "+ll);
		LinkedList<String> ll1 = new LinkedList();
	         ll1.add("sonoo");
	         ll1.add("Hanumat");
	         
	         //Adding linkedlist to another linkedlist
	      ll.addAll(2, ll1);         
	      System.out.println("After Adding specific(1) position of another linkedlist "+ll);   
	      ll.addFirst("Lokesh");
	      System.out.println("After Adding first positionin the linkedlist "+ll);
	      ll.addLast("Harash");
	      System.out.println("After Adding last position in the linkedlist "+ll);
	      ll.remove();   
	      System.out.println("After removing head  in the linkedlist "+ll);
	      ll.remove(0);
	      System.out.println("After removing index  position in the linkedlist "+ll);
	      ll.remove("Vijay");
	      System.out.println("After removing object in the linkedlist "+ll);
	      ll.removeAll(ll1);
	      System.out.println("After removing another linkedlist in the linkedlist "+ll);
	      System.out.println("Printing the LinkedList in the Desending using descendingIterator()");
	      Iterator<String> i = ll.descendingIterator();
	      while(i.hasNext()) {
	    	  System.out.println(i.next());  
	      }
	}

}
