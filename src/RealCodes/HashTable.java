package RealCodes;
public class HashTable {
private HashNode[] buckets;
private int numOfBuckets;
private int size;
public HashTable(int capacity) {
	this.numOfBuckets = capacity;
	this.buckets = new HashNode[numOfBuckets];
	this.size = 0;
}
public class HashNode{
private Integer key;
private String value;
private HashNode next;
public HashNode(int key, String value) {
	this.key = key;
	this.value = value;
}
}
public int size() {
	return size;
}
public boolean IsEmpty() {
	return size == 0;
}
public void Put(Integer key , String value) {
	if(key == null || value == null)throw new IllegalArgumentException("key or value is null");
int bucketIndex = getBucketIndex(key);
HashNode head = buckets[bucketIndex];
while(head!= null) {
	if(head.key.equals(key)) {head.value = value;return;}
	head = head.next;
}
size++;
head = buckets[bucketIndex];
HashNode node = new HashNode(key,value);
node.next = head;
buckets[bucketIndex] = node;
}
private int getBucketIndex(Integer key) {
	
	return key % numOfBuckets ;
} 
public String get(Integer key) {
	if(key == null)throw new IllegalArgumentException("key or value is null");
	int bucketIndex = getBucketIndex(key);
	HashNode head = buckets[bucketIndex];
	while(head != null) {
	   if(head.key.equals(key)) {
		   return head.value;
	   }
	   head = head.next;
	}
	return null;
}
public String remove(Integer key) {
	int bucketIndex = getBucketIndex(key);
	HashNode head = buckets[bucketIndex];
	HashNode previous = null;
	while(head != null) {
	if(head.key.equals(key)) {break;}
	previous = head;
	head = head.next;
	}
	if(head == null)return null;
	if(previous != null) {
		previous.next = head.next;
	}else {
		buckets[bucketIndex] = head.next;
	}
	size--;
	return head.value;
}
public static void main(String args[]) {
	HashTable ht = new HashTable(10);
ht.Put(105, "tom");
ht.Put(21, "sana");
ht.Put(21, "harry");
ht.Put(31, "dinesh");
System.out.println(ht.size());
System.out.println(ht.get(31));
System.out.println(ht.get(21));
System.out.println(ht.get(3));
ht.remove(21);
System.out.println(ht.size());
System.out.println(ht.get(21));
}


}
