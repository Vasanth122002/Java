package RealCodes.threadfolder;
/*
  when a thread  invokes a synchronized method.
  it automatically acquires the lock for that object and releases it
   when the thread completes its task.
 */


public class WithSynchronization {
	class table{
		public synchronized void print (int n)  {
			for(int i=1;i<=5;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
	
					e.printStackTrace();
				}
			}
		}
	}
	class thread extends Thread{
		table t;
		thread(table t){
			this.t = t;
		}
		public void run()  {
			t.print(5);
		}
	}


	class thread1 extends Thread{
		table t;
		thread1(table t){
			this.t = t;
		}
		public void run() {
			t.print(100);
		}
	}
	public static void main(String[] args) {
		WithSynchronization a= new WithSynchronization();
		table t = a.new table();
         thread t1 = a.new thread(t);  
         thread1 t2 = a.new thread1(t); 
         t1.start();
         t2.start();

	}

}
