package RealCodes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableInterface {
public static void main(String args[]) {
	List<String > list = new ArrayList<>();
	list.add("hi");
	list.add("this");
	list.add("is");
	list.add("vasanth");
	Iterator<String> i = list.iterator();
	while(i.hasNext()) {
		String element = i.next();
		System.out.println(element);	
	}
	
	System.out.println("ArrayList are "+list);
	//System.out.println();
}
}
