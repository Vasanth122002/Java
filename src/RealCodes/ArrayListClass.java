package RealCodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

/*
Java ArrayList can contain Duplicate elements.
maintains insertion order. Non synchronized.
slower than LinkedList because lot of shifting needs to occur if any element is removed from ArrayList.
Can't create primitive type of ArrayList. example -ArrayList<int> al = ArrayList<int>(); - doesn't work.
size is varied according to the elements.
non generic ArrayList. example - ArrayList list = new ArrayList();
 
 */
public class ArrayListClass implements Comparator{
 class Student{
	 int rollno;
	 String name;
	 int age;
	 Student(int rollno, String name , int age){
		 this.rollno = rollno;
		 this.name = name;
		 this.age = age;
	 }
	 @Override
	 public String toString() {
		 return rollno+" : "+name+" : "+age;
	 }
	 
 }
	public static void main(String[] args) {
		ArrayListClass a = new ArrayListClass();
	
		
		
		ArrayList <String> al = new ArrayList<>();
		al.add("Mango");//Inside add is Object.
		al.add("Apple");
		al.add("Banana");
	
       	//AddAll working
		
		ArrayList <String> al1 = new ArrayList<>();
		//System.out.println();
		//IsEmpty
		System.out.println("Is ArrayList  Empty : "+al1.isEmpty());
		al1.add("Berry");
		al1.add("Orange");
		al1.add("Apple");
		al1.addAll(al);
		System.out.println("Adding ArrayList to another ArrayList "+al1);
		
		//retainAll() working
		al1.retainAll(al);
		System.out.println("After Retainig ArrayList elements are  "+al1);
		
		
		System.out.println("Before Sorting...");
		Iterator<String> i = al.iterator();
		while(i.hasNext()) {
			String element = i.next();
			System.out.println(element);	
		}
		System.out.println("Index 1 is before "+al.get(1));
		al.set(1,"Dates");
		System.out.println("Index 1 is now "+al.get(1));
		System.out.println("After Sorting...");
		Comparator c  = new ArrayListClass ();
	      al.sort(c);
	  	Iterator<String> ii = al.iterator();
		while(ii.hasNext()) {
			String e = ii.next();
			System.out.println(e);	
		}
		//ListIteraror - Reverse Order
		System.out.println("Traversing through the reverse Order(ListIterator)");
		/*
		 size() - checks in the ArrayList if any Objects are present it returns 
		 number of objects as int value, otherwise 0. capacity in the ArrayList is -ex
		 ArrayList <Integer> a = new ArrayList(capacity);
		                                          ^
		                                          |
		                                        (10);
		 */
		ListIterator<String> lii = al.listIterator(al.size());
		while(lii.hasPrevious()) {
			String ee = lii.previous();
			System.out.println(ee);	
		}
		
		//Traversing through the for each method
		System.out.println("Traversing through the for each() method ");
		al.forEach(aq->{
			System.out.println("ArrayList Elements are  "+aq);
		});
		// Objects in ArrayList
		ArrayList <Student> alist = new ArrayList<>();
		Student s1 =a. new Student(101,"sonoo",23);
		Student s2 =a. new Student(102,"Ravi",21);
		Student s3 =a. new Student(103,"Hanumat",25);
		alist.add(s1);
		alist.add(s2);
		alist.add(s3);
		System.out.println("Before Removing , Objects in ArrayList are "+alist);
		Iterator itr1 = alist.iterator();
		while(itr1.hasNext()) {
			Student st = (Student)itr1.next();
			System.out.println(st.rollno+" : "+st.name+" : "+st.age);
		}
		//removing
		alist.remove(0);
		//Remove the first occurrence.
		alist.remove( a. new Student(103,"Hanumat",25));
		System.out.println("After Removing , Objects in ArrayList are "+alist);
		Iterator itr2 = alist.iterator();
		while(itr2.hasNext()) {
			Student st = (Student)itr2.next();
			System.out.println(st.rollno+" : "+st.name+" : "+st.age);
		}
	}

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String)o1;
		String s2 = (String)o2;
		if(s1.length()<s2.length())return 1;
		if(s1.length()>s2.length())return -1;
		return 0;
	}

}
