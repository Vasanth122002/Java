package javavideosonline;

public class LinkedList {
	private static listnode head;
	 private static class listnode{
		 private int data;
		 private listnode next;
		 public listnode(int data) {
			 this.data = data;
			 this.next = null;
		                               }

		 } 
	 public void display() {
		  listnode current = head;
                         while(current!=null) {
       	                       System.out.print(current.data +"-->");
       	                        current = current.next;
                                               }
                         System.out.print("null");
	                 }
	 public static int NumberOfNodes() {
		 int count = 0;
		  listnode current = head;
		  while(current!=null) {
                   count++;
                   current = current.next;
                              }
		  return count;
		 
	 }
         public  static	void main(String args[]) {
		LinkedList sl = new LinkedList ();
		sl.head = new listnode(10);
		listnode second = new listnode(20);
		sl.head.next = second;
		sl.display();
		System.out.println(" ");
		int nodes = NumberOfNodes();
		System.out.print("NumberOfNodes are "+nodes);
	}  

}
