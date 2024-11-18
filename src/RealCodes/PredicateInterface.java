package RealCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
// it is a interface. returns t ||f
//in collection
class user{
	String name,role;
	user(String name, String role){
		this.name = name;
		this.role = role;
	}
	public String getname() {
		return name;
	}
	public String getrole() {
		return role;
	}
	@Override
	public String toString() {
		return "User Name : "+name+" Role : "+role;
	}
}
public class PredicateInterface {
public static void main(String args[]) {
	List<user> users = new ArrayList<>();
	users.add(new user("John","admin"));
	users.add(new user("Peter","member"));users.add(new user("baby","admin"));
	users.add(new user("sig","member"));users.add(new user("neme","admin"));
	System.out.println(users);
	List<user> admins;
	admins = process(users,(user u)->u.getrole().equals("admin"));
	System.out.println(admins);
	Predicate<Integer> p = no-> no>10;
	Predicate<Integer> greater = no-> no>10;
	Predicate<Integer> lesser = no-> no<100;
	System.out.println(greater.and(lesser).test(20));
	System.out.println(greater.or(lesser).test(200));
	System.out.println(greater.and(lesser).negate().test(20));
	System.out.println(p.test(20));
	pred(10,i->i>5);
	Predicate<String> containsletter = p1 -> p1.contains("A");
	String containsA = "And";
	boolean outcome = hasLengthOf10.or(containsletter).test(containsA);
	System.out.println(outcome);
}
public static List<user> process(List<user>users,Predicate<user> predicate){
	List<user> result = new ArrayList<user>();
	for(user u : users) {
		if(predicate.test(u))result.add(u);
	}
	return result;
}
public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
	@Override
	public boolean test(String t) {
		return t.length()>10;
	}
};
private static void pred(int i,Predicate<Integer> predicate) {
	if(predicate.test(i))System.out.println("number is "+i);
	
        }
}
