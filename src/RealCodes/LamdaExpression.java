package RealCodes;
@FunctionalInterface
interface a{
	void show(String a);
	//Object Class Methods are allowed -example hashcode() , getclass()...
	String toString();
}
class b implements a{

	@Override
	public void show(String b) {
		System.out.println("Hi"+b);
		
	}
	@Override
	public String toString() {
		return "this is tostring method";
	}
	
}
public class LamdaExpression {
	
public static void main(String args[]) {
//	a obj = new a() {
//		public void show() 
//		{
//			System.out.println("Hi");
//		}
//	};
//	obj.show();
	a obj = (a)->System.out.println("Hi "+a);	
	obj.show("vasanth");
	
//	
//	b object = new b();
//	object.show("hii");
//	System.out.println(object);
}
}
