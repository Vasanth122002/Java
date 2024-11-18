package RealCodes;

import java.util.NoSuchElementException;

import RealCodes.BinaryTree.treenode;

public class Queue {
  private listnode front;
  private listnode rear;
  private int length;
  private class listnode{
	  
	  private treenode data;
	  private listnode next;
	  public listnode(treenode root) {
		  this.data = root;
		  this.next = null;
	  }
  }
  public int length () {
	  return length;
  }
  public boolean IsEmpty() {
	  return length == 0;
  }
  public void InsertElement_EnQueue(treenode root){
	  listnode temp = new listnode(root);
	  if(IsEmpty())front = temp;
	  else rear.next = temp;
	  rear = temp;
	  length++;
  }
  public void Display() {
	  if(IsEmpty()) return;
	  listnode current = front;
	  while(current != null) {
		  System.out.print(current.data+"-->");
		  current = current.next;
	  }
	  System.out.println("null"); 
  }
  public treenode DeQueue() {
	  if(IsEmpty()) throw new NoSuchElementException("QUEUE IS ALREADY EMPTY");
	  treenode data = front.data;
	  front = front.next;
	  if(front == null) rear = null;
	  length--;
	 return data; 
  } 
  public void Queue() {
	  this.front = null;
	  this.rear = null;
	  this.length = 0;
  }
  public static void main(String args[]) {
	  Queue q = new Queue();

	  
  }
}
