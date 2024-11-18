package javavideosonline;
class Q{
	 boolean valueset = false;
	int num;
	public synchronized void  put (int num) throws InterruptedException {		
		this.num = num;
		while(valueset) {
			wait();	
		}
		System.out.println( "PUT" +num);
		notify();
		valueset=true;
	}
	public synchronized void  get () throws InterruptedException {
		while(!valueset) {
			wait();
		}
		System.out.println("GET" + num);
		notify();
		valueset = false;
	}	
}
class producer implements Runnable{ 
	Q q;
	public producer(Q q) {
		this.q= q;
		Thread t = new Thread(this,"producer");
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(true) {
			try {
				q.put(i++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		             }
	                 }	
}
class consumer implements Runnable{ 
	Q q;
	public consumer(Q q) {
		this.q= q;
		Thread t = new Thread(this,"producer");
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(true) {
			try {
				q.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		             }
	                 }	
}

public class interthreadcommunication {
          public static void main(String [] args)
          {
        	  Q q = new Q();
        	  new producer(q);
        	  new consumer(q);
          }
          
}
