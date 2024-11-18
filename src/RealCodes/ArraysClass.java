package RealCodes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
/*class Student implements Comparable<Student>{ //Comparable calls  compareTo
	int rollno;
	String name;
	public Student(int rollno,String name) {
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "["+this.name+":"+this.rollno+"]";
	}
	@Override
	public int compareTo(Student student) {
		return this.rollno - student.rollno;
	}
}

*/
class Student { 
	int rollno;
	String name;
	public Student(int rollno,String name) {
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "["+this.rollno +":"+this.name+"]";
	}
	/*
	equals method returns true if the reference point to the same object in the memory.
	  Arrays.binarySearch(null, null, null) -> internally uses the equals method to search
	*/
	@Override
	public boolean equals(Object obj) {
		Student s = (Student)obj;//       input    .                arrayvalue
		System.out.println(s.name);
		return this.name.equalsIgnoreCase(s.name) && this.rollno == s.rollno  ;
	}
	public int getRollnumber() {
		return rollno ;
	}
	
}
class RollNoComparator implements Comparator<Student>{//Comparator calls  compare

	@Override
	public int compare(Student o1, Student o2) {
		//asending
		if(o1.getRollnumber() > o2.getRollnumber()) return 1;
		if(o1.getRollnumber() < o2.getRollnumber()) return -1;	
		return 0;
		/*
		 desending
		 if(o1.getRollnumber() > o2.getRollnumber()) return -1;
		if(o1.getRollnumber() < o2.getRollnumber()) return 1;	
		return 0;
		 */
	}
	
}
public class ArraysClass {
	 private static int generator(int a) {
		 return a+10;
	 }
	public static void main(String[] args) {
		Student x[] = new Student[] {new Student(1,"julie"),new Student(3,"adam"),new Student(2,"robert")};
   // List<Student> list = Arrays.asList(x);
	//	Integer a[] = new Integer[] {10,90,30,40,20,500};
		//Arrays.sort(a);
	//	Arrays.sort(x);
   //  List<Integer> list1 = Arrays.asList(a);//Returns a fixed-size list
   //  list.add(5);java.lang.UnsupportedOperationException. we coudnt add element in list.
   //  System.out.println("list "+list1);
     //int key = 35;
    // int retval = Arrays.binarySearch(a, key);
    // System.out.println("key is "+retval);
     //Student searchval = new Student(3,"c");
    // int retval1 = Arrays.binarySearch(x, 0/* included */, 3/* excluded */, searchval);
   //  System.out.println("list "+list);
    // System.out.println("key is "+retval1);
     
   
                          //comparator section
     RollNoComparator comparator = new RollNoComparator();
     Arrays.sort(x,comparator);
     Student searchval = new Student(1,"vasanth");
    // int retval2 = Arrays.binarySearch(x,searchval); 
     int retval3 = Arrays.binarySearch(x, searchval,comparator);
     for(Student y : x)
     System.out.println(y);
   // List<Student>list = Arrays.asList(x);
    // System.out.println(list);
     
     
                  //copying array of object into another array of object
     System.out.println("copied array");
     Student studentarraycopy[] = Arrays.copyOf(x,x.length);
     for(Student y :studentarraycopy)
     System.out.println(y);
     
     
     //copying array RANGE of object into another array of object
     System.out.println("copied Range array");
     Student[] copyrangearr = Arrays.copyOfRange(x,0, 5);
     for(Student y : copyrangearr)
         System.out.println(y);
     
     
     
     //FILL method
Student y[] = new Student[] {new Student(10,"hi"),new Student(11,"this"),new Student(12,"is")};
  Student replacement = new Student(10,"vasanth");   
    Arrays.fill(y, 0, 2, replacement); 
    for(Student z : y)
        System.out.println(z); 
     
    
    
    
    
    
    
    
    
    //MISMATCH of array
Student q[] = new Student[] {new Student(10,"hi"),new Student(11,"this"),new Student(12,"is")};   
Student w[] = new Student[] {new Student(10,"hi"),new Student(11,"this"),new Student(12,"is")};    
 int mismatch = Arrays.mismatch(q, w);
 if(mismatch == -1) System.out.println("arrays are  matched"); 
 else   System.out.println("Sub_arrays are not matched"); 
 int mismatch1 = Arrays.mismatch(q, 0, 2, w, 0, 2);   
 if(mismatch == -1) System.out.println("arrays are  matched"); 
 else   System.out.println("Sub_arrays are not matched"); 
 
 
 //SETALL 
 int arr1[] = {1,2,3,4,5,6,7,8,9,10};
 Arrays.setAll(arr1, i->arr1[i]+10);
 for(int a: arr1)
	 System.out.print(a+" ");
 System.out.println(" "); 
 IntUnaryOperator generator = i ->arr1[i]+10;
 Arrays.setAll(arr1, generator);
 for(int a: arr1)
	 System.out.print(a+" ");
 System.out.println(" ");
 Arrays.setAll(arr1, i->generator(arr1[i]));
 for(int a: arr1)
	 System.out.print(a+" ");
 System.out.println(" ");
 
 //STREAM  - if stream is stored values are used once, otherwise multipletimes.
 IntStream a = Arrays.stream(arr1, 0, 5);
 a.forEach(i->System.out.print(i+" "));
 System.out.println(" ");
 //a.forEach(i->System.out.print(i+" "));       java.lang.IllegalStateException
// System.out.println(" ");
 Arrays.stream(arr1, 0, 5).forEach(i->System.out.print(i+" "));
 Arrays.stream(arr1, 0, 5).forEach(i->System.out.print(i+" "));
 Arrays.stream(arr1, 0, 5).forEach(i->System.out.print(i+" ")); System.out.println("........");
 Arrays.stream(q, 0, 3).forEach(i->System.out.print(i+" "));System.out.println(" ");
 Arrays.stream(q, 0, 3).forEach(i->System.out.print(i+" "));System.out.println(" ");
 Arrays.stream(q, 0, 3).forEach(i->System.out.print(i+" "));System.out.println(" ");
 
	}


}
