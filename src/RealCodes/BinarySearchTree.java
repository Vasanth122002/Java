package RealCodes;
public class BinarySearchTree {
	 private treenode root;
	 public class treenode{
		 private treenode left;
		 private treenode right;
		 private int data;
		 public treenode(int data) {
			 this.data = data;
		 }
	 }
	 public void insert(int value) {
		 root = Insert_BinarySearchTree(root , value);
	 }
	public treenode Insert_BinarySearchTree(treenode root ,int value) {
		if(root == null) {
			root = new treenode(value);
			return root;
		}
		if(value < root.data) {
			root.left = Insert_BinarySearchTree(root.left , value);
		}
		if(value > root.data) {
			root.right = Insert_BinarySearchTree(root.right , value);
		}
		return root;
	}
	public void InOrder() {
		inorder(root);
	}
	public void inorder(treenode root) {
		if(root == null)return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public treenode search(int key) {
		return Search( root ,  key);
	}
	public treenode Search(treenode root , int key) {
		if(root == null || root.data == key) return root;
		if(key < root.data)  return Search(root.left,key);
		else  return  Search(root.right,key);
	}
	public boolean isvaild() {
		return IsValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
	}
	public boolean IsValid(treenode root ,long min, long max) {
		if(root == null)return true;
		if(root.data <= min || root.data >= max) {
			return false;
		}
		boolean left = IsValid(root.left,min,root.data);
		if(left) {
			boolean right = IsValid(root.right,root.data,max);
			return right;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree  bst = new BinarySearchTree ();
		bst.insert(5);
		bst.insert(3);
		bst.insert(7);
		bst.insert(1);
		bst.InOrder();
		System.out.println("");
		if( null != bst.search(0)) {
			System.out.println("Key Found!!!");
		}else {
			System.out.println("Key Not Found");
		}
		if(bst.isvaild()){
			System.out.println("BINARY_SEARCH_TREE IS VAILD");
		}else {
			System.out.println("BINARY_SEARCH_TREE IS NOT VAILD");
		}
			
			
			
			
			
			
		}

}
