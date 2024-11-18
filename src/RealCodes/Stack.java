package RealCodes;

import RealCodes.BinaryTree.treenode;

class Stack{
	private listnode top;
	private int length;
	public class listnode{
		treenode data;
		listnode next;
		public listnode(treenode root) {this.data = root;}
	}
	public void push(treenode root) {
		listnode temp = new listnode(root);
		temp.next = top;
		top = temp;
		length++;
	}
	public treenode pop() {
		treenode result = top.data;
		top = top.next;
		return result;
	}
	public treenode peek() {
		return top.data;
	}
	public Stack() {
		top = null;
	    length =0;
	}
	public int length() {return length;}
	public boolean IsEmpty() {return length == 0;}
	public static void main(String args[]) {
		
		Stack s = new Stack();

}
}
