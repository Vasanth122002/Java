package RealCodes;

public class StackArray {
private int top;
private int arr[];
 public void push (int data) {
	 if(IsFull()) {throw new RuntimeException("Stack is full");}
	 top++;
	 arr[top] = data;
 }
 public int pop() {
	 if(IsEmpty()){throw new RuntimeException("Stack is full");}
	 int result = arr[top];
	 top--;
	 return result;
 }
 public int peek() {
	 return arr[top];
 }
 public void display() {
	 for(int i=0;i<=top;i++) {
		 System.out.print( arr[i]+"-->");
	 }
	 System.out.println(" ");
 }
 public boolean IsEmpty() {return top < 0;}
 public boolean IsFull() {return arr.length == size();}
 public int size() {return top+1;}
 public StackArray() {
	 arr = new int[10];
	 top=-1; 
 }
 public static void main(String args[]) {
	 StackArray sa = new StackArray();
	 sa.push(5);
	 sa.push(10);
	 sa.push(15);
	 sa.push(20);
	 sa.push(25);
	 sa.display();
	 sa.pop();
	 sa.display();
	 sa.push(30);
	 sa.push(35);
	 sa.push(40);
	 sa.display();
	 System.out.println( sa.peek());
 }
}
