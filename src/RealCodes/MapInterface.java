package RealCodes;
import java.util.*;
public class MapInterface {
	
	/*
 static map using Map.of()
static map means that the map becomes the class member and can be used using class.
APPROACH
--------
1. pass the map values as key,value pairs in the Map.of() method
2.a static factory map is returned
3. store it in map and use i.

	 */
private static Map<String,String> mapp = Map.of(
		"1","v",
		"2","a",   
		"3","s",
		"4","a", //everytime if run code the postion of key_value pair changes
		"5","n",// maximum 10 key ,value. not more than 10.
		"6","t",
		"7","h",
		"8","m",
		"9","m",
		"10","m"
		
		);	
	
	
	
 public static void main(String args[]) {
	 //   key  , value
	 Map<String,Integer> map = new HashMap<String,Integer>();
	 map.put("v",10);
	 map.put("v",20);
	 map.put("va",30);
	 map.put("vasa",40);
	 map.put("vasan",40);
	 map.put("vasath",40);
	// System.out.println( map);
	 System.out.println( map.toString());
	 System.out.println( map.get("vasa"));//return value or null
	 System.out.println("Initial mapping are "+ map);
	 System.out.println("the set are "+ map.entrySet());
	 System.out.println( map.remove("vasanth"));
	 System.out.println(  "values are "+map.values());
	 System.out.println( "keys are "+map.keySet());
	 int k = map.getOrDefault("va", 0);//key, default_value. if key is present it will sent key_value otherwise it will return default_value
	 System.out.println(k);
	 System.out.println(mapp);
	// System.out.println(mapp.put("1", "qwe"));  java.lang.UnsupportedOperationException
	 System.out.println(mapp.hashCode());
 }
}
