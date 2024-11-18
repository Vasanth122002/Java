package RealCodes;
public class SiglyLinkedList{
	 int count = 0;
	private   listnode head;
	 private  class listnode{
		 private int data;
		 private listnode next;
		 public listnode(int data) {
			 this.data = data;
			 this.next = null;
			 count++;
		                               }

		 } 
	 public void display(listnode head) {
		  listnode current = head;
                         while(current!=null) {
       	                       System.out.print(current.data +"-->");
       	                        current = current.next;
                                               }
                         System.out.print("null");
	                 }

	 public void InsertAtTheBeggining(int num) {
		 listnode newNode = new listnode(num);
			newNode.next =head;
			head = newNode;
	 }
	 public void InsertAtTheEnding(int num) {
		 listnode newNode = new listnode(num);
		 if(head == null) {head = newNode;return;}
		 listnode current = head;
		 while(current.next!=null) 
		                  {
			                current = current.next;        
		                  }
		 current.next=newNode;
	 }
	 public void InsertAtThePosition(int num,int position) {
				 if(count ==0) {InsertAtTheBeggining(num);}
				 else
				 { listnode newNode = new listnode(num);
				 listnode previous = head;
				    int count =1;
				    while(count<position-1) {
				    	previous = previous.next;
				    	count++;
				    	                    }
				 listnode current = previous.next;
				 newNode.next = current;
				 previous.next = newNode;
				 }
				 
	 }
	 public listnode DeleteFirst() {
		 count--;
		 if(head == null) return null;
		 listnode temp = head;
		 head = head.next;
		 return temp;
	 }
	 public listnode DeleteLast() {
		 listnode current = head;
		 listnode previous = null;
		 count--;
		 if(head == null || head.next ==null) { return head;}
		 while(current.next != null) {
			 previous =current;
			 current = current.next;
		 }
		 previous.next = null;
		 return current;
	 }
	 public void DeleteAtPosition(int position) {
		 count--;
		 if(position == 1)head = head.next;
		 else {
			 listnode previous = head;
			 int count =1;
			 while(count<position-1) {
				 previous = previous.next;
				 count++;
			 }
			 listnode current = previous.next;
			 previous.next = current.next;
		 }
	 }
	 public String IsPresent(int key) {
		 listnode current = head;
		 while(current != null) {
			 if(key==current.data)return"YES";
			 current = current.next;
		 }
		 return "NO";
	 }
	 public listnode ReverseLinkedList(listnode head) {
		 listnode current = head;
		 listnode previous = null;
		 listnode next = null;
		 while(current != null) {
			 next = current.next;
			 current.next = previous;
			 previous =  current;
			 current = next;
		 }
		 return previous;
	 }
	 public listnode NthNodeFromLast(int node , listnode head) {
		 listnode mainptr = head;
		 listnode refptr = head;
		 int count = 0;
		 while(count < node) {
			 refptr = refptr.next;
			 count++;
		 }
		 while(refptr != null) {
			 refptr = refptr.next;
			 mainptr = mainptr.next;
		 }
		  
         return mainptr;
	 }
	 public listnode RemoveDuplecateFromSortedLinkedList(listnode head) {
		 listnode current = head;
		 while(current != null && current.next != null) {
			 if(current.data == current.next.data)current.next = current.next.next;
			 else
				 current = current.next;
		 }
		 return head;
	 }
	 public listnode InsertSortedSinglyLinkedList(int num, listnode head) {
		 listnode current = head;
		 listnode temp = null;
		 listnode newNode = new listnode(num);
		 while(current != null && current.data < newNode.data ) {
			temp = current;
			 current = current.next; 
		 }
		 newNode.next = current;
		 temp.next = newNode;
		 return head;
	 }
	 public listnode RemoveGivenKey(int key, listnode head) {
		 listnode current = head;
		 listnode temp = null;
		 while(current != null && current.data != key) {
			 temp = current;
			 current = current.next;
		 }
		 if (current == null)return null;
		 temp.next = current.next;
		 return head;
	 }
	 public boolean DetectLoop (listnode head) {
		 listnode fastptr = head;
		 listnode slowptr = head;
		 while (fastptr != null && fastptr.next != null) {
			 fastptr =  fastptr.next.next;
			 slowptr = slowptr.next;
			 if(slowptr == fastptr)return true;
		 }
		 return false;
	 }
	 public void MakeLoop (int position, listnode head  ) {
	 if(head == null && position <1) return ;
	 listnode current = head;
	 listnode loopNode = null;
	 int count = 1;
	 while(current != null && count < position) {
		 current = current.next;
		 count++;
	 }
	 loopNode = current;
	 while(current.next != null) {
		 current = current.next;
	 }
	 current.next = loopNode;
	 }
	 public listnode DetectionLoopGetStarting (listnode head) {
		 listnode fastptr = head;
		 listnode slowptr = head;
		 while (fastptr != null && fastptr.next != null) {
			 fastptr =  fastptr.next.next;
			 slowptr = slowptr.next;
			 if(slowptr == fastptr)return GetStarting(slowptr,head);
		 }
		 return null;
	 }
     public listnode GetStarting(listnode slowptr,listnode head) {
    	 listnode temp = head;
    	 while(slowptr != temp) {
    		 temp = temp.next;
    		 slowptr = slowptr.next;
    	 }
    	 return temp;
     }
     public listnode RemoveLoopLinkedList (listnode head) {
		 listnode fastptr = head;
		 listnode slowptr = head;
		 while (fastptr != null && fastptr.next != null) {
			 fastptr =  fastptr.next.next;
			 slowptr = slowptr.next;
			 if(slowptr == fastptr)return RemoveLoop(slowptr,head);
		 }
		 return null;
	 }
     public listnode RemoveLoop(listnode slowptr, listnode head) {
    listnode temp = head;
    while(slowptr.next != temp.next) {
    	temp = temp.next;
    	slowptr = slowptr.next;
    }
    slowptr.next = null;
    return slowptr;
     }
     public listnode MergeSortedList(listnode a, listnode b) {
    	 listnode dummy = new listnode(0);
    	 listnode tail = dummy;
    	 while(a != null && b!= null) {
    		 if(a.data < b.data) {tail.next = a; a = a.next; }
    		 else{tail.next = b; b = b.next;}
    		 tail = tail.next;
    	 }
    	 if(a == null) tail.next = b;
		 else tail.next = a;
    	 return dummy.next;
     }
     public listnode Add(listnode a, listnode b) {
    	 listnode dummy = new listnode(0);
    	 listnode tail = dummy;
    	 int carry = 0;
    	 while(a != null || b != null) {
    		 int x = (a != null)?a.data :0;
    		 int y = (b != null)?b.data :0;
    		 int sum = carry + x + y;
    		 carry = sum/10;
    		 tail.next = new listnode(sum%10);
    		 tail  = tail.next;
    		 if(a != null) a = a.next;
    		 if(b != null) b = b.next;   	
    	 }
    	 if(carry > 0)
    		 tail.next = new listnode (carry);
    	 return dummy.next;
    	 
     }
	 public String IsEmpty() {
		 if(count == 0) {return "YES";}
		 return "NO";
	 }
         public  static	void main(String args[]) {
		SiglyLinkedList sl = new SiglyLinkedList ();	
		sl.InsertAtTheBeggining(99);
		sl.InsertAtTheBeggining(99);
		sl.InsertAtTheBeggining(110);
		sl.InsertAtTheBeggining(120);
		sl.InsertAtTheBeggining(130);
		sl.InsertAtTheBeggining(140);
		sl.InsertAtTheBeggining(150);
		sl.InsertAtTheEnding(98); 
		sl.InsertAtTheEnding(98); 
		sl.InsertAtTheEnding(98);
		sl.InsertAtThePosition( 98, 4);
		sl.display(sl.head);
		System.out.println(" ");
		System.out.println("NumberOfNodes are "+sl.count);
		listnode deletefirst = sl.DeleteFirst();
		sl.display(sl.head);
		System.out.println(" ");
		System.out.println("NumberOfNodes are "+sl.count);
		listnode deletelast = sl.DeleteLast();
		sl.display(sl.head);
		System.out.println(" ");
		System.out.println("NumberOfNodes are "+sl.count);
		sl.DeleteAtPosition(3);
		sl.display(sl.head);
		System.out.println(" ");
		System.out.println("NumberOfNodes are "+sl.count);
		System.out.println("DATA PRESENT : "+sl.IsPresent(8));
		String Empty = sl.IsEmpty();
		System.out.println("empty : "+Empty);
		listnode reverselist = sl.ReverseLinkedList(sl.head);
		System.out.println("After Reversing LinkedList ");
		sl.display(reverselist);
		System.out.println(" ");
		listnode nthnodefromlast = sl.NthNodeFromLast(2,reverselist);
		System.out.println( "2 node from last is "+nthnodefromlast.data);
		listnode RemoveDuplecateFromSortedLinkedList = sl.RemoveDuplecateFromSortedLinkedList(reverselist);
		sl.display(RemoveDuplecateFromSortedLinkedList);
		System.out.println(" ");
		listnode InsertSortedSinglyLinkedList = sl.InsertSortedSinglyLinkedList(115,reverselist);
		sl.display(InsertSortedSinglyLinkedList);
		System.out.println(" ");
		listnode RemoveGivenKey = sl.RemoveGivenKey(115, reverselist);
		sl.display(RemoveGivenKey);
		System.out.println(" ");
		sl.MakeLoop (4,reverselist);
		boolean DetectLoop  = sl.DetectLoop (reverselist);
		if(DetectLoop)
		            System.out.println("LOOP is DETECTED ");
		else
		            System.out.println("LOOP is NOT DETECTED  ");
		
		 listnode DetectionLoopGetStarting =  sl.DetectionLoopGetStarting (reverselist);
		 System.out.println("STARTING LOOP VALUE "+DetectionLoopGetStarting.data);
		 listnode RemoveLoopLinkedList = sl.RemoveLoopLinkedList (reverselist);
		 System.out.println("LOOP IS REMOVED (ENDING) " + RemoveLoopLinkedList.data+" SET TO NULL");
		 boolean detectLoop  = sl.DetectLoop (reverselist);
			if(detectLoop)
			            System.out.println("LOOP is DETECTED ");
			else
			            System.out.println("LOOP is NOT DETECTED  ");
			SiglyLinkedList sl2 = new SiglyLinkedList ();	
			sl2.InsertAtTheEnding(90); 
			sl2.InsertAtTheEnding(111);
			sl2.InsertAtTheEnding(125);
			sl2.InsertAtTheEnding(135);
			sl2.InsertAtTheEnding(145);
			sl2.InsertAtTheEnding(150);
			System.out.print("2nd linkedlist is  ");
			sl2.display(sl2.head);
			System.out.println(" ");
			SiglyLinkedList sl3 = new SiglyLinkedList ();
			listnode MergeSortedList = sl3.MergeSortedList(reverselist, sl2.head);
			sl3.display(MergeSortedList);
			System.out.println(" ");
			SiglyLinkedList sl4 = new SiglyLinkedList ();
			sl4.InsertAtTheEnding(7); 
			sl4.InsertAtTheEnding(4);
			sl4.InsertAtTheEnding(9);
			SiglyLinkedList sl5 = new SiglyLinkedList ();
			sl5.InsertAtTheEnding(5); 
			sl5.InsertAtTheEnding(6);
			listnode Add = sl.Add(sl4.head, sl5.head);
			listnode Addreverselist = sl.ReverseLinkedList(Add);
			System.out.print("ADDLinkedList a : ");	
			listnode LinkedListA = sl.ReverseLinkedList(sl4.head);
			sl.display(LinkedListA);
			System.out.println(" ");
			System.out.print("ADDLinkedList b: ");	
			listnode LinkedListB = sl.ReverseLinkedList(sl5.head);
			sl.display(LinkedListB);
			System.out.println(" ");
			System.out.print("After Reversing ADDLinkedList : ");		
			sl.display(Addreverselist);
			System.out.println(" ");
			
         }  

}

