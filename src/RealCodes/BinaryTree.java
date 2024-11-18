package RealCodes;

public class BinaryTree {
 private treenode root;
 public class treenode{
	 private treenode left;
	 private treenode right;
	 private int data;
	 public treenode(int data) {
		 this.data = data;
	 }
 }
 public void preorder(treenode root) {
	 if(root == null)return;
	 System.out.print(root.data);
	 preorder(root.left);
	 preorder(root.right);
 }
 public void preorder_stack() {
	 if(root == null)return;
	 Stack stack = new Stack();
	 stack.push(root);
	 while(!stack.IsEmpty()) {
		 treenode temp = stack.pop();
		 System.out.print(temp.data);
		 if(temp.right != null)stack.push(temp.right);
		 if(temp.left != null)stack.push(temp.left);
	 }
 }
 public void Inorder(treenode root) {
	 if(root == null)return;
	 Inorder(root.left);
	 System.out.print(root.data);
	 Inorder(root.right);
 }
 public void Inorder_stack() {
	 if(root == null) return;
	 Stack stack = new Stack();
	 treenode temp = root;
	 while(!stack.IsEmpty() || temp != null) {
		 if(temp != null) {
			 stack.push(temp);
			 temp = temp.left;
		 }
		 else {
			 temp = stack.pop();
			 System.out.print(temp.data+" ");
			 temp = temp.right;
		 }
	 }
 }
 public void Postorder(treenode root) {
	 if(root == null)return;
	 Postorder(root.left);
	 Postorder(root.right);
	 System.out.println(root.data);
 }
 
 public void PostOrderStack() {
	 treenode current = root;
	 Stack stack = new Stack();
	 while(current != null || !stack.IsEmpty()) {
		 if(current != null) {
			 stack.push(current);
			 current = current.left;
			 
		 }else {
			 treenode temp  = stack.peek().right;
			 if(temp == null) {
				 temp = stack.pop();
				 System.out.print(temp.data+" ");
				 while(!stack.IsEmpty() && temp == stack.peek().right) {
					 temp = stack.pop();
					 System.out.print(temp.data+" ");
				 }
			 }else {
				 current = temp;
			 }
		 }
	 }
 }
public void LevelOrederTraversal() {
	if(root == null)return;
	 Queue q = new Queue();
	 q.InsertElement_EnQueue(root);
	 while(q != null) {
		 treenode temp = q.DeQueue();
		 System.out.print(temp.data+" ");
		 if(temp.left != null)q.InsertElement_EnQueue(temp.left);
		 if(temp.right != null)q.InsertElement_EnQueue(temp.right);
		 
	 }
}
 
public int FindMax(treenode root) {
	if(root == null)return Integer.MIN_VALUE;
	int result = root.data;
	int left = FindMax(root.left);
	int right = FindMax(root.right);
	if(left > result) result = left;
	if(right > result)result = right;
	return result;
} 
public void CreateBinaryTree() {
	treenode first = new treenode(1);
	treenode second = new treenode(2);
	treenode third = new treenode(3);
	treenode fourth = new treenode(4);
	treenode fifth = new treenode(5);
	treenode sixth = new treenode(6);
	treenode seventh = new treenode(7);
	root = first;
	first.left = second;
	first.right = third;
	second.left = fourth;
	second.right = fifth;
	third.left = sixth;
	third.right = seventh;
}


 public static void main(String args[]) {
	 BinaryTree b = new BinaryTree();
	 b.CreateBinaryTree();
     b.LevelOrederTraversal();
   
 }
 }
 
 
 
 
 
 
 
 
 
 
 

