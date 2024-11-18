package RealCodes;
/*
Deque is an Interface. it is double ended queue. 
it supports addition or removal of elements from both the end of queue.
it can either used as a queue or stack.








 */
import java.util.*;
public class DequeInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Deque<Integer> deque = new ArrayDeque<>();
 deque.addFirst(2);
 deque.addFirst(1);
 deque.addLast(12);
 System.out.println("deque size is "+deque.size());
 System.out.println(deque);
 int first = deque.removeFirst();
 int last = deque.removeLast();
 System.out.println(deque);
 System.out.println("first_element is "+first+" last_element is "+last);
	}

}
