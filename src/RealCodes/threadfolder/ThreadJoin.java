package RealCodes.threadfolder;
/*
 when the join() invoked, the current thread stops its execution and the thread goes into wait state.
 the current thread remains in the wait state until the thread on which the join() is invoked has 
 achieved its dead state. if the interruption of the thread occurs it throws exception.
 
 
 */
public class ThreadJoin {
class counter{
	int count;
	public synchronized void  Increment(){
		count++;
	}
}
	public static void main(String[] args) throws InterruptedException {
		ThreadJoin j = new ThreadJoin();
		ThreadJoin.counter c = j.new counter();
		Runnable obj = ()->{
			for(int i =0 ;i<1000;i++) {
				c.Increment();
				
			}
		};
		
		Runnable obj1 = ()->{
			for(int i =0 ;i<1000;i++) {
				c.Increment();
			}
		};
		
		
		
		Thread t = new Thread(obj);
		Thread t1 = new Thread(obj1);
		t.start();
		t1.start();
		t.join();
		t1.join();
		Thread.sleep(2000);
		System.out.println(c.count);
	}

}
