package RealCodes;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class CollectionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Collection<String> list = new LinkedList();
list.add("vasanth");
list.add("for");
list.add("vasanth");
Object array[] = new Object[list.size()];
array = list.toArray();
System.out.println("list elements are "+list);
System.out.println("array elements are "+Arrays.toString(array));//SEE
	}

}
